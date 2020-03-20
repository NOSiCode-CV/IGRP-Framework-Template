(function(){
	
	var utils = GIS.module('utils');
	
	function MeasurementWidget( widget, app ){
		
		var Result = {length : null, area: null},
		
		 	Map     = app.map.view,
		 	
		 	DrawLayer, DrawControl, DrawTool, EditTool, Tooltip;
		 					
		function RemoveDrawing(){
			
	        if (!DrawLayer) return;
	      
	        Map.removeLayer(DrawLayer);
	      
	        delete DrawLayer;
	      	      
	        DrawLayer.clearLayers();
	    };
		
		function Clear(){
			
			if(DrawTool && DrawTool.disable)
				
				DrawTool.disable();
			
			if(EditTool && EditTool.disable)
				
				EditTool.disable();
			
			DrawLayer.clearLayers();			
			
			SetResult(Result);
						
			//$('.measurement-body', widget.html).removeClass('active');
						
		};
		
		function getLength(obj) {
			 
		    var distance =  L.GeometryUtil.length(obj.getLatLngs());
		    
		    return L.GeometryUtil.readableDistance(distance,'metric');
		    
		};
		
		function getArea(obj) {
			
			var latLngs  =  obj.getLatLngs();
			 			
		    var area =  L.GeometryUtil.geodesicArea(latLngs[0]);

			return L.GeometryUtil.readableArea(area, 'miles');
		  
		}
		
		function SetResult(result){
			
			widget.setTemplateParam('results', {
				
				length  	     : result.length,
				
				area			 : result.area,
				
				lastPoint        : result.lastPoint
				
			});
			
			Result = {}
			
		}
		
		function Init(){

			DrawLayer   = new L.FeatureGroup();
			
			DrawControl = new L.Control.Draw({
			    
			    edit: {
			    	
			        featureGroup: DrawLayer
			        
			    }
			    
			});
						
			EditTool   = new L.EditToolbar.Edit( Map, DrawControl.options.edit );
			
			Tooltip    = new L.Draw.Tooltip(Map);
			
			console.log(Tooltip)
						
			DrawLayer.addTo( Map );
			
			Map.on( 'click', function (e) {
				
				//widget.actions.disable();
				
			});

			Map.on( L.Draw.Event.CREATED, function (e) {
				
				var layer = e.layer;
				
				widget.actions.drawend(layer);
													
			});
			
			Map.on('draw:drawvertex', function(e){
				
				var point = e.target._lastCenter;
				
				//Result.lastPoint = point.lat +' / '+ point.lng;
				
				//console.log(Result.lastPoint)
				
				//SetResult(Result);
				
			});
			
			Map.on('draw:editvertex', function(e){
				
				console.log(e.layers)
				
				widget.actions.drawend(e.layers);
				
			});
						
		};
			    
		widget.action('measure-length', function(){
						
			widget.actions.enable();
			
			DrawControl.setDrawingOptions({
			    rectangle: {
			    	shapeOptions: {
			        	color: '#0000FF'
			        }
			    }
			});

			
			DrawTool = new L.Draw.Polyline( Map );
			
			DrawTool.enable();
									
		});
		

		widget.action('measure-area', function(){									
			
			widget.actions.enable();
			
			DrawTool = new L.Draw.Polygon( Map );
			
			DrawTool.enable();
			
		});
		
		widget.action('finish', function(){
			DrawTool.disable();
			widget.toggle();
			
		});
		
		widget.action('cancel', function(){

			Clear();	
			
			Tooltip.dispose();
			
			//console.log(Tooltip)
			
			widget.actions.activate();
			
		});
		
		widget.action('drawend', function(layer){
			
			DrawLayer.addLayer(layer);
			
			console.log(layer)
			//{String} unit 'metric' or 'imperial'
			//returns {String} in yard or miles
			if (layer instanceof L.Polygon) {
				
				Result.area = getArea(layer);
									
			}else if(layer instanceof L.Polyline){
				
				Result.length = getLength(layer);
				
			}
			
			SetResult(Result);
			
			$('.measurement-body .help', widget.html).removeClass('active');
			
		});
		
		widget.action('activate', function(){
			
			widget.actions.enable();
			
			DrawTool.enable();
			
		});
		
		widget.action('enable', function(){
			
			$('.measurement-body', widget.html).addClass('active');
			
			$('.measurement-body .help', widget.html).addClass('active')
			
		});
		
		widget.action('disable', function(){
			
			$('.measurement-body', widget.html).removeClass('active');
			
		});
		
		(function(){
			
			Init();
			
			widget.on('load-html', function(){
				
				widget.actions.disable();
				
			});
									
			widget.on('deactivate', function(){
				
				Clear();
				
				widget.actions.disable();
				
			});
			
		})();
	}
	
	GIS.widgets.register('measurement', {
		
		dependencies : {
			
			js  : [ 
					'https://cdnjs.cloudflare.com/ajax/libs/leaflet.draw/1.0.4/leaflet.draw.js',
				    'https://npmcdn.com/leaflet-geometryutil@0.9.3/src/leaflet.geometryutil.js',
				  ],
			
			css : [ 'https://cdnjs.cloudflare.com/ajax/libs/leaflet.draw/1.0.4/leaflet.draw.css' ]
				
		},
		
		init : MeasurementWidget
		
	});
	
})();
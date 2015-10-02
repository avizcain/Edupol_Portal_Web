function initialize() {


	var myLatLng = new google.maps.LatLng(52.30899,21.056414);
	var mapOptions = {
	  zoom: 16,
	  center: myLatLng,
	  mapTypeId: google.maps.MapTypeId.ROADMAP,
	  scrollwheel: false
	}
	var map = new google.maps.Map(document.getElementById('contact-map'), mapOptions);

	var image = 'images/google-map-marker.png';

	var beachMarker = new google.maps.Marker({
	    position: myLatLng,
	    map: map,
	    icon: image
	});


	google.maps.event.addDomListener(window, 'resize', function() {
		map.setCenter(myLatLng);
	});

}


$(window).load(function(){
	initialize()
});

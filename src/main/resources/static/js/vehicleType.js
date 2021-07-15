
$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicleType, status){
			$('#idEdit').val(vehicleType.id);
			$('#descriptionEdit').val(vehicleType.description);
			$('#detailsEdit').val(vehicleType.details);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicleType, status){
			$('#idDetails').val(vehicleType.id);
			$('#ddlCountryDetails').val(vehicleType.countryid);
			$('#cityDetails').val(vehicleType.city);
			$('#addressDetails').val(vehicleType.address);
			$('#descriptionDetails').val(vehicleType.description);
			$('#detailsDetails').val(vehicleType.details);
			$('#lastModifiedByDetails').val(vehicleType.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
});
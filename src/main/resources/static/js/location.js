
$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(location, status){
			$('#idEdit').val(location.id);
			$('#ddlCountryEdit').val(location.countryid);
			$('#ddlStateEdit').val(location.stateid);
			$('#cityEdit').val(location.city);
			$('#descriptionEdit').val(location.description);
			$('#detailsEdit').val(location.details);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(location, status){
			$('#idDetails').val(location.id);
			$('#ddlCountryDetails').val(location.countryid);
			$('#cityDetails').val(location.city);
			$('#addressDetails').val(location.address);
			$('#descriptionDetails').val(location.description);
			$('#detailsDetails').val(location.details);
			$('#lastModifiedByDetails').val(location.lastModifiedBy);
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
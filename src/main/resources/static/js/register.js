$('document').ready(function(){
	var pass=document.getElementById('password');
	var confirmPass=document.getElementById('confirmPassword');
	
	function validatePassword(){
		if(pass.value!=confirmPass.value){
			confirmPass.setCustomValidity("Passwords Dont match ");
		}else{
			confirmPass.setCustomValidity('')
		}
	}
	
	pass.onchange=validatePassword;
	confirmPass.onkeyup=validatePassword;
	
	
})
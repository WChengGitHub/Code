function prepareOnclick(){
	var signUpNode=document.getElementById("signUp");
	signUpNode.onclick=function(){
		signUp();
		return false;
	}
}
function signUp(){
	if(!document.getElementById)
		return false;
	
	var phoneNode=document.getElementById("phone");
	var phone=phoneNode.value;
	
	var passwordNode=document.getElementById("password");
	var password=passwordNode.value;
	
	var addressNode=document.getElementById("address");
	var address=addressNode.value;
	/*var url="canteenWorker/signUp?phone="+phone+"&password="+password;
	
	var data;
	ajax(url,data);
	alert(data);*/
	var request=getHTTPObject();
	if(request){
		request.open("post","canteenWorker/signUp?phone="+phone+"&password="+password+"&address="+address,true);
		request.onreadystatechange=function(){
			if(request.readyState==4){
				alert("注册成功");
				window.location.href="sign-in.html";
			}
		}
		request.send();
	}else{
		alert("Sorry,your borwser doesn't support XMLHttpRequest");
	}
}
addLoadEvent(prepareOnclick);
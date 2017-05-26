function pareOnclick(){
	if(!document.getElementById)
		return false;
	if(document.getElementById("signIn")){
		var signInNode=document.getElementById("signIn");
		signInNode.onclick=signIn;
	}
}
function signIn(){
    if(!document.getElementById)
		return false;
	var phoneNode=document.getElementById("phone");
	var phone=phoneNode.value;
	
	var passwordNode=document.getElementById("password");
	var password=passwordNode.value;
	
	var request=getHTTPObject();
	if(request){
		request.open("post","canteenWorker/signIn?phone="+phone+"&password="+password,true);
		request.onreadystatechange=function(){
			if(request.readyState==4&&request.status==200){
				var data=request.responseText;
				if(data==""){
					alert("登陆失败");
				}
				else{
					data=JSON.parse(data);
					var now = new Date();
		            now.setTime(now.getTime() + 5 * 60 * 1000);
		            document.cookie = "cwid="+data.cwid+";expires=" + now.toGMTString();
					window.location.href="management.html";
				}
			}
		}
		request.send();
	}
	return false;
}
addLoadEvent(pareOnclick);
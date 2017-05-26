function addLoadEvent(func){
	var oldOnload=window.onload;
	if(typeof window.onload!='function'){
		window.onload=func;
	}else{
		window.onload=function(){
			oldOnload();
			func();
		}
	}
}
function signOut(){
	if(!document.getElementById("signOut"))
		return false;
	document.getElementById("signOut").onclick=function(){
		window.location.href="sign-in.html";
	}
}
function getHTTPObject(){
	if(typeof XMLHttpRequest=='undefine'){
		XMLHttpRequest=function(){
			try{
				return new ActiveXObject("Msxml2.XMLHTTP.6.0");
				}catch(e){}
			try{
				return new ActiveXObject("Msxml2.XMLHTTP.3.0");
				}catch(e){}
			try{
				return new ActiveXObject("Msxml2.XMLHTTP");
				}catch(e){}
				return false;
			}
		}else{
			return new XMLHttpRequest();
		}
	}
function ajax(url,data){
	var request=getHTTPObject();
	if(request){
		request.open("post",url,true);
		request.onreadystatechange=function(){
			if(request.readyState==4){
				data=request.responsetText;
			}
		}
		request.send();
	}else{
		alert("Sorry,your borwser doesn't support XMLHttpRequest");
	}
	
}
addLoadEvent(signOut);
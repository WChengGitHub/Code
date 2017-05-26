function prepareOnclick(){

	var addNode=document.getElementById("add");
	addNode.onclick=function(){
		window.location.href="add.html";
	}
	
	var confirmNode=document.getElementById("confirm");
	confirmNode.onclick=function(){
		window.location.href="confirm.html";
	}
}
addLoadEvent(prepareOnclick);
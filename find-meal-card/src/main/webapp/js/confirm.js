function prepareOnclick(){
	var node=document.getElementById("submit");
	node.onclick=confirm;
}
 function confirm(){
	
	var studentNumberNode=document.getElementById("studentNumber");
	var studentNumber=studentNumberNode.value;
	
	var request=getHTTPObject();
	if(request){
		request.open("post","canteenWorker/confirm?studentNumber="+studentNumber,true);
		request.onreadystatechange=function(){
		  if(request.readyState=="4"&&request.status=="200"){
		     alert("确认成功");
		  }
		}
		request.send();
	}
	return false;
 }
 addLoadEvent(prepareOnclick);
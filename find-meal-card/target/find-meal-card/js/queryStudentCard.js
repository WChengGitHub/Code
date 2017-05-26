function pareOnclick(){
	if(!document.getElementById)
		return false;
	if(document.getElementById("query")){
		var queryNode=document.getElementById("query");
		queryNode.onclick=queryStudentCard;
	}
}
function queryStudentCard(){
  var studentNumberNode=document.getElementById("studentNumber");
  var studentNumber=studentNumberNode.value;
  
  var request=getHTTPObject();
  if(request){
    request.open("post","student/queryStudentCard?studentNumber="+studentNumber,true);
	request.onreadystatechange=function(){
	  if(request.readyState=="4"&&request.status=="200"){
			var position=request.responseText;
			if(position==""||position==" "){
				alert("该饭卡不存在");
			}else{
				alert("该饭卡所在位置："+position);
			}
	  }
	}
	request.send();
  }
  return false;
}
addLoadEvent(pareOnclick);
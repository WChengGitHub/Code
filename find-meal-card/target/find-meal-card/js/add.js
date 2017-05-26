function prepareOnclick(){
	var node=document.getElementById("submit");
	node.onclick=add;
}
function getCwid() {
           var cwid;
           var strCookie = document.cookie;
            var arrCookie = strCookie.split(";");
            for (var i = 0; i < arrCookie.length; i++) {
                var arr = arrCookie[i].split("=");
                arr[0] = arr[0];
               if ("cwid" == arr[0]) {
                    cwid= arr[1];
                }
            }
			return cwid;
 }
 function add(){
 
	var cwid=getCwid();
	
	var studentNumberNode=document.getElementById("studentNumber");
	var studentNumber=studentNumberNode.value;
	
	var request=getHTTPObject();
	if(request){
		request.open("post","canteenWorker/add?cwid="+cwid+"&studentNumber="+studentNumber,true);
		request.onreadystatechange=function(){
		  if(request.readyState=="4"&&request.status=="200"){
		     alert("添加成功");
		  }
		}
		request.send();
	}
	return false;
 }
 addLoadEvent(prepareOnclick);
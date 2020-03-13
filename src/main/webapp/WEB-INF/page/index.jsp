<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/common/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	//ajax发送josn和接收数据
	$(function(){
		$("#bt1").click(function(){
			var url="/str";
			var data={"name":$("#t1").val(),"age":$("#t2").val()};
			$.post(url,data,function(text,status){
				$("#t3").val(text+"---"+status);
			});
		});
	});
</script>
<body>
<h1>CHANG THE WORD!</h1>
姓名：<input type="text" id="t1" style="width: 200px"/>
<br>
年龄：<input type="text" id="t2" style="width: 200px"/>
<input type="button" id="bt1" value="提交"/>
<hr>
返回信息：<input type="text" id="t3" style="width: 200px"/>
</body>

</html>
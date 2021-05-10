<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<p>提交参数给Controller</p>
<br>
<form action="receive" method="post">
	姓名：<input type="text" name ="name"/>
	年龄：<input type="text" name ="age"/>
	<input type="submit" value="提交">
</form>
</body>
</html>
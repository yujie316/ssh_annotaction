<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>演示：spirng4.1.1MVC + hibernate4.3.6+jersey2.22.1架构原型</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
</head>
<body>

	演示：spirng4.1.1MVC + hibernate4.3.6+jersey2.22.1架构原型<br/>
	<a href="login.jsp">登录</a>
	
</body>
</html>

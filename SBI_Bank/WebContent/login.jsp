<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SBI_Bank/login" method="post">
<div style="colour:Red">${loginerror}</div>
 userName:<input type="text" name="userName" id="userName"></br>
 password:<input type="text" name="password" id="password"></br>
<input type="submit" name="login" id="login" value="login">

<div style="color: "green">New User <a href="register.jsp" >register here</a></div>
</from>
</body>
</html>
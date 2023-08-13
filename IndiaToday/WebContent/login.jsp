<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<form action="IndiaToday/logi[]n" method="post">  </form>
<div  style:colour="orange">${loginerror} </div>
userName:<input type="text" name="userName" id="userName"></br>
password:<input type="password" name="password" id="password"></br>
<input type="submit" name="login" id="login" value="login" ></br>
<div style:colour="blue">New user<a href="register.jsp">click to register page</a></div>
</body>
</html>
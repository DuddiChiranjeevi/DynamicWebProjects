<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<form action="/PMKISAN/login" method="post">
<div style="color:red">${loginerror}</div>
 UserName:<input type="text" name="username" id="username" ></br>
MobileNo:<input type="text" name="mobileno" id="mobileno"></br>
<input type="submit"  name="login" id="Login" value="LOGIN" Style="background-color:green">



</form>
</body>
</html>
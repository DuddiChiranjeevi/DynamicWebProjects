<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<form action="/HdfcBank/register" method="post">
userId:<input type="text" name="userid"  id="userid" style="background-color:blue;color:white"></br>
userName:<input type="text" name="username" id="username" style="background-color:blue;color:white"></br>
password:<input type="text" name="password" id="password" style="background-color:blue;color:white"></br>
mobileNo:<input type="text" name="mobileno" id="mobileno" style="background-color:blue;color:white"></br>
emailId:<input type="text" name="emailid" id="emailid" style="background-color:blue;color:white"></br>
<input type="submit" name="registers"id="registers" value="Registers" >
</form>
</body>
</html>
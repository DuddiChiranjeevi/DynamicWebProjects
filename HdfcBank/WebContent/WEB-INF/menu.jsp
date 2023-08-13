<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>menu page</title>
</head>
<body bgcolor="pink">
<h1>welcome Mr.${username}</h1>
your mobile no is:::${mobileno} 
your id::::::::::${userid}


<form action="/HdfcBank/delete" method="get">

			<input type="hidden" name="userid" id="userid" value="${userid}"/>
			<input type="submit" value="delete"/>
			</form>
			
			<form action="/HdfcBank/update" method="post">

			<input type="hidden" name="userid" id="userid" value="${userid}"/>
			<input type="submit" value="UPDATE"/>
			</form>
</body>
</html>
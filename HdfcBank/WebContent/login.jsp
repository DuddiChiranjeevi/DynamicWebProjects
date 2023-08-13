<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body bgcolor="yellow">
<form action="/HdfcBank/login" method="post">
<div style="color:red">${loginerror}</div>
UserName:<input type="text" name="username" id="username" style="background-color:green;font-weight:italic;color:red;" ></br>
Password:<input type="text" name="password" id="password" style="background-color:blue;font-weight:bold;color:white;" ></br>
<input type="submit" name="login" id="login" value="login"></br>
<td><input type="button" name="edit" value="Edit" style="background-color:green;font-weight:bold;color:white;"  ></td>
</tr>

</form>

</body>
</html>
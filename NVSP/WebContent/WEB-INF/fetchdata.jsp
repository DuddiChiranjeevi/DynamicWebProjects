<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>fetch data</title>
</head>
<body>

	<h1>
		<div style="color: red">welcome Mr.${votername}</div>
	</h1>
	<table border="1" cellpadding="8">
		<tr>
			<td>${voterid}</td>
			<td>${votername}</td>
			<td>${fathername}</td>
			<td>${dateofbirth}</td>
			<td>${age}</td>
			<td>${aadharno}</td>
			<td>${emailid}</td>
			<td>${cast}</td>
			<td>${mandal}</td>
			<td>${district}</td>
			<td>${state}</td>
		
			<td>
			<form action="/NVSP/delete" method="get">
			<input type="hidden" name="voterid" id="voterid" value="${voterid}"/>
			<input type="submit" value="delete"/>
			</form></td>
			
			<td><a href="update.jsp"> UPDATE</a></td>
		</tr>




	</table>




</body>
</html>
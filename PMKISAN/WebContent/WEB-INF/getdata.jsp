<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome Mr.${username}</h1>
	<table border="1" padding="8">
		<th bgcolor="lightblue">UserId</th>
		<th bgcolor="#E8FDFF">UserName</th>
		<th bgcolor="red">FatherName</th>
		<th bgcolor="yellow">DateOfBirth</th>
		<th bgcolor="pink">Age</th>
		<th bgcolor="green">MobileNo</th>
		<th bgcolor="gray">BankAccountNO</th>
		<th bgcolor="blue">IFSC</th>
		<th bgcolor="orange">LandPssbok</th>
		<th bgcolor="violet">Village</th>
		<th bgcolor="safron">Mandal</th>
		<th bgcolor="paleyellow">District</th>
		<th bgcolor="blue">State</th>
		</div>

		<tr>
					
		
			<td>${userid }</td>
			<td>${username }</td>
			<td>${fathername }</td>
			<td>${dateofbirth }</td>
			<td>${age}</td>
			<td>${mobileno }</td>
			<td>${bankac }</td>
			<td>${ifsc }</td>
			<td>${landpassbook}</td>
			<td>${village}</td>
			<td>${mandal }</td>
			<td>${district}</td>
			<td>${state}</td>
			<td><form action="/PMKISAN/delete.jsp" method="post"><input type="submit" name="delete" id="delete" value="DELETE" style="background-color:red"></form></td>
						<td><form action="edit.jsp" method="post"><input type="submit" name="edit" id="edit" value="EDIT" style="background-color:orange"></form></td>
			
		</tr>



	</table>


</body>
</html>
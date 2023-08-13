<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
</head>
<body>
	<form action="/NVSP/login" method="post">
		<h1>welcome to login page</h1>
		<div style="color:red">${loginerror}</div>
		EmailId:<input type="text" name="emailid" id="emailid"></br>
		DateOfBirth:<input type="text" name="dateofbirth" id="dateofbirth"></br>
		<input type="submit" name="login" id="login" value="login">
	</form>
	<form action="/NVSP/getdata" method="get">
		<div style="color: red">${error}</div>
		<h5>Get your data by.....passing</h5>
		voterId:<input type="text" name="voterid" id="voterid"
			placeholder="enter your id"></br> <input type="submit" name="get"
			id="Get" value="GET" style="background-color: green">
	</form>
	<%---- 
<form action="/NVSP/update" method="post">
<h5>Update your data </h5>
<input  type="text" name="voterid" id="voterid" placeholder="enter voterid"></br>
<input  type="text" name="votername" id="votername" placeholder="enter votername"></br>

<input type="submit" name="update" id="update" value="UPDATE" style="background-color:orange">

</form>
--%>
	<%---- 
<form action="/NVSP/delete" method="get">
<div style="color:red">${error}</div>
<h5>If you want to remove</h5>
voterId:<input type="text" name="voterid" id="voterid" placeholder="enter your id"></br>
<input type="submit" name="delete" id="delete" value="DEL" style="background-color:red">
</form>
--%>

</body>
</html>
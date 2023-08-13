<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<form action="/NVSP/addvoter" method="post">
<div style="color:red">${Registererror}
<input  type="text" name="voterid" id="voterid" placeholder="enter voterid"></br>
<input  type="text" name="votername" id="votername" placeholder="enter votername"></br>
<input  type="text" name="fathername" id="fathername" placeholder="enter fathername"></br>
<input  type="text" name="dob" id="dob" placeholder="enter dob"></br>
<input  type="text" name="age" id="age" placeholder="enter age"></br>
<input  type="text" name="aadharno" id="aadharno" placeholder="enter aadharno"></br>
<input  type="text" name="emailid" id="emailid" placeholder="enter emailid"></br>
<input  type="text" name="cast" id="cast" placeholder="enter cast"></br>
<input  type="text" name="constituency" id="constituency" placeholder="enter constituency"></br>
<input  type="text" name="mandal" id="mandal" placeholder="enter mandal"></br>
<input  type="text" name="district" id="district" placeholder="enter district"></br>
<input  type="text" name="state" id="state" placeholder="enter state"></br>
<input type="submit" name="register" id="register" value="register" style="background-color:blue">

</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function loginCheck(){
	var username=document.getElementById("username").value;
	var password=document.getElementById("password").value;
	if(!username){
		alert("please enter username");
		return false;
	}
	if(!password){
		alert("please enter password");
		return false;
	}
	</script>

</head>
<body bgcolor="lightgray">
<form action="/IndianBankNetbanking/login.htm" method="post">
<h1 align="center" style ="position:relative; left:80px; top:2px;">Welcome to Indian Bank Netbanking </h1>
<div align="center">
Username:<input type="text" name="username" id="username"/><br>


Password:<input type="password" name="password" id="password"/>
</div>
<br>
<div align="center" >
<input type="submit" name="login" id="login" value="Login" onclick="return loginCheck();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="forgotpassword" id="forgotpassword" value="Forgotpassword"/> 
</div>
</form>
</body>
</html>
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
if(!username ){
	alert("please enter username");
}
if(!password){
	alert("please enter password");
}
	
	return false;
}
</script>
</head>
<body>
<h1 sty	le="color:blue">Welcome to login page </h1>
<div  align="center"style="color:green"> ${sucess}</div>
<form action="" method="post">
<table align="center" border="1">
<tr><td>UserName</td><td><input type="text" name="username" id="username" placeholder="Enter user name"></td></tr>
<tr><td>Password</td><td><input type="password" name="password" id="password" placeholder="Enter password"></td></tr>
<tr><td align="right"><input type="submit" name="login" id="login" value="Login" onclick="return loginCheck();"></td><td t><input type="submit" name="forgotpassword" id="forgotpassword" value="ForgotPassword"></td></tr>
</table>


</form>
</body>
</html>
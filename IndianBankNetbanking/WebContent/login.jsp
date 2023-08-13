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
		alert("please enter user name");
		return false;
	}
	if(!password){
		alert("please enter password");
		return false;
	}
		
}
</script>
</head>
<body bgcolor="lightgray" >
<form action="/IndianBankNetbanking/login.htm" method="post">
<div align="center">
<h1>Welcome to Indian Bank  Netbanking login page  </h1>
</div> 
<div style="color:red" align="center">${loginerror}</div>
<div style="color:green" align="center">${message}</div>
<table align="center" border="1">
<tr><td>UserName*<input type="text" name="username" id="username"placeholder="Enter your User Name"/></td>
<tr><td>Password*&nbsp;&nbsp;<input type="password" name="password" id="password"placeholder="Enter your Password"/></td>
</tr>
</table>
<div align="center">
<input type="submit" name="login" id="login" value="Login" onclick="return loginCheck();"/>
</div> 

<div align="center" Style="color:green">New user??Register/Activate account<a href="/IndianBankNetbanking/register.jsp">Click to Register hear</a></div>




</form>

</body>
</html>
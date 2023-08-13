<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function passwordValidate(){
	var password=document.getElementById("password").value;
	var repassword=document.getElementById("repassword").value;
	if(password != repassword){
		alert("password and re-enter password not match");
		return false;
	}
}


</script>
</head>
<body bgcolor="lightblue"> 
<form action="/IndianBankNetbanking/register.htm" method="post">
<div align="center"><h1>Welcome to Indian Bank Netbanking registration form</h1></div>
<div align="center" style="color:blue"><h4>please fill your details hear </h4></div>
<div style="color:red"> ${registererror}</div>
<table border="1" align="center">
<tr>
<td>Enter your full name*</td><td><input type="text" name="accountholdername" id="accountholdername" placeholder="Enter your full name"/></td> 
</tr>
<tr>
<td>Enter your UserName*</td><td><input type="text" name="username" id="username" placeholder="Enter your username"/></td> 
</tr>
<tr>
<td>Set your password*</td><td><input type="password" name="password" id="password" placeholder="Set your password"/></td> 
</tr>
<tr>
<td>Re_enter password*</td><td><input type="text" name="repassword" id="repassword" placeholder="Re_enter password"/></td> 
</tr>
<tr>
<td>Enter your mobile number*</td><td><input type="text" name="mobileno" id="mobileno" placeholder="Enter  mobileNo"/></td> 
</tr>
<tr>
<td>Enter your email id*</td><td><input type="text" name="emailid" id="emailid" placeholder="Enter  emailid"/></td> 
</tr>
<tr>
<td>Select Gender</td><td><input type="radio" name="gender" id="gender" value="male"/>Male <input type="radio" name="gender" id="gender" value="female"/>Female<input type="radio" name="gender" id="gender" value="other"/>other  
</tr>
<tr>
<td>Enter date of birth</td><td><input type="text" name="dob" id="dob" placeholder="Enter  date of birth"/>
</tr>
<tr>
<td>Enter your address</td><td><input type="text" name="address" id="address" placeholder="Enter  your address"/>
</tr>
<tr>
<td>Select role</td><td><input type="radio" name="role" id="role" value="Manager"/>Manager <input type="radio" name="role" id="role" value="user"/>User<input type="radio" name="role" id="role" value="Admin"/>admin</td>  
</tr>
<tr>
<td>Enter your favouriate fruit*</td><td><input type="text" name="forgotpasswordsec" id="forgotpasswordsec" placeholder="Favourite  fruit"/>
</tr>
<tr>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="register" id="register" value="Register"onclick="return passwordValidate();"/>
</tr>
</table>
</form>
</body>
</html>
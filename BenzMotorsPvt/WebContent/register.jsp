<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function passwordMatch(){
	var password=document.getElementById("password").value;
	var repassword=document.getElementById("repassword").value;
if(password != repassword){
	alert("password and re_enter password dosn't match ");
}
return false;
}

</script>


</head>
<body bgcolor="lightgray">
<form action="/BenzMotorsPvt/register.htm" method="post">
<div style="color:red">${registererror }</div>
<div style="color:green">${sucess }</div>

<h1>welcome to Register page </h1>
<table border="1" align="center">
<tr><th colspan="2" style="color:blue">fill your details hear</th></tr>
<tr><td>Enter your name*</td><td><input type="text" name="empname" id="empname" placeholder="enter your full name"></td></tr>
<tr><td>Set  UserName*</td><td><input type="text" name="username" id="username" placeholder="set your username"></td></tr>
<tr><td>Set  password*</td><td><input type="password" name="password" id="password" placeholder="set your password"></td></tr>
<tr><td>Re_enter password*</td><td><input type="text" name="repassword" id="repassword" placeholder="set your repassword"></td></tr>

<tr><td>Enter mobileNo*</td><td><input type="text" name="mobileno" id="mobileno" placeholder="enter  your mobileno"></td></tr>
<tr><td>Enter  emailId*</td><td><input type="text" name="emailid" id="emailid" placeholder="enter your emailid"></td></tr>
<tr><td>Enter  aadhaNo*</td><td><input type="text" name="aadhaarno" id="aadhaarno" placeholder="enter your aadhaarno"></td></tr>
<tr><td>Enter  panNo*</td><td><input type="text" name="panno" id="panno" placeholder="enter your panNo"></td></tr>
<tr><td>Enter  DateofBirth</td><td><input type="date" name="dateofbirth" id="dateofbirth" placeholder="enter your aadhaarno"></td></tr>
<tr><td>Enter  age</td><td><input type="text" name="age" id="age" placeholder="enter your age"></td></tr>
<tr><td>Enter  gender</td><td><input type="radio" name="gender" id="gender" value="Male">Male<input type="radio" name="gender" id="gender" value="Female">Female<input type="radio" name="gender" id="gender" value="other">Other</td></tr>
<tr><td>Enter  accountNo</td><td><input type="text" name="accountno" id="accountno" placeholder="enter your accountno"></td></tr>
<tr><td>Enter  dateofjoining</td><td><input type="date" name="dateofjoining" id="dateofjoining" placeholder="enter your dateofjoining"></td></tr>
 <tr><td><input type="submit" name="register" id="register" value="Register" ></td></tr>
 <td ><input type="reset" name="reset" id="reset" value="Reset"></td></tr>



</table>
</form>
</body>
</html>
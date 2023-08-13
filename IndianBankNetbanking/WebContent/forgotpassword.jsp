<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
<form action="/IndianBankNetbanking/forgotpassword.htm" method="post">
<div align="center" style = "position:relative; left:80px; top:2px;color:green ">Forgot password..to change password please provide following data</div><br><br>
<div>
<div style="color:red">${error}</div>
<div style="color:red">${updateerror}</div>
<table border="1">
<tr><td>please enter your mobile no*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td><input type="text" name="mobileno" id="mobileno" placeholder="enter mobile no"></td></tr>

<tr> <td>fill security question which is  your favouriate fruit*</td><td><input type="text" name="forgotpassque" id="forgotpassque" placeholder="security question"></td>
</tr>
<tr><td align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="forgotpassword" id="forgotpassword" value="ForgotPassword"></td>
</tr>
</table>
</div>
</form>
</body>
</html>
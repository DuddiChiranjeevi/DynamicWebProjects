<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<h1>welcome to Indian Bank NetBanking</h1>
<marquee bgcolor="lightgreen" onmouseover="this.stop();"onmouseout="this.start();">Indian bank is one of the fast service provided bank in India.To know the different services provided by the bank please contact +91-9000000001</marquee><br><br>
<div style="coor:red">${logoutmsg }</div>
<div>Netbanking <a href="/IndianBankNetbanking/login.jsp">Click to continue and  login hear</a></div>
<div>New user???<a href="/IndianBankNetbanking/register.jsp">Please click hear for register</a></div>
<div>Forgot password??<a href="/IndianBankNetbanking/forgotpassword.jsp">Click hear to change your password</a> </div>
</body>
</html>
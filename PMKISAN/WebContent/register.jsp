<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<form action="/PMKISAN/register" method="post">
		<h5>plz fill your details to register</h5>
		<table border="1" padding="5">
			<tr>
				<td><input type="text" name="userid" id="userid"
					placeholder="UserId"></td>
			</tr>
			<tr>
				<td><input type="text" name="username" id="userid"
					placeholder="UserName"></td>
			</tr>
			<tr>
				<td><input type="text" name="fathername" id="fathername"
					placeholder="FatherName"></td>
			</tr>
			<tr>
				<td><input type="text" name="dateofbirth" id="dateofbirth"
					placeholder="DateOfBirth"></td>
			</tr>
			<tr>
				<td><input type="text" name="age" id="age" placeholder="Age"></td>
			</tr>
			<tr>
				<td><input type="text" name="mobileno" id="mobileno"
					placeholder="MobileNo"></td>
			</tr>
			<tr>
				<td><input type="text" name="bankac" id="bankac"
					placeholder="BankAccontNo"></td>
			</tr>
			<tr>
				<td><input type="text" name="ifsc" id="ifsc" placeholder="IFSC"></td>
			</tr>
			<tr>
				<td><input type="text" name="landpassbook" id="landpassbook"
					placeholder="LandPassbook"></td>
			</tr>
			<tr>
				<td><input type="text" name="village" id="village"
					placeholder="Village"></td>
			</tr>
			<tr>
				<td><input type="text" name="mandal" id="mandal"
					placeholder="Mandal"></td>
			</tr>
			<tr>
				<td><input type="text" name="district" id="district"
					placeholder="District"></td>
			</tr>
			<tr>
				<td><input type="text" name="state" id="state"
					placeholder="State"></td>
			</tr>
		</table>

		<input type="submit" name="register" id="register" value="Register"
			style="background-color: green">

	</form>

</body>
</html>
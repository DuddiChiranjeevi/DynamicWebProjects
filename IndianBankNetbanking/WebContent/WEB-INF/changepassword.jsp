<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function passwordMatch(){
	var newpassword=document.getElementById("newpassword").value;
	var repasword=document.getElementById("repasword").value;
	
	if(newpassword !== repasword){
		alert("passsword and re_enter password are not same");
		return false;
	}
}


</script>
</head>
<body bgcolor="lightpink">

<h4>set your new password </h4>
<form action="/IndianBankNetbanking/forgotpassword.htm" method="get">
<div>
Enter your new password<input type="password" name="newpassword" id="newpassword"><br>
Re_enter password    <input type="text" name="repasword" id=repasword><br>
<input type="hidden" name="mobileno"id="mobileno" value="${mobileno }">
  <input type="submit" name="changepassword" id="changepassword" value="ChangePassword" onclick="return passwordMatch();">
  </div>
  </form>

</body>
</html>
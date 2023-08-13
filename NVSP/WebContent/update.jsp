<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/NVSP/update" method="post">
<h5>Update your data </h5>
<input  type="text" name="voterid" id="voterid" placeholder="enter voterid"></br>
<input  type="text" name="votername" id="votername" placeholder="enter votername"></br>

<input type="submit" name="update" id="update" value="UPDATE" style="background-color:orange">

</form>


</body>
</html>
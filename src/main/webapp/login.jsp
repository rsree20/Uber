<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<font color="blue"><b>${message}</b></font><br>
<form action="login" method="post">
Name : <input type="text" name="email"/><br>
Password : <input type="password" name="pwd"/><br>
<input type="submit" value="login">
</form>

</body>
</html>
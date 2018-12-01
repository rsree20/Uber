<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateUser" method="post">
name :<input type="text" name="name" value="${emp.name}"/><br>
mail :<input type="text" name="mail" value="${emp.mail}"/><br>
Mobile :<input type="text" name="mob" value="${emp.mob}"/><br>
city :<input type="text" name="cit" value="${emp.cit}"/><br>
password :<input type="password" name="pwd" value="${emp.pwd}"/><br>

<input type="submit" value="update"/><br>



</body>
</html>
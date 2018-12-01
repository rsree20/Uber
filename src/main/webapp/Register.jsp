<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function RegisterUser(){
	
	alert("Triggered RegisterUser");
	
	alert("exit RegisterUser");
	
	document.forms[0].action="register";
	document.forms[0].submit();
	
}
</script>
<font color="red">${message}</font><br>
<body>
<img alt="mutton biryani" src="https://i.ytimg.com/vi/HI2-u2zu8Ss/maxresdefault.jpg" width="600" height="500"/>
<form action="register"  method="post">
name :<input type="text" name="name" value="${employee.name}"/><br>
mail :<input type="text" name="mail"value="${employee.mail}"/><br>
Mobile :<input type="text" name="mob"value="${employee.mob}"/><br>
city :<input type="text" name="cit"value="${employee.cit}"/><br>
password :<input type="password" name="pwd"value="${employee.pwd}"/><br>
<!-- <input type="submit" value="register"/><br> -->
<input type="button" value="register" onclick="RegisterUser()"/><br>
<a href = "login.jsp">login</a>click here to login
</form>

</body>
</html>
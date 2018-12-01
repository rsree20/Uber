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
Hello!! you are registered successfully!!
UserName : ${UserName}
Password : ${Pword}
<form action="ShowAllOther">
<input type="submit" value="ShowAllUserDetails"/>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function DeleteUser(mail){
	alert(mail);
	alert("DeleteUser Triggered ");
	document.forms[0].action="DeleteUser?MailID="+mail;
	document.forms[0].method="post";
	document.forms[0].submit();
} 
function EditView(mail){
	alert(mail);
	alert("EditUser Triggered ");
	document.forms[0].action="EditView?MailID="+mail;
	document.forms[0].method="post";
	document.forms[0].submit();
}
</script>
<body>
	<form >
		Here we go all employees list <br>

		<table border="3" bordercolor="black">

			<tr bgcolor="lightblue">
				<th>Name</th>
				<th>Mobile Number</th>
				<th>Email</th>
				<th>Password</th>
				<th>City</th>
			</tr>
			<c:forEach var="emp" items="${Emplist}">
				<tr bgcolor="lightpink">
					<td>${emp.name}</td>
					<td>${emp.mob}</td>
					<td>${emp.mail}</td>
					<td>${emp.pwd}</td>
					<td>${emp.cit}</td>
					<td><input type="button" onclick="DeleteUser('${emp.mail}')" value="delete" /></td>
					<td><input type="button" onclick="EditView('${emp.mail}')" value="Edit" /></td>
				</tr>

			</c:forEach>
		</table>
	</form>


</body>
</html>
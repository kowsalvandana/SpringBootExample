<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPLOYEE DATA PAGE</title>
</head>
<body>


<h3>EMPLOYEE DATA PAGE</h3>
<table border="1">
	<tr>
		<td>ID</td>
		<td>NAME</td>
		
		
		<td>DEPT</td>
		<td>ADDR</td>
	</tr>
	
	<c:forEach items="${list}" var="emp">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			
			<td>${emp.dept}</td>
			<td>${emp.addr}</td>
			<td>
  <a href="delete?id=${emp.id}">DELETE</a>
  <a href="edit?id=${emp.id}">EDIT</a>
</td>
			
		</tr>
	</c:forEach>

</table>
</body>
</html>

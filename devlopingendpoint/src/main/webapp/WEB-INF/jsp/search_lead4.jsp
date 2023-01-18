<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Show|All|Lead4</h2>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>delete</th>
<th>update</th>
</tr>
<c:forEach items="${lead4}" var="lead4">  
<tr>
<td>${lead4.firstName}</td>
<td>${lead4.lastName}</td>
<td>${lead4.email}</td>
<td>${lead4.mobile}</td>
<td><a href="delete?id=${lead4.id}">delete</a></td>
<td><a href="update?id=${lead4.id}">update</a></td>
</tr>
</c:forEach>  
</table>
</body>
</html>
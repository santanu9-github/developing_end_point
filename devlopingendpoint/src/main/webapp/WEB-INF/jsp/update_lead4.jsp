<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Update|Lead4</h2>
	<form action="updatelead">
		<pre>
		<input type="hidden"name="id"value="${lead4.id}"/>
FirstName<input type="text" name="firstName" value="${lead4.firstName}"/>
LastName<input type="text" name="lastName"value="${lead4.lastName}" />
Email<input type="text" name="email" value="${lead4.email}"/>
Mobile<input type="text" name="mobile" value="${lead4.mobile}"/>
<input type="submit" value="save" />
</pre>
	</form>
</body>
</html>
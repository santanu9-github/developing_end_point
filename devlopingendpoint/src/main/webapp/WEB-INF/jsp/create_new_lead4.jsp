<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create|New|Lead4</h2>
	<form action="savelead">
		<pre>
FirstName<input type="text" name="firstName" />
LastName<input type="text" name="lastName" />
Email<input type="text" name="email" />
Mobile<input type="text" name="mobile" />
<input type="submit" value="save" />
</pre>
	</form>
	${save}
</body>
</html>
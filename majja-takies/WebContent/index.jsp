<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
${message}
	<h1>Registration form of Majja-Takies</h1>

	<form action="register" method="post">
		<pre>
Name<input type="text" name="name">
Hobbies <input type="text" name="hobbies">
Email  <input type="text" name="email">
Location  <input type="text" name="location">
 <input type="submit" value="register">
 
	</pre>
	</form>
</body>
</html>
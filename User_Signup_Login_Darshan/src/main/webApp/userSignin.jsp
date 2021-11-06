<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<h2>Already a User? Sign in</h2>
<form action="/getUser">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit">
</form>

<br>
<h2>SignUp by Clicking here</h2>
<form action="/newUserRegistration">
<input type="submit">
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<style>
body{
	font-size=30px;
	color: blue;
	background-color:lightgreen;
	text-align:center;
}
</style>
</head>
<body>
	<br/><br/>
	<h1>
	Validation of User Login
	</h1>
	<br/><br/>
	
	<form action="ValidateUserServlet" method="post">
	<label>Enter Username: </label><input type="text" name="username" required/><br/><br/>
	<label>Enter Password: </label><input type="text" name="password" required/><br/><br/>
	<button type="submit" value="submit">Submit</button>
	</form>
	
</body>
</html>
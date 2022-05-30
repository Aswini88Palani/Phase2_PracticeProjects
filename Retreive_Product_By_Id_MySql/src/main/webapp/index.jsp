<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<style>
	body{
		text-align: center;
		font-size: 30px;
		color: blue;
	}
</style>
</head>
<body>
	<h2 style = color:magenta>Retreive the Product by using the Product ID</h2>
	
	<form action = "Display" method = "post">
	Enter the Product ID: <input type = "text" name = "id"><br/><br/>
	<button type = "submit" value = "submit">Submit</button>
	<button type = "reset" value = "reset">Reset</button>
	</form>
</body>
</html>
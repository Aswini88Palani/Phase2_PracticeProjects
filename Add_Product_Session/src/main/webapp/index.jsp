<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<style>
body{
	font-size: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<h2 style=color:blue>Add a Product and Display it - A Servlet Based Web Application</h2>
	<h3 style=color:red>(No Database Involved)</h3>
	<br/>
	
	<div align=center>
	<form action = ProductServlet method = post>
	Product Name: <input type = "text" name = "name" required/><br/><br/>
	Product Price: <input type = "number" name = "price" required/><br/><br/>
	Product Model Number: <input type = "number" name = "number" required/><br/><br/>
	Manufacturer: <input type = "text" name = "manufacturer" required/><br/><br/>
	<button type = "submit" value = "submit">Add Product</button>
	</form>
	</div>
</body>
</html> 
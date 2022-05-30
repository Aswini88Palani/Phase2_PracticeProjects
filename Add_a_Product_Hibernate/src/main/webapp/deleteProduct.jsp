<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
<style>
body{
	font-size: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<div align="left">
	<a href="home.jsp"><input type=submit value=Back></a>
	</div>
	
	<h2>Delete Product</h2>
	
	<div align="center">
	<div style="border:4px solid blue;width:50%;border-radius:50px;padding:20px">
	<form action=DeleteProductServlet method=post>
	<h3>
		Enter Product ID: <input type="text" name="id" required><br/><br/>		
		<input type="submit" value="Delete Product">
	</h3>
	</form>
	</div>
	</div>
</body>
</html>
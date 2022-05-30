<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
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
	
	<h2>Add Product</h2>
	
	<div align="center">
	<div style="border:4px solid blue;width:50%;border-radius:50px;padding:20px">
	<form action=AddProductServlet method=post>
	<h3>
		Product Name: <input type="text" name="name" required><br/><br/>
		Brand: <input type="text" name="brand" required><br/><br/>
		Madein: <input type="text" name="madein" required><br/><br/>
		Price: <input type="text" name="price" required><br/><br/>
		<input type="submit" value="Add Product">
	</h3>
	</form>
	</div>
	</div>
</body>
</html>
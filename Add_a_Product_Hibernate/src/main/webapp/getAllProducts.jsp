<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.dto.Product"%>
<%@page import="java.util.Set"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Products</title>
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
	<h2>Product List</h2>
	
	<div align="center">
	<div style="border:4px solid blue;width:50%;border-radius:50px;padding:20px">
	<table border="1" align="center" width="100%">
	<tr>
	<th>Product ID</th>
	<th>Product Name</th>
	<th>Brand</th>
	<th>Madein</th>
	<th>Price</th>
	</tr>
	<%
		//session.getAttributeNames()
		Set<Product> allProducts = (Set<Product>)session.getAttribute("products");
		for(Product p : allProducts){
			out.print("<tr align=center>");	
			out.print("<td>" + p.getId() + "</td>");
			out.print("<td>" + p.getName() + "</td>");
			out.print("<td>" + p.getBrand() + "</td>");
			out.print("<td>" + p.getMadein() + "</td>");
			out.print("<td>" + p.getPrice() + "</td>");
			out.print("</tr>");
		}
	%>
	</table>
	</div>
	</div>
</body>
</html>
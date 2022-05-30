<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Dashboard</title>
<style>
body{
	font-size: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<a href="index.jsp">Back to HomePage</a>
	<h2> Product List</h2>
	
	<table align=center; border=1; width=100%>
	<tr align=center>
	<th>Product Name</th>
	<th>Product Price</th>
	<th>Product Model Number</th>
	<th>Manufacturer</th>
	</tr>
	<tr align=center>
	<td><%= session.getAttribute("name") %></td>
	<td><%= session.getAttribute("price") %></td>
	<td><%= session.getAttribute("number") %></td>
	<td><%= session.getAttribute("manufacturer") %></td>
	</tr>		
	</table>
		
</body>
</html>
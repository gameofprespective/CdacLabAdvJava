<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
<% ResultSet rs=(ResultSet)request.getAttribute("rs");
while(rs.next())
{%>
	<tr><td><%=rs.getInt(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getDouble(3)%></td>
		<td><a href="update?pid=<%=rs.getInt(1)%>" >update</a>/
			<a href="delete?pid=<%=rs.getInt(1)%>" >delete</a>
			
		</td>
	</tr>	
<%} %>


</table>
	<a href="AddProduct.html">Add Product</a>
	
</body>
</html>
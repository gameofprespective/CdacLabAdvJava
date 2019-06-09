<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<form action="addition">
    <input type="text" name="n1">
    <input type="text" name="n2">
    <input type="submit" name="btn" value="Submit">
 </form>
 <%@include file="footer.html" %>
</body>
</html>
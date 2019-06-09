<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<c:forEach var="p" items="${plist}">
<tr>
<td>${p.pid}</td>
<td>${p.pname}</td>
<td>${p.mobile}</td>
<td><a href="edit/${p.pid}">Edit</a>/<a href="delete/${p.pid}">Delete</a> </td>
</tr>
</c:forEach>
</table>
<a href="viewform">Add Person</a>
</body>
</html>
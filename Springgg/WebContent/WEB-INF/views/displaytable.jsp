<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
a:link, a:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Id</th>
<th>Cust No</th>
<th>Base Pack </th>
<th>Optional Pack</th>
<th>Option</th>
</tr>
<c:forEach var="p" items="${clist}">
<tr>
<td>${p.cid}</td>
<td><a href="update/${p.cust_no}">${p.cust_no}</a></td>
<td>${p.basepack}</td>
<td>${p.optionalpack}</td>
<td><a href="delete/${p.cid}">delete</a></td>
</tr>
</c:forEach>
</table>
<a href="show">Insert Details</a>
</body>
</html>
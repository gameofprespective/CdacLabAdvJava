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
		<tr>
			<th>pid</th>
			<th>pname</th>
			<th>price</th>
			<th>quantity</th>
		</tr>
		<c:forEach var="p" items="${list}">
			<tr>
				<td>${p.pid}</td>
				<td>${p.pname}</td>
				<td>${p.price}</td>
				<td>${p.availableqty}</td>
				<td>
				<c:if test="${p.availableqty>0}"><a href="order/${p.pid}"><input type="button"
						name="btn" value="order now"></a></c:if></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>
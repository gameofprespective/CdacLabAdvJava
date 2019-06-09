<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Oreder id</h3>
<form action="addProduct1" >
product:<input type="text" name="pid" value="${p.pid}" ><br>
product Name:<input type="text" name="pname" value="${p.pname}"><br>
price:<input type="text" name="price" value="${p.price}"><br>
Quantity product:<input type="text" name="availableqty" value="${p.availableqty}"><br>quired><br>
<input type="submit" value="submit" id="btn">
</form>
</body>
</html>
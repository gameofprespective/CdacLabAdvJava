<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.pet.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="p1" class="com.pet.Person" scop="session"/>
	<jsp:useBean id="d1" class="com.pet.Dog"/>
	
	<%
		d1.setName("Moti");
		p1.setName("Rahul");
		p1.setDog(d1);
	%>
	
	${p1.dog.name }
</body>
</html>
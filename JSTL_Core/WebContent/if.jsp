<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored ="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <c:if test="true">Hello world!</c:if>	
	<c:if test="${param.language == 'Java'}">
		<h4>Your guess is correct</h4>
	</c:if>
	<c:if test="${param.language != 'Java'}">
		<h4>Your guess is not correct</h4>
	</c:if>
	
</body>
</html>
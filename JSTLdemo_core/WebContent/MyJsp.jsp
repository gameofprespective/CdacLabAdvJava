<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   List<String> lst=new ArrayList<>();
   lst.add("Kishori");
   lst.add("Revati");
   lst.add("Rajan");


%>
<c:forEach var="i" begin="1" end="10" step="2">
        value : ${i}
</c:forEach>
The list : 
<%=lst.size() %>  
<table>
<c:forEach var="s" items="<%=lst%>">
     <tr><td>${s}</td></tr>
</c:forEach>
The list ends
</table>



</body>
</html>
<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ResultSet rs=(ResultSet)request.getAttribute("rs");
if (rs.next()){

%>

<form action="editProduct">
<input type="text" name="pid" value="<%=rs.getInt(1)%>" readonly>

<input type="text" name="pname" value="<%=rs.getString(2)%>">

<input type="text" name="price" value="<%=rs.getDouble(3)%>">

<input type="submit" name="btn" value="edit">

<input type="reset" name="btn" value="cancel">

 
</form>
<%
}
%>
</body>
</html>
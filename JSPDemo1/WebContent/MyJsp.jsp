<%@ page language="java" import="java.util.Date"  buffer="8kb" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String msg="Hello, How are you?"; 
   public int calcFact(int n){
	   int fact=1;
	   for(int i=2;i<=n;i++){
		   fact=fact*i;
	   }
	   return fact;
   }
  public void jspinit(){
	  
  }

%>
<%@include file="header.html" %>
<%
    Date d=new Date();
    out.println(d);
    
    int sum=(Integer)request.getAttribute("sum");
    out.println("Factorial" +calcFact(sum));
    out.println("sum : "+sum);
%>
Message: <%=msg %>
Sum : <%=sum%>
n1 : <%=request.getParameter("n1") %>
n1 : <%=(Integer)request.getAttribute("sum") %>
Factorial : <%=calcFact(sum) %>
<%@include file="footer.html" %>
</body>
</html>
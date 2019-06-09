<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form action="display" method="post">
CID:<input type=text name="cd"><br><br>
Cust no:<input type=text name="cn" required><br><br>

Select BasePack
<select name="bp">
<option>select</option>
<option value="Disco Hindi">Disco Hindi</option>
<option value="Western Goodies">Western Goodies</option>
<option value="none">none</option>
</select>
<br>
<br>

Select OptionalPack
<select name="op">
<option>select</option>
<option value="Comedy">Comedy</option>
<option value="Sports">Sports</option>
<option value="none">none</option>
</select><br><br>
<input type="submit" name="btn" value="ADD">
</form>
</body>
</html>
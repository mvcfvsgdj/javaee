<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
        <%@ page import = "java.util.*" %>
        
<%@page import ="prj0907.TestClass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>test</td>
<td>1</td>
<td>2</td>
<td>3</td>
</tr>



<% ArrayList<TestClass> list = (ArrayList<TestClass>)request.getAttribute("list"); %>
<% for(TestClass i : list) { %>
	<tr>

	<td>  <%=i.getStore_code()%></td>
	<td><%=i.getStore_loc()%></td>
	<td><%=i.getStore_m()%></td>
	<td></td>
	</tr>
    
<% } %>
</table>
</body>
</html>
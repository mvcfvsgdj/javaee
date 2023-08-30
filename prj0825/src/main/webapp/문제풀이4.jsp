<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="prj0825_test.HelloWorld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
HelloWorld hello = new HelloWorld("hello world");
%>
<h2><%=hello %></h2>

</body>
</html>
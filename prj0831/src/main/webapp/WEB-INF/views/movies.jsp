<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>인기영화</h2>
<% ArrayList<String> list = (ArrayList<String>)request.getAttribute("movies"); %>

<% for(String item : list ){
	out.print(item+"<br>");
}
%>
</body>
</html>
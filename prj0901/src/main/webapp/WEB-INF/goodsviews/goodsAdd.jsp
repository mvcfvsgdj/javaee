<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="goods.goods" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String id = (String) request.getAttribute("add") ;%>
<% String name = (String) request.getAttribute("add1") ;%>
<% String price = (String) request.getAttribute("add2") ;%>
<%=id%>
<%=name%>
<%=price%>
<h2>새메뉴등록완료</h2>


</body>
</html>
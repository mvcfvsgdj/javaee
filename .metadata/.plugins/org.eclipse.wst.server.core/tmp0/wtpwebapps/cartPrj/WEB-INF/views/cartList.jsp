<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>장바구니 테스트</h2>

<%
ArrayList<String> list = (ArrayList<String>)request.getAttribute("cartList");

for(String s: list){
	out.println(s+"<br>");
}
%>
</body>
</html>
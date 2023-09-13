<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String animal = (String)request.getAttribute("animal"); %>
<%String flower = (String)request.getAttribute("flower") ;%>
<h2>test result</h2>
<h3>test 1 test2</h3>
test1 ?	<%=animal %>	<br>
test2 ? <%=flower %>
</body>
</html>
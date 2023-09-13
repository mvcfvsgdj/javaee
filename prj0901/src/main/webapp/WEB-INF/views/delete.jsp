<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import ="prj0901.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String c = (String) request.getAttribute("id");%>
<h2>삭제완료</h2>
아이디:<%=c%> <br>
</body>
</html>
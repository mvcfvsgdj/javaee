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
<h2>정보수정완료</h2>
바뀐 비밀번호 <%=c %>
</body>
</html>
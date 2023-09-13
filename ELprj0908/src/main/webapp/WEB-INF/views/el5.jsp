<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>저장소에서 저장된 값을 꺼내올때 순서</h2>
pageContext -> request -> session -> application

<h2> 저장소에서 꺼내기 </h2>
<%

pageContext.setAttribute("test", "test_pageScope");
request.setAttribute("test", "test_requstScope");
session.setAttribute("test", "test_sessionScope");
application.setAttribute("test", "test_applicationScope");
%>

${test}

${requestScope.test}
${sessionScope.test}
${applicationScope.test}
${pageScope.test }
</body>
</html>
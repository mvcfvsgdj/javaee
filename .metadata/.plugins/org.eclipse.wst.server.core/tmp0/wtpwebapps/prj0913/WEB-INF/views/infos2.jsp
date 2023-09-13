<%@page import="java.util.ArrayList"%>
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
<c:set var="list" value="${infos['listTest'] }"/>
<c:forEach var="item" items="${list}">
	${item }
	</c:forEach>
	<h2>테스트2</h2>
	<c:set var="list2" value="${infos['list2Test'] }"/>
	<c:forEach var="item" items="${list2 }">
	${item}
	
	</c:forEach>
</body>
</html>
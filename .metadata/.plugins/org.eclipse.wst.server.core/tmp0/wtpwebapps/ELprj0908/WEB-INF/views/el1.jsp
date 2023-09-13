<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String result = (String)request.getAttribute("data"); %>
<%=result %>

<h2>EL 사용 : 저장소에있는 값을 쉽게꺼내옴</h2>
${data}
<h2>사칙연산가능</h2>
${10+20}
${10/3}
${10%3}
${10*30}
<h2>논리연산</h2>
${true && true}
${true && false}
${true || false}
${true or false}
${not true}
${not false}
<h2>empty</h2>
empty 연산자 null 이면 true

<%

pageContext.setAttribute("title", "EL연산자");

%>
${empty title }
${not empty title }


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>헤로 왈도</h2>
<% String result =  (String)request.getAttribute("halo");
out.print(result);

%>

</body>
</html>
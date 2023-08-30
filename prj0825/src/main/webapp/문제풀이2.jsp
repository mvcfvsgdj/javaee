<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

int nm1 =3;	
for(int i = 1; i<=9; i++) {
	int mul = nm1*i;
	%>
	
<h1>	<% out.print(mul); %></h1>
<%}


%>
</body>
</html>
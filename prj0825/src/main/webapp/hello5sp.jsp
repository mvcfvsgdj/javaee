<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>3단출력</h2>
	 <%
	for (int i = 1; i <= 9; i++) {
	%>
	<h1>
		<%
		out.print(3 * i);
		%>
	</h1>
	<%
	}
	%>

	<h2>3단 출력</h2>
	<%
	for(int i =1 ; i<=9; i++){
	%>
	<p>
		<%=3*i %>)
	</p>
	<%}
	%>

	
	
</body>
</html>
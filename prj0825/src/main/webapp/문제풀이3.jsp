<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>별 찍기</title>
</head>
<body>

<%
String NUM1 = request.getParameter("NUM");
int NUM = Integer.parseInt(NUM1);

for (int i = 1; i <= NUM; i++) {
    out.print("<h2>*</h2>");
    
}
%>

</body>
</html>
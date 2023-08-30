<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>1~10출력</h2>
<%

int sum =0 ;

for(int i=1 ; i<=10; i++){
	sum += i ;
	out.print(i+"<br>");
}
out.print(sum);
%>
<%=sum %>
</body>
</html>
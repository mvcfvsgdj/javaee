<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>문제1</h1>

<%
String nm1_ = request.getParameter("nm1");
String nm2_ = request.getParameter("nm2");

int nm1 = Integer.parseInt(nm1_);
int nm2 = Integer.parseInt(nm2_);

int sum = nm1 + nm2;
int sub = nm1 - nm2;
int mul = nm1 * nm2;
int div = nm1 / nm2;

%>
<h2>두 숫자의 연산 결과</h2>
<p><%= nm1 %> + <%= nm2 %> = <%= sum %></p>
<p><%= nm1 %> - <%= nm2 %> = <%= sub %></p>
<p><%= nm1 %> * <%= nm2 %> = <%= mul %></p>
<p><%= nm1 %> / <%= nm2 %> = <%= div %></p>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<H1>hello world</H1>


<!--  스크립트릿 -->

<%

String name = request.getParameter("name");
if(name == null){
	out.print("손님 hi");
}else{
out.print(name + "hi");
}
%>

<!-- 표현식 out.print()로 바뀜 -->

<%=name %>

</body>
</html>
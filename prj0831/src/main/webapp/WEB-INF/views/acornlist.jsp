<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="prj0831.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>학생명단</h2>

<%
ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
/*
for( Member m : list){
	out.println( m+"<br>");
}

*/


for( int i=0 ; i< list.size(); i++ ){
	Member m = list.get(i);
	out.println(  m);
}
%>
</body>
</html>
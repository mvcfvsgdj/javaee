<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% HashMap<String, ArrayList<String>> map =
(HashMap<String, ArrayList<String>>)request.getAttribute("infos");


ArrayList<String> list = map.get("listTest");
for(String item : list){
	out.println(item);
}
ArrayList<String> list2 = map.get("list2Test");

%>
<h2>테스트</h2>
<ul>
<%for(String item : list2){ %>
	

<li><%=item %></li>
<%} %>
</ul>

</body>
</html>
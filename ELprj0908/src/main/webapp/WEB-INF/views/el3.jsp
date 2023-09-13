<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%String str="EL test" ;
out.println(str);
%>
<% if(str.equals("EL test")){	%>
	<div> div test </div>
	
<% }%>
<h3> str 변수의 값은 el 표현식으로 사용할수 없다 : 저장소에 담긴 el표현식만 사용가능 </h3>
${str }
<h3>JSTL과 EL사용하는 코드 ========</h3>
<!--  C:set 으로 변수를 선언하면 pageContext 저장소에 담겨 el 표현식 사용가능 -->
<c:set var="str2" value="EL TEST"/>

<c:if test = "${str2 eq  'EL TEST'}">
<div>el copy</div>
</c:if>



</body>
</html>
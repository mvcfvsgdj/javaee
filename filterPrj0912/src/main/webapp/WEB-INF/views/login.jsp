<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 로그인화면
 
 <form action ="<%=request.getContextPath() %>/login" method="post">
 <input type="text" name="id"><br>
 <input type="text" name="pw">
 <button>로그인</button>
 </form>
</body>
</html>
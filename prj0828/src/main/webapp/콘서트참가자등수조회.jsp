<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/콘서트.css" rel="stylesheet" />
</head>
<body>
<header><h2>참가자조회</h2></header>

	<table>
		<tr>
			<td>참가자id</td>
			<td>참가자이름</td>
			<td>종합점수</td>
			<td>평균점수</td>
			<td>순위</td>
		
		</tr>
			
		<%
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			//1. 오라클드라이버 로딩
			Class.forName(driver);

			//2. 데이터베이스 연결
			con = DriverManager.getConnection(url, user, password);

			//3. statement 얻어오기
			st = con.createStatement();

			//4. 필요한 sql 작성
		   String sql = "SELECT jo.JOIN_ID, jo.JOIN_NM, "
                     + "SUM(sc.SCORE) AS TOTAL_SCORE, "
                     + "ROUND(AVG(sc.SCORE), 2) AS AVERAGE, "
                     + "RANK() OVER (ORDER BY ROUND(AVG(sc.SCORE), 2) DESC) AS RANK "
                     + "FROM tbl_score_200 sc "
                     + "JOIN tbl_join_200 jo ON sc.ARTISTID = jo.JOIN_ID "
                     + "GROUP BY jo.JOIN_ID, jo.JOIN_NM";

		  		    
		  		    
			//5. 최종적으로 실행
			
			System.out.println( sql );
			rs = st.executeQuery(sql);

			//6. 가져온 쿼리 결과를 화면에 출력하기
			while (rs.next()) {
		%>
		
			<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>

			</tr>
		
 <%
	}
	} catch (Exception e) {
	e.printStackTrace();
	} finally { //자원의 반납
	if (rs != null)
	rs.close();
	if (st != null)
	st.close();
	if (con != null)
	con.close();
	}
	
		 %>
			
	</table>
	

<section></section>

</body>
</html>
package prj0901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {

		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public ArrayList<String> selectAll() {
		Connection con = dbcon();

		// sql
		String sql = "select name from acorntbl";
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<String> list = new ArrayList<>();
		// sql실행
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(rs, pst, con);
		return list;

	}

	public void insertMember() {
		// db연결
		Connection con = dbcon();

		// sql작성
		String sql = "insert into acorntbl values ( ?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql실행
			pst = con.prepareStatement(sql);
			pst.setString(1, "test9");
			pst.setString(2, "1234");
			pst.setString(3, "문승수");
			pst.executeUpdate();
		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결해제
		close(pst, con);

	}

	public void insertMember2(String id, String pw, String name) {
		// db연결
		Connection con = dbcon();

		// sql작성
		String sql = "insert into acorntbl values ( ?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql실행
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, name);
			pst.executeUpdate();
		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결해제
		close(pst, con);

	}

	public void insertMember3(Customer c) {
		// db연결
		Connection con = dbcon();

		// sql작성
		String sql = "insert into acorntbl values ( ?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql실행
			pst = con.prepareStatement(sql);
			pst.setString(1, c.getId());
			pst.setString(2, c.getPw());
			pst.setString(3, c.getName());
			pst.executeUpdate();
		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결해제
		close(pst, con);

	}

	/*
	 * public Customer selectOne() { Customer c= new Customer("t1" ,"0000","kai");
	 * return c; }
	 */
	public Customer selectOne(String id) {
		// db연결
		Connection con = dbcon();
		// sql작성
		String sql = "select * from acorntbl where id=? ";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Customer c = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);

			// sql 실행
			// sql 실행결과 Customer 객체로 만들기
			rs = pst.executeQuery();
			if (rs.next()) {
				String id_tmp = rs.getString(1);
				String pw_tmp = rs.getString(2);
				String name_tmp = rs.getString(3);

				c = new Customer(id_tmp, pw_tmp, name_tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 자원연결 해제
		close(rs, pst, con);
		return c;
	}

	public void deleteOne(String id) {
		// 연결
		// sql 작성
		// sql 실행
		// 연결해제
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "delete from acorntbl where id= ?";

		try {

			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
		
	}

	public void close(AutoCloseable... a) {

		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updateMember(Customer c ) {
		//연결
		Connection con = dbcon();
		PreparedStatement pst = null;
		
		//변경 sql작성
		String sql="update acorntbl set pw = ? where id = ?";
		
		//실행
		try {
		pst =	con.prepareStatement(sql);
		pst.setString(1, c.getPw());
		pst.setString(2, c.getId());
		pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, con);
		
		//자원 반납
	}

	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		ArrayList<String> list = dao.selectAll();
		System.out.println(list);

		
		dao.updateMember(new Customer("mj","5555") );
		

		// dao.insertMember();
		// dao.insertMember2("test10","0000","james");
		// Customer c = new Customer("test11","0000","lee");
		// dao.insertMember3(c);

		//Customer c = dao.selectOne("dy");
		//dao.deleteOne("test10");
		//System.out.println(c);
	}
}

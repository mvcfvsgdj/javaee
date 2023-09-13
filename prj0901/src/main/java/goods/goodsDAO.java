package goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import prj0901.Customer;

public class goodsDAO {

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
		
		public ArrayList<String> selectAll() {
			Connection con = dbcon();
			ResultSet rs = null;
			PreparedStatement pst = null;

			// sql
			String sql = "select * from goodstbl";

			ArrayList<String> list = new ArrayList<>();
			// sql실행
			try {
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();

				while (rs.next()) {
					list.add(rs.getString(1));
					list.add(rs.getString(2));
					list.add(rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			close(rs, pst, con);
			return list;
		
		}
		public void insertMenu(goods g) {
			// db연결
			Connection con = dbcon();
			PreparedStatement pst = null;

			// sql작성
			String sql = "insert into goodstbl values ( ?,?,?)";
			try {
				// sql실행
				pst = con.prepareStatement(sql);
				pst.setString(1, g.getId());
				pst.setString(2, g.getName());
				pst.setString(3, g.getPrice());
				pst.executeUpdate();
			} catch (SQLException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 연결해제
			close(pst, con);

		}
}

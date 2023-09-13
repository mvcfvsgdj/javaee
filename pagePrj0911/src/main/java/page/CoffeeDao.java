package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoffeeDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	Connection con = null;

	private Connection dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("db ok");
			}

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

	public ArrayList<Coffee> getAllMenu() {
		Connection con = dbCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = " select * from coffeetbl";
		ArrayList<Coffee> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				Coffee c = new Coffee(code, name, price);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return list;
	}

	public int getTotalCnt() {
		Connection con = dbCon();
		String sql = "select count(*) from coffeetbl";
		int totalCnt = 0;

		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				totalCnt = rs.getInt(1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalCnt;

	}

	public ArrayList<Coffee> getListPage(int page, int pageSize) {
		Connection con = dbCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		int startPage= 0 , endPage=0;
		startPage = ((page-1)*pageSize)+1;
		endPage =page*pageSize;
		ArrayList<Coffee> list = new ArrayList<>();
		String sql = "select * from\r\n"
				+ "(select rownum num ,  code ,name ,price\r\n"
				+ "from coffeetbl)\r\n"
				+ "where num between ? and ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs= pst.executeQuery();
			
			while(rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				Coffee c = new Coffee(code, name, price);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return(list);
		
	}

	public static void main(String[] args) {
		CoffeeDao dao = new CoffeeDao();

		if (dao.dbCon() != null)
			System.out.println("db ready");
		
		int result = dao.getTotalCnt();
		System.out.println(result);
		
		ArrayList<Coffee> res = (ArrayList<Coffee>)dao.getAllMenu();
		System.out.println(res);
	}

}

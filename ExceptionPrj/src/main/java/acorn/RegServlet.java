package acorn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornReg")
public class RegServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		req.getRequestDispatcher("WEB-INF/views/joinus.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 사용자 정보 가져오기
		// Customer 객체 만들기
		// 서비스의 registerCustomer()호출
		// main화면으로 sendRedirect()
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
	
		
		
		Customer c = new Customer(id, pw, name);
		AcornService s = new AcornService();
		try {
			s.registerCustomer(c);
			req.getRequestDispatcher("WEB-INF/views/regOk.jsp").forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			req.getRequestDispatcher("WEB-INF/views/dberr.jsp").forward(req, resp);
		}
		

	}
}

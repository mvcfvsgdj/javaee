package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
		

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//로그인 처리 dao
		
		//아이디와 비번 동일하면 정상로그인
		//불일치시 다시 로그인 화면
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		//일치시 정상로그인
		if(id.equals(pw)) {
			//로그인성공시
			HttpSession session = req.getSession();
			session.setAttribute("id", id);
			
			resp.sendRedirect("/login_09_5/home");
		}else {
			//로그인 화면
			resp.sendRedirect("/login_09_5/login");
		}
		
	}
}

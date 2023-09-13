package prj0831;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get");
		String method = request.getMethod();
		System.out.println(method);
		// 로그인 화면 응답
		RequestDispatcher r = request.getRequestDispatcher("WEB-INF/views/login.jsp");
		r.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getMethod();
		System.out.println(method);
		System.out.println("post");

		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");

		System.out.println(userid);
		System.out.println(userpw);

		// 로그인 , 패스워드를 가지고 데이터정보를 확인한후 정상로그인 후 메인페이지 이동,
		// 아이디 패스워드 문제시 다시 로그인 화면으로 응답

		// 데이터베이스에서 아이디 비번으로 회원인지 확인하는 코드 작성 => 모델
		boolean result = true;  // true 정상로그인 상태 
		if (result) {

			request.getRequestDispatcher("WEB-INF/views/main.jsp").forward(request, response);
		} else {
			// 비정상일 경우
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}

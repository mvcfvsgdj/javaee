package prj0828;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();

		// 크라이언트 정보 추출

		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");

		
		
		// 비지니스 로직

		boolean result = true;

		// 응답 정상적 로그인 , 아이디 비번 잘못된경우
		if (result) {
			out.print(userid + "정상로그인");
		} else {
			out.println("비정상로그인");
		}
		out.close();

	}
}

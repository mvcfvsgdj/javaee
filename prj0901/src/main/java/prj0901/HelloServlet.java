package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//인사제공
//학생리스트 조회
@WebServlet("/hi")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HelloService s = new HelloService();
		String message = s.getMessage();
		System.out.println( message);
		
		request.setAttribute("halo", message);
	//view 포워드
		request.getRequestDispatcher("WEB-INF/views/HiView.jsp").forward(request, response);

	}

}

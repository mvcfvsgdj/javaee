package prj0831;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/hiMVC")
public class HelloMVCServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		// 입력정보 추출

		// 모델 : 데이터를 만드는 일

		// 응답VIEW 처리 흐름을 forward 시킴

		RequestDispatcher r = request.getRequestDispatcher("WEB-INF/views/helloView.jsp");
		r.forward(request, response);

	}
}

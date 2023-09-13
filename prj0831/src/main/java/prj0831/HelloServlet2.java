package prj0831;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/hi2")
public class HelloServlet2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTf-8");
		response.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		//응답할 데이터
		
		
		//view 응답화면 =>JSP로 응답 뷰 작성 
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>"+ name+" hello world!! </h2");
		out.println("</body>");
		out.println("</html>");
	 	
	}
}

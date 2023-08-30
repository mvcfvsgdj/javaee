package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi3")
public class Ex01 extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html"); //응답의형식 MIME , 서버가 보내는데이터형식 알린다. "text/plain"
	response.setCharacterEncoding("utf-8");  // 서버를 UTF-8형식으로 보냄
	PrintWriter out= response.getWriter();
	out.println("<html>"); //html,css
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h2>hello  world !!</h2>");
	out.println("</body>");
	out.println("</html>");
}
	
}

package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03")
public class Ex03 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 	PrintWriter out = resp.getWriter();
		 	
	
		 	
		 	out.println("<html>");
		 	
		 	out.println("<head>");
		 	out.println("</head>");
		 	out.println("<body>");
		 	out.println("<a href=\"https://storage.enuri.info/pic_upload/knowbox2/202305/01493547720230513be14b7a6-0ca3-421d-a85f-e7abc65fee78.jpeg\">링크 텍스트</a>")	;
		 	out.println("</body>");
		 	out.println("</html>");
		 	
	}
}

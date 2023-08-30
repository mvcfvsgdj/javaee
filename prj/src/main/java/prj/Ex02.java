package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class Ex02 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//키값으로 VALUE 값을 얻어올 수 있다
		String nm1_ = request.getParameter("nm1");
		String nm2_ = request.getParameter("nm2");

		int nm1 = Integer.parseInt(nm1_);
		int nm2 = Integer.parseInt(nm2_);
	
		int sum = nm1+nm2;
		
	PrintWriter out =	response.getWriter();
	out.print(sum);
	
	}
}

package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex6")
public class ex6 extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	String NUM1 = req.getParameter("NUM");
	PrintWriter out = resp.getWriter();
	int NUM = Integer.parseInt(NUM1);
	
	for(int i = 1 ; i <=NUM; i++) {
		if(NUM%i==0) {
			out.print(i);
		}
	
		
		
	}
	
}
}

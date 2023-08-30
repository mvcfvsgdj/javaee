package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex3")
public class ex3 extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String NUM1 = req.getParameter("NUM");
	PrintWriter out = resp.getWriter();
	int NUM = Integer.parseInt(NUM1);
	
	
	for(int i= 1 ; i<=9; i++){
		int mul = (NUM*i);
		out.println(mul);
		
		
	}
 
 }
}

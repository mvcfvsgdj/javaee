package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ex0")
public class ex1test extends HttpServlet{
@Override
protected void service(HttpServletRequest req,
		HttpServletResponse resp) throws ServletException, IOException {

	String nm1_ = req.getParameter("nm1");
	String nm2_ = req.getParameter("nm2");
	
	int nm1 = Integer.parseInt(nm1_);
	int nm2 = Integer.parseInt(nm2_);

	int sum = nm1+nm2;
	int sub = nm1-nm2;
	
	int mul = nm1*nm2;
	int div = nm1/nm2;
	
	PrintWriter out =	resp.getWriter();
	out.print(sum);
	out.print(sub);
	out.print(mul);
	out.print(div);
	
}
}

package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex2")
public class ex2 extends HttpServlet {
@Override
protected void service(HttpServletRequest req,
		HttpServletResponse resp) throws ServletException, IOException {


	
	
	int nm1 =3;	
	for(int i = 1; i<=9; i++) {
		int mul = nm1*i;
		PrintWriter out =	resp.getWriter();
		out.print(mul);
	}

}
}

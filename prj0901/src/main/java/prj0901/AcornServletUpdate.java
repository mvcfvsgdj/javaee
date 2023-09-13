package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class AcornServletUpdate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String newpw = request.getParameter("newpw");
		//처리
		
		//model (서비스,dao)
		AcornService s = new AcornService();
		Customer c= new Customer(id, newpw);
		s.modifyMember(c);
		//view 응답 
		request.setAttribute("id", newpw);
		request.getRequestDispatcher("WEB-INF/views/update.jsp").forward(request, response);
		//삭제
	}
}
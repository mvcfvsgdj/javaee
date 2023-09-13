package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹요청 - > db등록
@WebServlet("/reg")
public class AcornServletReg extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
	
		//등록서비스 
		
		//
		AcornService s = new AcornService();
		
		s.registerMember(new Customer(id,pw,name));
		request.getRequestDispatcher("WEB-INF/views/ok.jsp").forward(request, response);
		
	}

}

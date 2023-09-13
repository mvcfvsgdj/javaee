package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class AcornServletDelete extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//사용자 정보 가져오기
			
			String id= request.getParameter("id");
			
			//모델
			AcornService s = new AcornService();
			//
			s.deleteMember(id);
			//모델심기
			
			request.setAttribute("id", id);
			request.getRequestDispatcher("WEB-INF/views/delete.jsp").forward(request, response);
			
		}
}
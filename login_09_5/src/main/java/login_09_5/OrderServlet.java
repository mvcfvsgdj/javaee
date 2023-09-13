package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//주문요청시
		//로그인상태 확인 후 주문정보를 보여주거나 로그인화면이동
		//세션저장소에서 id값확인하고 로그인 여부 확인
		
		HttpSession session = req.getSession();
		String id = (String)session.getAttribute("id");
		if(id !=null) {//로그인시 주문페이지 응답
			req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
			
		}else {
			resp.sendRedirect("/login_09_5/login");
		}
		
		
		//해당고객으 ㅣ주문목록 가져오기
		// 서비스 , dao
		
		
		
	}
}

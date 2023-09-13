package goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/goodsadd")
public class goodsAddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		
		System.out.println( id);
		
		goodsService s = new goodsService();
		s.newMenuAdd(new goods(id, name, price));
		request.setAttribute("add", id );
		request.setAttribute("add1", name );
		request.setAttribute("add2", price );

		
		request.getRequestDispatcher("WEB-INF/goodsviews/goodsAdd.jsp").forward(request, response);
	}
}

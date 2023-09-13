package page;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/coffee.page")
public class CoffeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String p = req.getParameter("p");
	int currentPage=1;
	
	if(p!=null) {
		currentPage = Integer.parseInt(p);
		
	}
	CoffeeDao dao = new CoffeeDao();
	int totRecords = dao.getTotalCnt();
	
	System.out.println(totRecords);
	
	int pageSize=5;
	int grpSize =2;
	
	PageHandler2 handler = new PageHandler2(currentPage, totRecords, pageSize, grpSize);
	
	System.out.println("s" + handler.getGrpStartPage());
	System.out.println("s" + handler.getGrpEndPage());
	
	
	
	ArrayList<Coffee> list = dao.getListPage(currentPage, pageSize);
	
	req.setAttribute("list", list);
	req.setAttribute("handler2", handler);
	
	req.getRequestDispatcher("WEB-INF/views/coffeetest.jsp").forward(req, resp);
	
	}
}

package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jstl8")
public class Jstl8 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
	    String[] game = { "롤" , "스타", "오버워치" };
	   
	    String[] bookNames = {  "소설" , "역사" , "인문",  "정치" , "미술" ,"종교" ,"여행", "과학"}  ;
	    
	    ArrayList<Coffee> coffeelist = new ArrayList<>();
	    coffeelist.add(new Coffee("c001", "아메리카노" , 1500));
	    coffeelist.add(new Coffee("c002", "라떼" , 3500));
	    coffeelist.add(new Coffee("c003", "에이드" , 4500));
	    
	    
	    
	    System.out.println(coffeelist);
	    req.setAttribute("coffeelist", coffeelist);
	    req.setAttribute("game", game);
	    req.setAttribute("book", bookNames);
		req.getRequestDispatcher("WEB-INF/views/jstl8.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


	
	
		   String id = req.getParameter("id");
		   
		   resp.sendRedirect("WEB-INF/views/jstl8.jsp");
	}
}

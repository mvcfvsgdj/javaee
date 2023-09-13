package prj0913;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mapex")
public class MapServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//service통해 모델 얻어오기
		HashMap<String, ArrayList<String>> map =new HashMap<>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("test4");
		list.add("test5");
		list.add("test6");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("test7");
		list2.add("test8");
		list2.add("test9");
		System.out.println(list2);
		
		map.put("listTest", list);
		map.put("list2Test", list2);
		
		req.setAttribute("infos", map);
		req.getRequestDispatcher("WEB-INF/views/infos2.jsp").forward(req, resp);
	}
}

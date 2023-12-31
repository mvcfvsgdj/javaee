package prj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10")
public class ex10 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 	PrintWriter out = resp.getWriter();
		 	
		 	String[] imageArray = {
		 		    "<a href=\"https://storage.enuri.info/pic_upload/knowbox2/202305/01493547720230513be14b7a6-0ca3-421d-a85f-e7abc65fee78.jpeg\">링크 텍스트</a>"
		 		   ,"<a href=\"https://d2u3dcdbebyaiu.cloudfront.net/uploads/atch_img/829/124bb068842e6676eb2b90f714458885_res.jpeg\">링크 텍스트</a>"
		 		   ,"<a href=\"https://coinpan.com/files/attach/images/198/607/393/231/4d7f809b1362de3d6a6a9c54565170aa.jpeg\">링크 텍스트</a>"
		 		};
		 	
	        resp.setContentType("text/html");
	        resp.setCharacterEncoding("UTF-8");

	        for (String image : imageArray) {
	            out.println(image);
	            out.println("<br>");
	        }
	    }
	}

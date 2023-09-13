package prj0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//m:model : pojo 자바로작성 <service, dao(repository)>
//v:view  : jsp 응답할 view 작성 *html,css,javascript
//c:servlet :요청,응답까지의 흐름


@WebServlet("/MVC1")
public class MVCServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Model , 데이터
		String message = "hello world!";

		// request를 저장소로 사용함 (mvc)
		// request 저장소에 model심기
		request.setAttribute("msg", message);// 키 , 값
		request.getRequestDispatcher("WEB-INF/views/MVC1.jsp").forward(request, response);

	}

}

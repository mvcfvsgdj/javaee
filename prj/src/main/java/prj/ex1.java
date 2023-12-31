package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex1")
public class ex1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html"); //응답의형식 MIME , 서버가 보내는데이터형식 알린다. "text/plain"
    	resp.setCharacterEncoding("utf-8");  // 서버를 UTF-8형식으로 보냄
        PrintWriter out = resp.getWriter();
        
        String nm1_ = req.getParameter("nm1");
        String nm2_ = req.getParameter("nm2");
        
        int nm1 = Integer.parseInt(nm1_);
        int nm2 = Integer.parseInt(nm2_);

        int sum = nm1 + nm2;
        int sub = nm1 - nm2;
        int mul = nm1 * nm2;
        int div = nm1 / nm2;

        out.println("<html>");
        out.println("<head>");
        out.println("<title>수학 연산</title>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<h2>두 숫자의 연산 결과</h2>");
        
        out.println("<p>" + nm1 + " + " + nm2 + " = " + sum + "</p>");
        out.println("<p>" + nm1 + " - " + nm2 + " = " + sub + "</p>");
        out.println("<p>" + nm1 + " * " + nm2 + " = " + mul + "</p>");
        out.println("<p>" + nm1 + " / " + nm2 + " = " + div + "</p>");
        
        out.println("</body>");
        out.println("</html>");
    }
}
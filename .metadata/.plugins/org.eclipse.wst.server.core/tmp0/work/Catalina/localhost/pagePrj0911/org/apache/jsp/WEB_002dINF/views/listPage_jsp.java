/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-11 02:25:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import page.Member;
import java.util.ArrayList;
import page.MemberDao;

public final class listPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("page.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("page.MemberDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
 ArrayList<Member>  list =  (ArrayList<Member>)request.getAttribute("list1") ;  
for( Member m: list) {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td> ");
      out.print(m.getM_id() );
      out.write("</td>\r\n");
      out.write("<td> ");
      out.print(m.getM_name() );
      out.write("</td>\r\n");
      out.write("<td> ");
      out.print(m.getM_pw() );
      out.write("</td>\r\n");
      out.write("<td> ");
      out.print(m.getM_birthday() );
      out.write("</td>\r\n");
      out.write("<td> ");
      out.print(m.getM_tel() );
      out.write("</td>\r\n");
      out.write("<td> ");
      out.print(m.getM_point() );
      out.write("</td>\r\n");
      out.write("<td> ");
      out.print(m.getM_grade() );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("</table>\r\n");

	int currentPage=1;
	if( request.getAttribute("p") != null){
		 currentPage  =(Integer) request.getAttribute("p");		 
	} 
     
	 int totRecords = 0; // 총 레코드 수 
	 totRecords  =  (Integer)request.getAttribute("totCnt");
	 int pageSize =2;    //페이지 사이즈  (데이터 건수 , 한 페이징 보이는 레코드 수 )	 	 
	 int totalPage;             // 총 페이지수: 전체 페이수   	 
	 int grpSize=5;             // 한 그룹에 5깨씩 보겟다
	 int currentGrp =0;  	    // 현재그룹
	// int currentPage =1;
	 	 
	 
	 int reamin = totRecords  %  pageSize ;		 
	 //총 페이지수 구하기
	 if( reamin ==0 )
		 totalPage = totRecords / pageSize;
		 
	 else 
		 totalPage = totRecords / pageSize +1;
	    
	  
	 
	 // 현재그룹 구하기
	 // 현재그룹의 시작번호
	 // 현재그룹의 끝번호
	 int remain2 = currentPage % grpSize;    // 7 => 그룹2  ,  시작 6 , 끝 10
	 
	 
	 if( remain2 ==0 )
		 currentGrp  = currentPage  / grpSize ;     //  10 /5 =>2  , 2번째 그룹 
		 
	 else 
		 currentGrp = currentPage  / grpSize  +1;   //  4 /5 + 1 => 1번째 그룹 ,  7 /5 => 1 +1 => 2그룹 
	 
		 
	 int grpStartPage = ( currentGrp -1 ) * grpSize +1 ;  // 그룹의 시작번호   현재그룹 1 => 1  , 현재그룹 2 -> 6
	 int grpEndPage = currentGrp * grpSize;               // 그룹의 끝번호    1-> 5  , 2-> 10
	 
	 
	 if( grpEndPage > totalPage){
		 grpEndPage = totalPage;    // 그룹의 끝번호   10 -> 9로 변경 , 그룹의 끝번호가 마지막페이지번호 크다면
	 }
	 
	 
	 
	 
	 int index = grpStartPage;	 
	 if( currentGrp >1){	
      out.write("\r\n");
      out.write("		 \r\n");
      out.write("	     <a href=\"/pagePrj0911/list.page?p=");
      out.print(index-1);
      out.write("\">[ 이전 ]</a>  \r\n");
      out.write("	    \r\n");
      out.write("	 ");
   
	 } 
	 
	 
	 while( index <= grpEndPage){		 
	 
      out.write("\r\n");
      out.write("		  <a href=\"/pagePrj0911/list.page?p=");
      out.print(index);
      out.write("\">[  ");
      out.print(index );
      out.write(" ]</a> \r\n");
      out.write("        ");

		  index ++;
        
	 }
	 
	 if( grpEndPage  <   totalPage  ){
	 
	 
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		   <a href=\"/pagePrj0911/list.page?p=");
      out.print(grpEndPage+1);
      out.write("\">[ 다음 ]</a>  \r\n");
      out.write("	");
 }
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

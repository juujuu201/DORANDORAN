/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-09-14 15:25:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import doran.db.connection.DBConnection;
import org.apache.commons.io.output.ByteArrayOutputStream;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public final class bookView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("doran.db.connection.DBConnection");
    _jspx_imports_classes.add("java.awt.image.BufferedImage");
    _jspx_imports_classes.add("org.apache.commons.io.output.ByteArrayOutputStream");
    _jspx_imports_classes.add("javax.imageio.ImageIO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>도란도란 : 도서 상세 페이지</title>\r\n");
      out.write("<!--\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/logo.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"img/logo_apple.png\">\r\n");
      out.write("-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Sunflower:300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write(".thumbnail{\r\n");
      out.write("\twidth:300px;\r\n");
      out.write("\theight:450px;\r\n");
      out.write("\tborder:solid 2px #311b1b;\r\n");
      out.write("}\r\n");
      out.write("b{\r\n");
      out.write("\tfont-size:50px;\r\n");
      out.write("}\r\n");
      out.write("#upper{\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("}\r\n");
      out.write("#price{\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("\tcolor:#ed6853;\r\n");
      out.write("\tmargin-bottom:180px;\r\n");
      out.write("}\r\n");
      out.write(".btn{\r\n");
      out.write("\tbackground-color:#311b1b;\r\n");
      out.write("\tcolor:lightgoldenrodyellow;\r\n");
      out.write("\tborder-radius:20px;\r\n");
      out.write("\tborder:0;\r\n");
      out.write("\toutline:0;\r\n");
      out.write("\tpadding:3%;\r\n");
      out.write("\tfont-size:120%;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("#specific{\r\n");
      out.write("\tborder: 2px solid #311b1b;\r\n");
      out.write("\tbackground-color:lightgoldenrodyellow;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topp.jsp", out, false);
      out.write("<p>\r\n");
      out.write("<p></p>\r\n");
	
		Cookie[] cookies=request.getCookies();
		String id="";
		
		for(int i=0; i<cookies.length; i++){
			if(cookies[i].getName().equals("id")){
        		id=cookies[i].getValue();
			}
		}
		

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<form name=\"form\" action=\"insertBought.jsp\">\r\n");
      out.write("<table id=\"whole\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"box\" align=\"center\">\r\n");
      out.write("\t\t\t\t");

					request.setCharacterEncoding("utf-8");
					
					String title=request.getParameter("title");
					
					//db연결
					Connection conn=null;
					PreparedStatement pstmt=null;
					ResultSet rs=null;
					
					try{
						conn=DBConnection.getCon();
						
						String sql="select title, writer, publisher, publish_date, genres.genre as genre, price, stock, translator from book, genres where book.genre=genres.genre_num AND title=?";
						
						pstmt=conn.prepareStatement(sql);
						pstmt.setString(1,title);
						rs=pstmt.executeQuery();
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table width=\"80%\" align=\"center\" id=\"books\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								while(rs.next()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"50%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img class=\"thumbnail\" src=\"imgView.jsp?title=");
      out.print(title);
      out.write("\"><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"50%\" style=\"padding-left:20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b>");
      out.print(title);
      out.write("</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"upper\">");
      out.print(rs.getString("writer") );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"price\">");
      out.print(rs.getString("price") );
      out.write("원</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t구매 권 수 : <input type=\"number\" name=\"num\" style=\"width:100px;height:20px;font-size:20px;\"><br><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"title\" value=\"");
      out.print(title);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("price") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"stock\" value=\"");
      out.print(rs.getString("stock") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"seller\" value=\"도란도란\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"book\" value=\"책\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction check(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(document.form.num.value==\"\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"구매하실 권 수 를 입력해주세요\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.form.num.focus();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(document.form.num.value>");
      out.print(Integer.parseInt(rs.getString("stock")));
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"재고가 부족해 입력하신 권 수 만큼 구매하실 수 없습니다\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.form.num.focus();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(document.form.num.value==0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"재고가 모두 소진되었습니다\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.form.num.focus();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"");
      out.print(title);
      out.write("을 \"+document.form.num.value+\"권 주문하시겠습니까?\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"주문이 완료되었습니다 :)\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.forms['form'].submit();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}//function check()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" id=\"enroll\" class=\"btn\" value=\"구매하기\" onclick=\"check()\">)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 상세정보 -->\r\n");
      out.write("\t\t\t\t\t\t<table id=\"specific\" width=\"50%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" colspan=2><p style=\"font-size:30px;\">상세정보</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\" align=\"right\" style=\"padding-right:20px;\">제목</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
      out.print(title);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\" align=\"right\" style=\"padding-right:20px;\">작가</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
      out.print(rs.getString("writer") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\" align=\"right\" style=\"padding-right:20px;\">출판사</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
      out.print(rs.getString("publisher") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\" align=\"right\" style=\"padding-right:20px;\">출판일</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
      out.print(rs.getString("publish_date") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\" align=\"right\" style=\"padding-right:20px;\">장르</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
      out.print(rs.getString("genre") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\" align=\"right\" style=\"padding-right:20px;\">옮긴이</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
      out.print(rs.getString("translator") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><br></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t");
}//while 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 후기 -->\r\n");
      out.write("\t\t\t\t\t\t");

							sql="select * from comments where title=? order by num";
							pstmt=conn.prepareStatement(sql);
							pstmt.setString(1,title);
							rs=pstmt.executeQuery();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t<table id=\"specific\" width=\"50%\" align=\"center\" style=\"margin-bottom:20px\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"specific\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" colspan=2><p style=\"font-size:30px;\">후기</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
	while(rs.next()){
						
      out.write("\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding:10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<details style=\"border:2px solid #311b1b;border-radius:10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<summary style=\"background-color:#311b1b;padding:2%;color:lightgoldenrodyellow;\">");
      out.print(rs.getString("ctitle") );
      out.write("</summary>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"padding:2%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t작성자 : ");
      out.print(rs.getString("id") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rs.getString("content") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</details>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t");
}//while
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\t\t\t\r\n");
      out.write("\t\t\t\t\t");
}
					catch(SQLException e){
						e.printStackTrace();
					}
					finally{
						try{
							if(pstmt!=null) pstmt.close();
							if(conn!=null) conn.close();
						}
						catch(SQLException e){
							System.out.println(e.getMessage());
						}
					}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
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

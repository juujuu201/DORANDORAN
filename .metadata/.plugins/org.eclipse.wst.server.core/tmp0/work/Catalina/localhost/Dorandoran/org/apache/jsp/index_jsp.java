/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-09-13 09:59:24 UTC
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

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>도란도란</title>\r\n");
      out.write("<!--\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/logo.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"img/logo_apple.png\">\r\n");
      out.write("-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Sunflower:300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction login(){\r\n");
      out.write("\t\talert(\"로그인 후 이용하실 수 있습니다\");\r\n");
      out.write("\t\treturn ;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write(".thumbnail{\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("\theight:300px;\r\n");
      out.write("}\r\n");
      out.write(".link{\r\n");
      out.write("\tcolor:#311b1b;\r\n");
      out.write("}\r\n");
      out.write("b:hover{\r\n");
      out.write("\tcolor:#ed6853;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("<p>\r\n");
      out.write("<p></p>\r\n");
      out.write("<table id=\"whole\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"box\" align=\"center\">\r\n");
      out.write("\t\t\t\t");

					String id=request.getParameter("id");
					//db연결
					Connection conn=null;
					PreparedStatement pstmt=null;
					ResultSet rs=null;
					
					String sql="select title, writer, price from book";
					int count=1;
					
					try{
						conn=DBConnection.getCon();
						pstmt=conn.prepareStatement(sql);
						rs=pstmt.executeQuery();
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table width=\"80%\" align=\"center\" id=\"books\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								while(rs.next()){
									if(count%3==1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"5%\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a onclick=\"login()\" class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"thumbnail\" src=\"imgView.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<b>");
      out.print(rs.getString("title") );
      out.write("</b><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rs.getString("writer") );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
	}//if
									else if(count%3==2){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a onclick=\"login()\" class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"thumbnail\" src=\"imgView.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>");
      out.print(rs.getString("title") );
      out.write("</b><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(rs.getString("writer") );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
									else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a onclick=\"login()\" class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"thumbnail\" src=\"imgView.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<b>");
      out.print(rs.getString("title") );
      out.write("</b><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rs.getString("writer") );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"5%\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
									count++;
								}//while
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t");

					}
					catch(SQLException e){
						System.out.println(e.getMessage());
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

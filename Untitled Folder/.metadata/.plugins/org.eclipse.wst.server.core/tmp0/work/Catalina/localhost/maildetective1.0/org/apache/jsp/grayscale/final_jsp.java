/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2014-06-23 05:06:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.grayscale;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import check.test5query;

public final class final_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("<!-- The MIT License (MIT)\n");
      out.write("\n");
      out.write("Copyright (c) IIIT-DELHI \n");
      out.write("authors:\n");
      out.write("HEMANT JAIN \"hjcooljohny75@gmail.com\"\n");
      out.write("ANIRUDH NAIN \n");
      out.write("\n");
      out.write("\n");
      out.write("Permission is hereby granted, free of charge, to any person obtaining a copy\n");
      out.write("of this software and associated documentation files (the \"Software\"), to deal\n");
      out.write("in the Software without restriction, including without limitation the rights\n");
      out.write("to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n");
      out.write("copies of the Software, and to permit persons to whom the Software is\n");
      out.write("furnished to do so, subject to the following conditions:\n");
      out.write("\n");
      out.write("The above copyright notice and this permission notice shall be included in\n");
      out.write("all copies or substantial portions of the Software.\n");
      out.write("\n");
      out.write("THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n");
      out.write("IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n");
      out.write("FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n");
      out.write("AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n");
      out.write("LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n");
      out.write("OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN\n");
      out.write("THE SOFTWARE. -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"ico/E-Mail.ico\">\n");
      out.write("<title>Mail Detective</title>\n");
 String s;
test5query dem = new test5query();
test5query de = new test5query();
test5query d = new test5query();
String[] id =new String[1];
String[] dat =new String[1];
String[] nam =new String[1];
s=request.getParameter("itemId");
dem.mai("SELECT ?x WHERE { ?y <MESSAGEID:> '"+s+ "' . ?y <SUB:> ?x} LIMIT 1 ");
id[0]=test5query.arr[0];
out.println("SUBJECT:"+id[0]+"<br>");
dem.mai("SELECT ?x WHERE { ?y <MESSAGEID:> '"+s+ "' . ?y <FROM:> ?x} LIMIT 1 ");
id[0]=test5query.arr[0];
out.println("FROM:"+id[0]+"<br>");
dem.mai("SELECT ?x WHERE { ?y <MESSAGEID:> '"+s+ "' . ?y <DATE:> ?x} LIMIT 1 ");
id[0]=test5query.arr[0];
out.println("DATE:"+id[0]+"<br>");
dem.mai("SELECT ?x WHERE { ?y <MESSAGEID:> '"+s+ "' . ?y <CONTENT:> ?x} LIMIT 1 ");
id[0]=test5query.arr[0];
out.println("CONTENT:"+id[0]+"<br>");




      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

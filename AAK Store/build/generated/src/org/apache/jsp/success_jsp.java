package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write(" background-image: url(\"Images/contact2.jpg\");\n");
      out.write(" background-size: cover;\n");
      out.write("}\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("color: white;\n");
      out.write("text-align: center;\n");
      out.write("}\n");
      out.write("a\n");
      out.write("{\n");
      out.write("color:white;}\n");
      out.write("</style>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Success</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <video src=\"Videos/Ecommerce.mp4\"></video>\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("<h1 style=\"color: teal\">Thanks for sending your message.</h1>\n");
      out.write("<h1 style=\"color: teal\">We will contact you soon...</h1>\n");
      out.write("<h1><a style=\"color: #0069d9\" href=\"index.jsp\">Home</a></h1>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

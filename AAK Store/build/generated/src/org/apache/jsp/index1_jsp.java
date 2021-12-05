package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Fire Animation</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/index1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"text\">\n");
      out.write("    <h2>AAK STORE</h2>\n");
      out.write("  </div>\n");
      out.write("  <svg>\n");
      out.write("    <filter id=\"fire\">\n");
      out.write("      <feTurbulence id=\"turbulence\" baseFrequency=\"0.1 0.1\" numOctave=\"2\" seed=\"3\">\n");
      out.write("        <animate attributeName=\"baseFrequency\" dur=\"10s\" values=\"0.1 0.1;0.12 0.2\" repeatCount=\"indefinite\"></animate>\n");
      out.write("      </feTurbulence>\n");
      out.write("       <feDisplacementMap in=\"SourceGraphic\" scale=\"25\"></feDisplacement>\n");
      out.write("    </filter>\n");
      out.write("  </svg>\n");
      out.write("  <button style=\"width: 95; height: 30; background: transparent;border: transparent\"><span style=\"font-size: 20; font-weight: bold;color: white;\"><a href=\"index.jsp\">Proceed</a></span></button>\n");
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

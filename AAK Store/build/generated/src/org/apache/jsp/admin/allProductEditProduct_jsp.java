package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import project.ConnectionProvider;
import java.sql.Connection;

public final class allProductEditProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/adminHeader.jsp");
    _jspx_dependants.add("/admin/../footer.jsp");
  }

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
      			"../error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("        ");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("            <center><h2>Online shopping  AAK Store</h2></center>\r\n");
      out.write("            <a href=\"addNewProduct.jsp\">Add New Product <i class='fas fa-plus-square'></i></a>\r\n");
      out.write("            <a href=\"allProductEditProduct.jsp\">All Products & Edit Products <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"\">Messages Received <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"\">Orders Received <i class=\"fas fa-archive\"></i></a>\r\n");
      out.write("            <a href=\"\">Cancel Orders <i class='fas fa-window-close'></i></a>\r\n");
      out.write("            <a href=\"\">Delivered Orders <i class='fas fa-dolly'></i></a>\r\n");
      out.write("            <a href=\"../logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write('\r');
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ AAK Store </p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<style>\r\n");
      out.write("h3\r\n");
      out.write("{\r\n");
      out.write("\tcolor: yellow;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">All Products & Edit Products <i class='fab fa-elementor'></i></div>\r\n");

  String msg=request.getParameter("msg");
  if("done".equals(msg))
  {

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Product Successfully Updated!</h3>\r\n");
}
      out.write('\r');
      out.write('\n');

if("wrong".equals(msg))
{

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Some thing went wrong! Try again!</h3>\r\n");
}
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th scope=\"col\">ID</th>\r\n");
      out.write("            <th scope=\"col\">Name</th>\r\n");
      out.write("            <th scope=\"col\">Category</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> Price</th>\r\n");
      out.write("            <th>Status</th>\r\n");
      out.write("            <th scope=\"col\">Edit <i class='fas fa-pen-fancy'></i></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("       ");

         try
         {
          Connection con=ConnectionProvider.getCon();
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from product;");
          while(rs.next())
          {
       
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>");
rs.getInt(1);
      out.write("</td>\r\n");
      out.write("            <td>");
rs.getString(2);
      out.write("</td>\r\n");
      out.write("            <td>");
rs.getString(3);
      out.write("</td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
rs.getInt(4);
      out.write("</td>\r\n");
      out.write("            <td>");
rs.getString(5);
      out.write("</td>\r\n");
      out.write("            <td><a href=\"editProduct.jsp?id=");
rs.getInt(1);
      out.write("\">Edit <i class='fas fa-pen-fancy'></i></a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         ");

          }
         }
         catch(Exception e)
         {
           System.out.println(e);
         }
         
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

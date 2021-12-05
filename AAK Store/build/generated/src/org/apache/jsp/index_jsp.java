package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AAK Store</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css//Frontstyle.css\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"Images/MyLogo.jpg\" width=\"60px\" style=\"border-radius: 50%;\">\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\">Home</a></li>\n");
      out.write("                    <li><a href=\"ProductDetails.jsp\">Products</a></li>\n");
      out.write("                    <li><a href=\"aboutus.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"contactus.jsp\">Contact</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Account</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <img src=\"Images/cart.png\" width=\"30px\" height=\"30px\">\n");
      out.write("        </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <h1>Give Your Workout<br>A New Style!</h1>\n");
      out.write("                    <p>Success isn't always about greatness. It's about consistency. Consistent<br>hard work gains success. Greatness will come.</p>\n");
      out.write("                    <a href=\"ProductDetails.jsp\" class=\"btn\">Explore Now &#8594;</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <img src=\"Images/image1.png\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!------featured categories------->\n");
      out.write("        <div class=\"categories\">\n");
      out.write("           <div class=\"small-container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <img src=\"Images/category-1.jpg\">\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <img src=\"Images/category-2.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <img src=\"Images/category-3.jpg\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-----Featured Products----->\n");
      out.write("        \n");
      out.write("        <div class=\"small-container\">\n");
      out.write("            <h2 class=\"title\">Featured Products</h2>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-1.jpg\">\n");
      out.write("                    <h4>Red Printed T-Shirt</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 349.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-2.jpg\">\n");
      out.write("                    <h4>Sports Black Shoes</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 499.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-3.jpg\">\n");
      out.write("                    <h4>Grey Trouser</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 459.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-4.jpg\">\n");
      out.write("                    <h4>Puma Plain T-Shirt</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 399.00</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <h2 class=\"title\">Latest Products</h2>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-5.jpg\">\n");
      out.write("                    <h4>Sports Long Shoes(Grey)</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 849.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-6.jpg\">\n");
      out.write("                    <h4>Puma Black T-Shirt</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 499.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-7.jpg\">\n");
      out.write("                    <h4>HRX Socks (Pack of 3)</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 159.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-8.jpg\">\n");
      out.write("                    <h4>Fossil Metallic Chain Watch</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 899.00</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-9.jpg\">\n");
      out.write("                    <h4>Sport Watch</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 269.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-10.jpg\">\n");
      out.write("                    <h4>Sports Black Shoes</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 699.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-11.jpg\">\n");
      out.write("                    <h4>Grey Shoes</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 439.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <img src=\"Images/product-12.jpg\">\n");
      out.write("                    <h4>Black Lower</h4>\n");
      out.write("                    <div class=\"rating\">\n");
      out.write("                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star\"></i>\n");
      out.write("                        <i class=\"fa fa-star-o\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Rs 299.00</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-----Offer----->\n");
      out.write("        <div class=\"offer\">\n");
      out.write("            <div class=\"small-container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <img src=\"Images/exclusive.png\" class=\"offer-img\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <p>Exclusively Available on AAK Store</p>\n");
      out.write("                        <h1>Smart Ban 4</h1>\n");
      out.write("                        <small>The Mi Smart Band 4 features a 39.9% larger(than Mi Band 3) Amoled color full-touch display with adjustable brightness, so everything is clear as can be.</small><br>\n");
      out.write("                        <a href=\"login.jsp\" class=\"btn\">Buy Now &#8594;</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-----testimonial----->\n");
      out.write("        \n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("            <div class=\"small-container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <i class=\"fa fa-quote-left\"></i>\n");
      out.write("                        <p>rana.prabhat@gmail.com<br>+919105572029<br></p>\n");
      out.write("                        <div class=\"rating\">\n");
      out.write("                          <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star-o\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <img src=\"Images/Prabhat.jpg\">\n");
      out.write("                        <h3>Prabhat Rana</h3>\n");
      out.write("                        <p>Head - Sales &AMP; Marketing</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <i class=\"fa fa-quote-left\"></i>\n");
      out.write("                        <p>atifali6398@gmail.com<br>+916398302103</p>\n");
      out.write("                        <div class=\"rating\">\n");
      out.write("                          <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star-o\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <img src=\"Images/Atif.jpg\">\n");
      out.write("                        <h3>Atif Ali Khan</h3>\n");
      out.write("                        <p>Founder &AMP; CEO</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <i class=\"fa fa-quote-left\"></i>\n");
      out.write("                        <p>vgk123@gmail.com<br>+918273343222</p>\n");
      out.write("                        <div class=\"rating\">\n");
      out.write("                          <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star\"></i>\n");
      out.write("                          <i class=\"fa fa-star-o\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <img src=\"Images/Vivek.jpg\">\n");
      out.write("                        <h3>Vivek Kumar Garg</h3>\n");
      out.write("                        <p>Head - Technical</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-----brands----->\n");
      out.write("        \n");
      out.write("        <div class=\"brands\">\n");
      out.write("            <div class=\"small-container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <img src=\"Images/logo-godrej.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <img src=\"Images/logo-oppo.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <img src=\"Images/logo-coca-cola.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <img src=\"Images/logo-paypal.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <img src=\"Images/logo-philips.png\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-----footer----->\n");
      out.write("        \n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"footer-col-1\">\n");
      out.write("                        <h3>Download Our App</h3>\n");
      out.write("                        <p>Download App for Android and ios mobile phone.</p>\n");
      out.write("                        <div class=\"app-logo\">\n");
      out.write("                            <img src=\"Images/play-store.png\">\n");
      out.write("                            <img src=\"Images/app-store.png\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col-2\">\n");
      out.write("                        <img src=\"Images/FooterLogo.jpg\" style=\"width: 100px; height: 100px; border-radius: 50%;\" >\n");
      out.write("                        <p>Our Purpose Is to Substantially Make the Pleasure and Benefits of Sports Accessible to the Many.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col-3\">\n");
      out.write("                        <h3>Useful Links</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Coupons</li>\n");
      out.write("                            <li>Blog Post</li>\n");
      out.write("                            <li>Return Polcy</li>\n");
      out.write("                            <li>Join Affiliates</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col-4\">\n");
      out.write("                        <h3>Follow us</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Facebook</li>\n");
      out.write("                            <li>Twitter</li>\n");
      out.write("                            <li>Instagram</li>\n");
      out.write("                            <li>YouTube</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <p class=\"copyright\">Copyright 2021 - AAK Store</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"JS/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JS/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

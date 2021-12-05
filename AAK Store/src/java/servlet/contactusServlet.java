package servlet;

import Action.contactusAction;
import beans.contactusbean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class contactusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
          String name=request.getParameter("name");
          String email=request.getParameter("email");
          String message=request.getParameter("message");
          
          contactusbean data=new contactusbean();
          data.setName(name);
          data.setEmail(email);
          data.setMessage(message);
          contactusAction ac=new contactusAction();
          if(ac.contactInsert(data))
          {
             response.sendRedirect("success.jsp");
          }
          else
          {
            
          }
    }
}

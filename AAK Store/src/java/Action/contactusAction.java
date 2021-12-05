package Action;

import beans.contactusbean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import project.ConnectionProvider;

public class contactusAction 
{
    boolean b=false;
    public boolean contactInsert(contactusbean data)
    {
        
        try
        {
          Connection con=ConnectionProvider.getCon();
          PreparedStatement ps=con.prepareStatement("insert into contact values(?,?,?)");
          ps.setString(1,data.getName());
          ps.setString(2, data.getEmail());
          ps.setString(3,data.getMessage());
          int a=ps.executeUpdate();
          if(a>0)
          {
            b=true;
          }
        }
        catch(Exception e)
        {
          
        }
        return b;
    }
}

package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
     public static final String url="jdbc:mysql://localhost:3306/ospjsp";  
     public static final String user="root";
     public static final String pwd="root";      
     
     static Connection con=null;
     static
     {
          try
          {
            Class.forName("com.mysql.jdbc.Driver");
          }
          catch(Exception e)
          {
               
          }
     }
     public static Connection getCon()
     {
         
       try
       {
         con=DriverManager.getConnection(url, user, pwd);
       }
       catch(Exception e)
       {
         
       }
       return con;
     }
}

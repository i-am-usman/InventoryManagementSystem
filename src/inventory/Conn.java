/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usman
 */
public class Conn {
    
  
     
     public static Connection getCon()
     {
         try{
            //String url="jdbc:mysql://localhost:3306/inventory?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String url="jdbc:mysql://localhost:3306/inventory?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            return con;
            
         }
         catch( Exception e)
         {
             System.out.println(e);
             
             return null;
         }
         
     }
     
  
}
    
    


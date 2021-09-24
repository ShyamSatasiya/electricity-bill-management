package connection;
import java.sql.*;
public class connection_class {
    Connection cn;
    Statement stm;
    
    public connection_class()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing","root","root");
            System.out.println("databse conn");
            stm=cn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
 public static void main(String args[])
    { 
       new connection_class();
       
    }

}

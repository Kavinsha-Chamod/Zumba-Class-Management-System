package Model;
import java.sql.*;
import javax.swing.JOptionPane;
public class MyDatabase {
  private static Connection con;
  public static Connection getConnection()
  {
      try
        {
           String path="jdbc:mysql://localhost:3308/zumba_class";
           con=DriverManager.getConnection(path,"root","");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());           
        }
        return con;
  }
}

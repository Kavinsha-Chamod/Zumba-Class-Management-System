package Model;

import View.VDashBoard_1;
import View.VDashBoard;
import View.VSignIn;
import java.sql.*;
import javax.swing.JOptionPane;

public class MSignIn {
    public int submitUser(String username1,String password1)
    {    int i=0;
         String o="Admin";
         String p="Admin1234";
         if(username1.equals(o)&&password1.equals(p)){
                 new VSignIn().setVisible(false);
                new VDashBoard_1().setVisible(true);
        }       
        else if(!username1.equals(o) && !password1.equals(p)){
        try{
            ResultSet rs=null;
            String A="select Username,Password from employee_details where Username='"+username1+"' and Password='"+password1+"'";
            Statement st=MyDatabase.getConnection().createStatement();
            rs=st.executeQuery(A);
        
            if(rs.next()==false){
              JOptionPane.showMessageDialog(null,"Please check the Username and Password");
              i++;
            }
            else{
            do{
                String a=rs.getString("Username");
                String b=rs.getString("Password");
                if(a.length()>0 && b.length()>0)
                {
                new VSignIn().setVisible(false);
                new VDashBoard().setVisible(true);
                }
            }
            while(rs.next());            
            }
        }
        catch(SQLException e)
        {
         JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
        } 
    return i;    
    }
}
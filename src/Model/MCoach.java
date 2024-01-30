
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MCoach {
    public void setCoach(String name1,String nic1,String gender1,String number1,String address1,String email1)
    {
    try
       { Statement st= MyDatabase.getConnection().createStatement();
          st.executeUpdate("Insert into coach_details (Name,NIC,Gender,Contact_No,Address,Email) values ('"+name1+"','"+nic1+"','"+gender1+"','"+number1+"','"+address1+"','"+email1+"')");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Coach Saved!");
              
            }
        else
        { JOptionPane.showMessageDialog(null,"Please try again!");
        }
       }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }
}

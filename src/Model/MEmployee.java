package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MEmployee {  
   public void setEmployee(String name,String username,String password,String nic,String gender,String num,String address,String email,String Snumber)
    { 
        try
       { Statement st= MyDatabase.getConnection().createStatement();
        st.executeUpdate("Insert into employee_details (Name,Username,Password,NIC,Gender,Contact_No,Address,Email) values ('"+name+"','"+username+"','"+password+"','"+nic+"','"+gender+"','"+num+"','"+address+"','"+email+"')");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Employee Saved!");
            }
        else
        { JOptionPane.showMessageDialog(null,"Please try again!");
        }
       }
    catch(Exception e)
     { JOptionPane.showMessageDialog(null,e.getMessage());
     }
    }
   public void deleteEmp(int emp_id1)
   {  try
       { int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete?", "Message",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
         System.out.println(dialogResult);
         if(dialogResult == JOptionPane.YES_OPTION){
           Statement st= MyDatabase.getConnection().createStatement();
        st.executeUpdate("delete from employee_details where Employee_Id='"+emp_id1+"'");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Employee Deleted Successfully!");
            }}
         else if(dialogResult == JOptionPane.NO_OPTION)
        { 
        }
       }
    catch(Exception e)
     { JOptionPane.showMessageDialog(null,e.getMessage());
     }
   }
} 


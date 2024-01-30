
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MMember {
    public void setMember(String name1,String nic1,String number11,String address1,String email1,String enumber11,String memcategory1,String receipt1,String payplan1,String gender1,String height11,String weight11,String remarks1,String reg11,String date1){
      int number1=Integer.parseInt(number11);
      int enumber1=Integer.parseInt(enumber11);
      int height1=Integer.parseInt(height11);
      int weight1=Integer.parseInt(weight11);
      int reg=Integer.parseInt(reg11);
    { try
       { Statement st= MyDatabase.getConnection().createStatement();
          st.executeUpdate("Insert into member_details (Name,NIC,Contact_No,Address,Email,EContact_No,Membership_Category,Receipt_No,Payment_Plan,Gender,Height,Weight,Remarks,E_id,Registered_Date) values ('"+name1+"','"+nic1+"','"+number1+"','"+address1+"','"+email1+"','"+enumber1+"','"+memcategory1+"','"+receipt1+"','"+payplan1+"','"+gender1+"','"+height1+"','"+weight1+"','"+remarks1+"','"+reg+"','"+date1+"')");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Member Saved!");
              
            }
        else
        { JOptionPane.showMessageDialog(null,"Please try again!");
        }
       }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }
}}

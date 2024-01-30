
package Model;


import static View.VHome.Instance;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MHome { 
   public void search(int m_id)
  { 
       try
    { ResultSet rs = null;
          String sql ="select * from member_details where Member_Id='"+m_id+"'";
          Statement st=MyDatabase.getConnection().createStatement();
          rs=st.executeQuery(sql);
          
     if(rs.next()==true)
          {  
             Instance.name.setText(rs.getString("Name"));
             Instance.nic.setText(rs.getString("NIC"));
             Instance.e_num.setText(rs.getString("EContact_No"));
             Instance.num.setText(rs.getString("Contact_No"));
             Instance.address.setText(rs.getString("Address"));
             Instance.email.setText(rs.getString("Email"));
             Instance.gender.setText(rs.getString("Gender"));
             Instance.height.setText(rs.getString("Height"));
             Instance.weight.setText(rs.getString("Weight"));
             Instance.remarks1.setText(rs.getString("Remarks"));
             Instance.category.setText(rs.getString("Membership_Category"));
             Instance.mid.setText(rs.getString("Member_Id"));
             Instance.rec.setText(rs.getString("Receipt_No"));
             Instance.payment.setText(rs.getString("Payment_Plan"));
             Instance.reg.setText(rs.getString("E_id"));
             Instance.regDate.setText(rs.getString("Registered_Date"));
          }
          else 
            { 
            JOptionPane.showMessageDialog(null,"Please check the Member Id and try again !");
            } 
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e.getMessage());
    }
  }
   public void searchCoach(int c_id) 
      {   try
    { ResultSet rs1 = null;
          String s ="select * from coach_details where Coach_Id='"+c_id+"'";
          Statement st=MyDatabase.getConnection().createStatement();
          rs1=st.executeQuery(s);
          
     if(rs1.next()==true)
          {  
             Instance.cname.setText(rs1.getString("Name"));
             Instance.cnic.setText(rs1.getString("NIC"));
             Instance.cnum.setText(rs1.getString("Contact_No"));
             Instance.caddress.setText(rs1.getString("Address"));
             Instance.cemail.setText(rs1.getString("Email"));
             Instance.cgender.setText(rs1.getString("Gender"));
          }
          else 
            { 
            JOptionPane.showMessageDialog(null,"Please check the Coach Id and try again !");
            } 
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e.getMessage());
    } 
    }
   public void deleteMember(int m_id)
   {try
       { int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete?", "Message",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
         System.out.println(dialogResult);
         if(dialogResult == JOptionPane.YES_OPTION){
           Statement st= MyDatabase.getConnection().createStatement();
        st.executeUpdate("delete from member_details where Member_Id='"+m_id+"'");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Member Deleted successfully!");
             Instance.id.setText("");
             Instance.name.setText("");
             Instance.nic.setText("");
             Instance.e_num.setText("");
             Instance.num.setText("");
             Instance.address.setText("");
             Instance.email.setText("");
             Instance.gender.setText("");
             Instance.height.setText("");
             Instance.weight.setText("");
             Instance.remarks1.setText("");
             Instance.category.setText("");
             Instance.mid.setText("");
             Instance.rec.setText("");
             Instance.payment.setText("");
             Instance.reg.setText("");
             Instance.regDate.setText("");
            }
         }
         else if(dialogResult == JOptionPane.NO_OPTION)
        { 
        }
       }
    catch(Exception e)
     { JOptionPane.showMessageDialog(null,e.getMessage());
     }
   }
   public void deleteCoach(int c_id)
   { try
       { int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete?", "Message",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
         System.out.println(dialogResult);
         if(dialogResult == JOptionPane.YES_OPTION){
        Statement st= MyDatabase.getConnection().createStatement();
        st.executeUpdate("delete from coach_details where Coach_Id='"+c_id+"'");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Coach Deleted successfully!");
             Instance.cname.setText("");
             Instance.cnic.setText("");
             Instance.cnum.setText("");
             Instance.caddress.setText("");
             Instance.cemail.setText("");
             Instance.cgender.setText("");
            }}
        else if(dialogResult == JOptionPane.NO_OPTION)
        { 
        }
       }
    catch(Exception e)
     { JOptionPane.showMessageDialog(null,e.getMessage());
     }
   }
   public void updateMember(int id, String name1,String nic1,int number1,String address1,String email1,int enumber1,String memcategory1,String receipt1,String payplan1,String gender1,int height1,int weight1,String remarks1)
   {try
       { int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Update?", "Message",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
         System.out.println(dialogResult);
          if(dialogResult == JOptionPane.YES_OPTION) 
          { Statement st= MyDatabase.getConnection().createStatement();
        st.executeUpdate("Update member_details set Name='"+name1+"',NIC='"+nic1+"',Contact_No='"+number1+"',Address='"+address1+"',Email='"+email1+"',EContact_No='"+enumber1+"',Membership_Category='"+memcategory1+"',Receipt_No='"+receipt1+"',Payment_Plan='"+payplan1+"',Gender='"+gender1+"',Height='"+height1+"',Weight='"+weight1+"',Remarks='"+remarks1+"' where Member_Id='"+id+"'");
        if(st.equals(st)){
            JOptionPane.showMessageDialog(null,"Member Updated successfully!");
             Instance.id.setText("");
             Instance.name.setText("");
             Instance.nic.setText("");
             Instance.e_num.setText("");
             Instance.num.setText("");
             Instance.address.setText("");
             Instance.email.setText("");
             Instance.gender.setText("");
             Instance.height.setText("");
             Instance.weight.setText("");
             Instance.remarks1.setText("");
             Instance.category.setText("");
             Instance.mid.setText("");
             Instance.rec.setText("");
             Instance.payment.setText("");
             Instance.reg.setText("");
             Instance.regDate.setText("");
            }}
          else if(dialogResult == JOptionPane.NO_OPTION)
        { 
        }
       }
    catch(Exception e)
     { JOptionPane.showMessageDialog(null,e.getMessage());
     }
  
   }
   public void updateCoach(int cid,String name1,String nic1,String gender1,int number1,String address1,String email1)
   {try
       { int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Update?", "Message",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
         System.out.println(dialogResult);
          if(dialogResult == JOptionPane.YES_OPTION) {
           Statement st= MyDatabase.getConnection().createStatement();
        st.executeUpdate("Update coach_details set Name='"+name1+"',NIC='"+nic1+"',Contact_No='"+number1+"',Address='"+address1+"',Email='"+email1+"',Gender='"+gender1+"' where Coach_Id='"+cid+"'");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Coach Updated successfully!");
             Instance.cname.setText("");
             Instance.cnic.setText("");
             Instance.cnum.setText("");
             Instance.caddress.setText("");
             Instance.cemail.setText("");
             Instance.cgender.setText("");
            }}
        else if(dialogResult == JOptionPane.NO_OPTION)
        { 
        }
       }
    catch(Exception e)
     { JOptionPane.showMessageDialog(null,e.getMessage());
     }}
   public void searchMem1(int m_id) 
      {   try
    { ResultSet rs1 = null;
          String s ="select * from member_details where Member_Id='"+m_id+"'";
          Statement st=MyDatabase.getConnection().createStatement();
          rs1=st.executeQuery(s);
          
     if(rs1.next()==true)
          {  
             Instance.mname.setText(rs1.getString("Name"));
          }
          else 
            { 
            JOptionPane.showMessageDialog(null,"Please check the Member Id and try again !");
            } 
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e.getMessage());
    } 
    }
   
    public void setPayment(int mid, int count,int amount,String date,int addBy)
    { try
       { Statement st= MyDatabase.getConnection().createStatement();
          st.executeUpdate("Insert into payment_details (M_id,Payment,Count,Date,Added_By) values ('"+mid+"','"+amount+"','"+count+"','"+date+"','"+addBy+"')");
        if(st.equals(st)){
              JOptionPane.showMessageDialog(null,"Payment Saved!"); 
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

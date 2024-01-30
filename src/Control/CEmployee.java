
package Control;

import Model.MEmployee;


public class CEmployee {
    public void getEmployee(String name1,String username1,String password1,String nic1,String gender1,String num1,String address1,String email1,String Snumber)
    { MEmployee em = new MEmployee();
      em.setEmployee(name1, username1, password1, nic1, gender1, num1, address1, email1,Snumber);
    }
    public void removeEmployee(int emp_id1)
    { MEmployee em1 = new MEmployee();
      em1.deleteEmp(emp_id1);
    }
}

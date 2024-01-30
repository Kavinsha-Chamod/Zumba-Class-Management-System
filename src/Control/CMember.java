
package Control;

import Model.MMember;

public class CMember {
    public void getMember(String name1,String nic1,String number1,String address1,String email1,String enumber1,String memcategory1,String receipt1,String payplan1,String gender1,String height1,String weight1,String remarks1,String reg1,String date1)
    { MMember mm = new MMember();
      mm.setMember(name1, nic1, number1, address1, email1, enumber1, memcategory1, receipt1, payplan1, gender1, height1, weight1, remarks1,reg1,date1);
    }
}

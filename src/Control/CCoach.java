
package Control;

import Model.MCoach;

public class CCoach {
    public void getCoach(String name,String nic,String gender,String number,String address,String email)
    { MCoach mc = new MCoach();
      mc.setCoach(name, nic, gender, number, address, email);
    }
}

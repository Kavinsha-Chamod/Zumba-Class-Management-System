
package Control;

import Model.MHome;

public class CHome {
    public void serachMem(int em_id)
    { MHome mh = new MHome();
      mh.search(em_id);
    }
    public void searchCoach(int m_id)
    { MHome h = new MHome();
      h.searchCoach(m_id);
    }
    public void deleteMember(int id)
    { MHome hn = new MHome();
      hn.deleteMember(id);
    }
    public void deleteCoach(int co_id)
    { MHome hn1 = new MHome();
      hn1.deleteCoach(co_id);
    }
    public void updateMember(int id, String name1,String nic1,int number1,String address1,String email1,int enumber1,String memcategory1,String receipt1,String payplan1,String gender1,int height1,int weight1,String remarks1)
    { MHome hn2 = new MHome();
      hn2.updateMember(id, name1, nic1, number1, address1, email1, enumber1, memcategory1, receipt1, payplan1, gender1, height1, weight1, remarks1);
    }
    public void updateCoach(int cid,String name1,String nic1,String gender1,int number1,String address1,String email1)
    {MHome hn3 = new MHome();
     hn3.updateCoach(cid, name1, nic1, gender1, number1, address1, email1);
    }
    public void searchMem1(int m_id)
    {MHome hn4 = new MHome();
    hn4.searchMem1(m_id);
    }
    public void addPayment(int mid, int count,int amount,String date,int addBy)
    {MHome hn5 = new MHome();
    hn5.setPayment(mid, count, amount, date, addBy);
    }
}

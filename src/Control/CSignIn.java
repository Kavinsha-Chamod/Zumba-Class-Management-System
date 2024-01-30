package Control;

import Model.MSignIn;

public class CSignIn {
    public int getUser(String user,String pwd)
    {
        MSignIn ms = new MSignIn();
        int i=ms.submitUser(user,pwd);
        
        return i;
    }
}

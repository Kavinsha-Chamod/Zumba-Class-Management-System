
package Model;

//import java.sql.*;
import View.LoadingForm;
import View.VSignIn;
import javax.swing.JOptionPane;

public class MLoading {
    
  public void main() 
    {   
        LoadingForm lf = new LoadingForm();
        lf.setVisible(true);
        VSignIn v =new VSignIn();
        v.setVisible(false);
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(100);
                lf.lbl2.setText((i)+"%");
                lf.LoadingBar.setValue(i);
                
                if(i==10)
                {
                    lf.lbl.setText("Turning on Modules...");
                }
                if(i==20)
                {
                    lf.lbl.setText("Loading Modules...");
                }
                if(i==50)
                {
                    lf.lbl.setText("Connecting to Database...");
                }
                if(i==70)
                {
                    lf.lbl.setText("Connection Sucessful !");
                }
                if(i==80)
                {
                    lf.lbl.setText("Launching Application...");
                }
                if(i==100)
                {
                    lf.setVisible(false);
                    v.setVisible(true);  
                }
            }   
            
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null, e);
        }
                
    }

    
    
}

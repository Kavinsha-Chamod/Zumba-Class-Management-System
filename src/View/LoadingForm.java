
package View;

import Control.CLoadingForm;
import static View.LoadingForm.main;
import javax.swing.JOptionPane;

public class LoadingForm extends javax.swing.JFrame {

    public LoadingForm() {
        initComponents();
    }
    
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanal = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BackGroundPanal.setBackground(new java.awt.Color(204, 204, 204));
        BackGroundPanal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackGroundPanal.setPreferredSize(new java.awt.Dimension(950, 450));
        BackGroundPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("0%");
        BackGroundPanal.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, -1, 30));

        lbl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("Loading...");
        BackGroundPanal.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 320, 30));

        LoadingBar.setBackground(new java.awt.Color(255, 255, 255));
        LoadingBar.setForeground(new java.awt.Color(102, 102, 102));
        BackGroundPanal.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/zumbalogo1.png"))); // NOI18N
        BackGroundPanal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 330, 1040));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/bg.jpeg"))); // NOI18N
        BackGroundPanal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {   
        CLoadingForm cl = new CLoadingForm();
        cl.CLoading();            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanal;
    public javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lbl;
    public javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}

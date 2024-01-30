
package View;

import Control.CSignIn;




public class VSignIn extends javax.swing.JFrame {
    

    public VSignIn() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lbl_welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_login = new rojerusan.RSMaterialButtonCircle();
        jLabel7 = new javax.swing.JLabel();
        txt_pwd1 = new javax.swing.JPasswordField();
        txt_uname = new javax.swing.JTextField();

        jPanel1.setMaximumSize(new java.awt.Dimension(650, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 1200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 560));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(153, 153, 153));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/zumbalogo.png"))); // NOI18N
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 250, 1010));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/bg.jpeg"))); // NOI18N
        Panel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 670));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 670));

        panel2.setBackground(new java.awt.Color(153, 153, 153));
        panel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_welcome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_welcome.setText("WELCOME !");
        panel2.add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 160, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Login to your Account");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 240, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Username :");
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Password :");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/icons8_Secure_50px.png"))); // NOI18N
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/icons8_Account_50px.png"))); // NOI18N
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 50, 50));

        btn_login.setBackground(new java.awt.Color(51, 51, 51));
        btn_login.setText("logIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        panel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 230, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 30, 30));

        txt_pwd1.setBackground(new java.awt.Color(153, 153, 153));
        txt_pwd1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwd1ActionPerformed(evt);
            }
        });
        panel2.add(txt_pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 340, 30));

        txt_uname.setBackground(new java.awt.Color(153, 153, 153));
        txt_uname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unameActionPerformed(evt);
            }
        });
        panel2.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 340, 30));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 610, 670));

        setSize(new java.awt.Dimension(1101, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
                                             
    String username, password;
    username = txt_uname.getText(); // Assuming panel2 is a JTextField component
    password = txt_pwd1.getText(); // Assuming passwordField is a JPasswordField component

    CSignIn cs = new CSignIn();
    int i = cs.getUser(username, password);

    if (i == 0) {
        this.setVisible(false);
    } else {
        // Handle unsuccessful login case here
    }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txt_pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwd1ActionPerformed

    private void panel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panel2AncestorAdded

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    public static void main(String args[]) {
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSignIn().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel1;
    private rojerusan.RSMaterialButtonCircle btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JPanel panel2;
    private javax.swing.JPasswordField txt_pwd1;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}

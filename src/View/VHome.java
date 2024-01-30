
package View;


import Control.CHome;
import Model.MyDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class VHome extends javax.swing.JFrame {
 public static VHome Instance;
 public JTextField id;
 public JTextField name;
 public JTextField nic;
 public JTextField e_num;
 public JTextField num;
 public JTextField address;
 public JTextField email;
 public JTextField gender;
 public JTextField height;
 public JTextField weight;
 public JTextArea remarks1;
 public JTextField category;
 public JTextField mid;
 public JTextField rec;
 public JTextField payment;
 public JTextField reg;
 public JTextField regDate;
 
 //Coach fields 
 public JTextField cname;
 public JTextField cnic;
 public JTextField cnum;
 public JTextField caddress;
 public JTextField cemail;
 public JTextField cgender;
 //Search payment
 public JTextField pid;
 public JTextField mname;
 
 
    public VHome() {
        initComponents();
        Instance=this;
        id=txt_id; name=txt_name; nic=txt_nic; e_num=txt_emergency; num=txt_num; address=txt_address; email=txt_email; gender=txt_gender;
        height=txt_height; weight=txt_weight; remarks1=remarks; category=txt_memcategory; mid=txt_mid; rec=txt_rec; payment=txt_payment;
        cname=txt_cname; cnic=txt_cnic; cnum=txt_cnum; caddress=txt_caddress; cemail=txt_cemail; cgender=txt_cgender;reg=txt_reg; regDate=txt_regDate;
        pid=txt_pid; mname=txt_mname; Display(); displayPayment();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new rojerusan.RSMaterialButtonRectangle();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_report = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane4 = new javax.swing.JScrollPane();
        memTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_search = new rojerusan.RSMaterialButtonRectangle();
        btn_clear = new rojerusan.RSMaterialButtonRectangle();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_emergency = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_nic = new javax.swing.JTextField();
        txt_num = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        txt_height = new javax.swing.JTextField();
        txt_weight = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarks = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_memcategory = new javax.swing.JTextField();
        txt_mid = new javax.swing.JTextField();
        txt_reg = new javax.swing.JTextField();
        txt_rec = new javax.swing.JTextField();
        txt_payment = new javax.swing.JTextField();
        txt_regDate = new javax.swing.JTextField();
        btn_delete = new rojerusan.RSMaterialButtonRectangle();
        btn_update = new rojerusan.RSMaterialButtonRectangle();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_cname = new javax.swing.JTextField();
        txt_cnic = new javax.swing.JTextField();
        txt_cnum = new javax.swing.JTextField();
        txt_caddress = new javax.swing.JTextField();
        txt_cemail = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_cgender = new javax.swing.JTextField();
        btn_update1 = new rojerusan.RSMaterialButtonRectangle();
        btn_delete1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel9 = new javax.swing.JLabel();
        txt_cid = new javax.swing.JTextField();
        btn_searchCoach = new rojerusan.RSMaterialButtonRectangle();
        jLabel38 = new javax.swing.JLabel();
        btn_clearCoach = new rojerusan.RSMaterialButtonRectangle();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txt_pid = new javax.swing.JTextField();
        btn_payment = new rojerusan.RSMaterialButtonRectangle();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txt_addBy = new javax.swing.JTextField();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        jLabel40 = new javax.swing.JLabel();
        txt_count = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        datePick = new org.jdesktop.swingx.JXDatePicker();
        jLabel42 = new javax.swing.JLabel();
        txt_reci = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_mname = new javax.swing.JTextField();
        btn_clearPay = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane3 = new javax.swing.JScrollPane();
        payTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/zumba.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 81, 69));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel2.setText("ZUMBA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 130, 40));

        btn_back.setBackground(new java.awt.Color(102, 102, 102));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(102, 102, 102));
        rSMaterialButtonRectangle2.setText("Add a New Member");
        rSMaterialButtonRectangle2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1090, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("At a Glance...");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 30));

        jLabel4.setText("Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel5.setText("Time");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        btn_report.setBackground(new java.awt.Color(102, 102, 102));
        btn_report.setText("Generate Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        jPanel2.add(btn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 210, 50));

        memTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Name", "Address", "Contact No", "Reg Date", "Reg By"
            }
        ));
        memTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                memTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(memTable);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1040, 360));

        jTabbedPane1.addTab("Overview", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Please enter a valid ID for get related Member Information ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Membership ID :");

        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        btn_search.setBackground(new java.awt.Color(102, 102, 102));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(102, 102, 102));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addGap(16, 16, 16))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "In case of an Emergency", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Emergency Contact :");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        txt_emergency.setBackground(new java.awt.Color(204, 204, 204));
        txt_emergency.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_emergency.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(txt_emergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 250, 30));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Basic Member Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Name :");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("NIC :");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Contact No.");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Address :");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Email :");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_name.setBackground(new java.awt.Color(204, 204, 204));
        txt_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 250, -1));

        txt_nic.setBackground(new java.awt.Color(204, 204, 204));
        txt_nic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nic.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, -1));

        txt_num.setBackground(new java.awt.Color(204, 204, 204));
        txt_num.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_num.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 250, -1));

        txt_address.setBackground(new java.awt.Color(204, 204, 204));
        txt_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, -1));

        txt_email.setBackground(new java.awt.Color(204, 204, 204));
        txt_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/userLogo.png"))); // NOI18N
        jLabel27.setMaximumSize(new java.awt.Dimension(48, 48));
        jLabel27.setMinimumSize(new java.awt.Dimension(48, 48));
        jLabel27.setPreferredSize(new java.awt.Dimension(48, 48));
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 100));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Body Statics", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Gender :");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 32, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Height :");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 63, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Weight :");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 94, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Remarks :");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txt_gender.setEditable(false);
        txt_gender.setBackground(new java.awt.Color(204, 204, 204));
        txt_gender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_gender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_gender.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel8.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 32, 200, -1));

        txt_height.setBackground(new java.awt.Color(204, 204, 204));
        txt_height.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_height.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel8.add(txt_height, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 63, 200, -1));

        txt_weight.setBackground(new java.awt.Color(204, 204, 204));
        txt_weight.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_weight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel8.add(txt_weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 94, 200, -1));

        remarks.setColumns(20);
        remarks.setRows(5);
        jScrollPane2.setViewportView(remarks);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 136, 200, 170));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Membership Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel20.setText("Membership Category :");

        jLabel21.setText("Membership ID :");

        jLabel22.setText("Registered on :");

        jLabel23.setText("Registered By :");

        jLabel24.setText("Receipt No :");

        jLabel25.setText("Payment Plan :");

        txt_memcategory.setEditable(false);
        txt_memcategory.setBackground(new java.awt.Color(204, 204, 204));
        txt_memcategory.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_memcategory.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txt_mid.setBackground(new java.awt.Color(204, 204, 204));
        txt_mid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_mid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_midActionPerformed(evt);
            }
        });

        txt_reg.setEditable(false);
        txt_reg.setBackground(new java.awt.Color(204, 204, 204));
        txt_reg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_reg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txt_rec.setBackground(new java.awt.Color(204, 204, 204));
        txt_rec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_rec.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txt_payment.setEditable(false);
        txt_payment.setBackground(new java.awt.Color(204, 204, 204));
        txt_payment.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_payment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txt_regDate.setBackground(new java.awt.Color(204, 204, 204));
        txt_regDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_regDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_regDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_mid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txt_memcategory, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_reg)))
                            .addComponent(txt_regDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_memcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_regDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txt_rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(txt_payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        btn_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_delete.setText("DELETE MEMBER");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(102, 102, 102));
        btn_update.setText("UPDATE MEMBER");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Member Information", jPanel3);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Coach Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Name :");
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setText("NIC :");
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setText("Contact No.");
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setText("Address :");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setText("Email :");
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_cname.setBackground(new java.awt.Color(204, 204, 204));
        txt_cname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.add(txt_cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 250, -1));

        txt_cnic.setBackground(new java.awt.Color(204, 204, 204));
        txt_cnic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cnic.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.add(txt_cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, -1));

        txt_cnum.setBackground(new java.awt.Color(204, 204, 204));
        txt_cnum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cnum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.add(txt_cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 250, -1));

        txt_caddress.setBackground(new java.awt.Color(204, 204, 204));
        txt_caddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_caddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.add(txt_caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, -1));

        txt_cemail.setBackground(new java.awt.Color(204, 204, 204));
        txt_cemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.add(txt_cemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Pictures/userLogo.png"))); // NOI18N
        jLabel37.setMaximumSize(new java.awt.Dimension(48, 48));
        jLabel37.setMinimumSize(new java.awt.Dimension(48, 48));
        jLabel37.setPreferredSize(new java.awt.Dimension(48, 48));
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, 100));

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("Gender :");
        jPanel12.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txt_cgender.setBackground(new java.awt.Color(204, 204, 204));
        txt_cgender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cgender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.add(txt_cgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 250, -1));

        btn_update1.setBackground(new java.awt.Color(102, 102, 102));
        btn_update1.setText("UPDATE MEMBER");
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });

        btn_delete1.setBackground(new java.awt.Color(102, 102, 102));
        btn_delete1.setText("DELETE MEMBER");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Coach ID :");

        txt_cid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cidActionPerformed(evt);
            }
        });

        btn_searchCoach.setBackground(new java.awt.Color(102, 102, 102));
        btn_searchCoach.setText("Search");
        btn_searchCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchCoachActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel38.setText("Please enter a valid ID for get related Coach Information ");

        btn_clearCoach.setBackground(new java.awt.Color(102, 102, 102));
        btn_clearCoach.setText("CLEAR");
        btn_clearCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearCoachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btn_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel38))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_searchCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_clearCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel38)
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btn_clearCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Coach Information", jPanel11);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setText("Payment Details");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Add Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("Membership ID :");

        txt_pid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btn_payment.setBackground(new java.awt.Color(102, 102, 102));
        btn_payment.setText("SUBMIT");
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setText("Payment : RS");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setText("Receipt No :");

        txt_amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txt_addBy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_addBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addByActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(102, 102, 102));
        rSMaterialButtonRectangle3.setText("Check Name related to ID");
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setText("Count :");

        txt_count.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setText("Date :");

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setText("Added By :");

        txt_reci.setEditable(false);
        txt_reci.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_reci.setText("Auto Increment");
        txt_reci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reciActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel43.setText("Member Name :");

        txt_mname.setEditable(false);
        txt_mname.setBackground(new java.awt.Color(204, 204, 204));
        txt_mname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_mname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btn_clearPay.setBackground(new java.awt.Color(102, 102, 102));
        btn_clearPay.setText("CLEAR");
        btn_clearPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_reci, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel40))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_addBy, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(datePick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txt_count, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(22, 22, 22)
                                .addComponent(txt_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_clearPay, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_reci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txt_addBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clearPay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 330, 460));

        payTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No", "Payment", "Date", "Added By"
            }
        ));
        jScrollPane3.setViewportView(payTable);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 710, 450));

        jTabbedPane1.addTab("Payment Details", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1110, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        VDashBoard vh = new VDashBoard();
        vh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_midActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        VAddMember vd = new VAddMember();
        vd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void txt_cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cidActionPerformed

    private void btn_searchCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchCoachActionPerformed
        int id=Integer.parseInt(txt_cid.getText());
        CHome ch1 = new CHome();
        ch1.searchCoach(id);
    }//GEN-LAST:event_btn_searchCoachActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       int id=Integer.parseInt(txt_id.getText());
       CHome ch2 = new CHome();
       ch2.deleteMember(id);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        int id1=Integer.parseInt(txt_cid.getText());
        CHome ch3 = new CHome();
        ch3.deleteCoach(id1);
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        int id1,number,enumber,height,weight;
        String name,nic,address,email,memcategory,receipt,payplan,gender,remarks1;
        id1=Integer.parseInt(txt_id.getText());
        name=txt_name.getText();
        nic=txt_nic.getText();
        number=Integer.parseInt(txt_num.getText());
        address=txt_address.getText();
        email=txt_email.getText();
        enumber=Integer.parseInt(txt_emergency.getText());
        memcategory=txt_memcategory.getText();
        receipt=txt_rec.getText();
        payplan=txt_payment.getText();
        gender=txt_gender.getText();
        height=Integer.parseInt(txt_height.getText());
        weight=Integer.parseInt(txt_weight.getText());
        remarks1=remarks.getText();
        CHome ch4 = new CHome();
        ch4.updateMember(id1, name, nic, number, address, email, enumber, memcategory, receipt, payplan, gender, height, weight, remarks1);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        int cid,number; 
        String name,nic,gender,address,email;
        cid=Integer.parseInt(txt_cid.getText());
        name=txt_cname.getText();
        nic=txt_cnic.getText();
        gender=txt_cgender.getText();
        number=Integer.parseInt(txt_cnum.getText());
        address=txt_caddress.getText();
        email=txt_cemail.getText();
        CHome ch5 = new CHome();
        ch5.updateCoach(cid, name, nic, gender, number, address, email);
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        int id=Integer.parseInt(txt_id.getText());
        CHome ch = new CHome();
        ch.serachMem(id);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_id.setText("");
        txt_name.setText("");
        txt_nic.setText("");
        txt_num.setText("");
        txt_address.setText("");
        txt_email.setText("");
        txt_emergency.setText("");
        txt_memcategory.setText("");
        txt_mid.setText("");
        txt_rec.setText("");
        txt_payment.setText("");
        txt_gender.setText("");
        txt_height.setText("");
        txt_weight.setText("");
        remarks.setText("");
        txt_reg.setText("");;
        txt_regDate.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_clearCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearCoachActionPerformed
        txt_cid.setText("");
        txt_cname.setText("");
        txt_cnic.setText("");
        txt_cnum.setText("");
        txt_caddress.setText("");
        txt_cemail.setText("");
        txt_cgender.setText("");
    }//GEN-LAST:event_btn_clearCoachActionPerformed

    private void txt_regDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regDateActionPerformed

    private void memTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_memTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_memTableAncestorAdded

    private void txt_addByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addByActionPerformed

    private void txt_reciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reciActionPerformed

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        int id, count,amount,addBy;String date;
        id= Integer.parseInt(txt_pid.getText());
        count=Integer.parseInt(txt_count.getText());
        amount=Integer.parseInt(txt_amount.getText());
        Date date1=datePick.getDate();
        DateFormat f = new SimpleDateFormat("yyy-MM--dd");
        date=f.format(date1); 
        addBy=Integer.parseInt(txt_addBy.getText());
        CHome q = new CHome();
        q.addPayment(id, count, amount, date, addBy);
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        int pid; String name;
        pid=Integer.parseInt(txt_pid.getText());
        name=txt_mname.getText();
        CHome ch1 = new CHome();
        ch1.searchMem1(pid);
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void btn_clearPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearPayActionPerformed
        txt_pid.setText("");
        txt_mname.setText("");
        txt_amount.setText("");
        txt_count.setText("");
        txt_addBy.setText("");
    }//GEN-LAST:event_btn_clearPayActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        try {
            
            Connection con = MyDatabase.getConnection();
            JasperDesign Jdesign =JRXmlLoader.load("D:/Diploma in DSE/EAD/NetBeans/Zumba Class Management System/src/View/MemReport.jrxml");
            String query="select * from member_details";
            
            JRDesignQuery updateQuery=new JRDesignQuery();
            updateQuery.setText(query);
            
            Jdesign.setQuery(updateQuery);
            JasperReport jreport=JasperCompileManager.compileReport(Jdesign);
            JasperPrint jprint=JasperFillManager.fillReport(jreport,null,con);
            JasperViewer.viewReport(jprint);
        } catch (JRException ex) {
            Logger.getLogger(VHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_reportActionPerformed
    public void Display()
    { try
    {     ResultSet rs = null;
          String sql ="select * from member_details";
          Statement st=MyDatabase.getConnection().createStatement();
          rs=st.executeQuery(sql);
          DefaultTableModel DefaultTableModel=null;
          memTable.getModel();
          DefaultTableModel model=(DefaultTableModel)memTable.getModel();
          Object rowDatar[] = new Object[6];
          while(rs.next())
          { rowDatar[0]=rs.getString("Member_Id");
            rowDatar[1]=rs.getString("Name");
            rowDatar[2]=rs.getString("Address");
            rowDatar[3]=rs.getString("Contact_No");
            rowDatar[4]=rs.getString("Registered_Date");              
            rowDatar[5]=rs.getString("E_id");  
         model.addRow(rowDatar);
          }
    }
    catch(Exception e)
    {  JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }
   public void displayPayment()
    { try
    {     ResultSet rs = null;
          String sql ="select * from payment_details";
          Statement st=MyDatabase.getConnection().createStatement();
          rs=st.executeQuery(sql);
          DefaultTableModel DefaultTableModel=null;
          payTable.getModel();
          DefaultTableModel model=(DefaultTableModel)payTable.getModel();
          Object rowDatar[] = new Object[4];
          while(rs.next())
          { rowDatar[0]=rs.getString("Receipt_No");
            rowDatar[1]=rs.getString("Payment");
            rowDatar[2]=rs.getString("Date");
            rowDatar[3]=rs.getString("Added_By"); 
            model.addRow(rowDatar);
          }
    }
    catch(Exception e)
    {  JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_back;
    private rojerusan.RSMaterialButtonRectangle btn_clear;
    private rojerusan.RSMaterialButtonRectangle btn_clearCoach;
    private rojerusan.RSMaterialButtonRectangle btn_clearPay;
    private rojerusan.RSMaterialButtonRectangle btn_delete;
    private rojerusan.RSMaterialButtonRectangle btn_delete1;
    private rojerusan.RSMaterialButtonRectangle btn_payment;
    private rojerusan.RSMaterialButtonRectangle btn_report;
    private rojerusan.RSMaterialButtonRectangle btn_search;
    private rojerusan.RSMaterialButtonRectangle btn_searchCoach;
    private rojerusan.RSMaterialButtonRectangle btn_update;
    private rojerusan.RSMaterialButtonRectangle btn_update1;
    private org.jdesktop.swingx.JXDatePicker datePick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable memTable;
    private javax.swing.JTable payTable;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private javax.swing.JTextArea remarks;
    private javax.swing.JTextField txt_addBy;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_caddress;
    private javax.swing.JTextField txt_cemail;
    private javax.swing.JTextField txt_cgender;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_cname;
    private javax.swing.JTextField txt_cnic;
    private javax.swing.JTextField txt_cnum;
    private javax.swing.JTextField txt_count;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_emergency;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_height;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_memcategory;
    private javax.swing.JTextField txt_mid;
    private javax.swing.JTextField txt_mname;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_payment;
    private javax.swing.JTextField txt_pid;
    private javax.swing.JTextField txt_rec;
    private javax.swing.JTextField txt_reci;
    private javax.swing.JTextField txt_reg;
    private javax.swing.JTextField txt_regDate;
    private javax.swing.JTextField txt_weight;
    // End of variables declaration//GEN-END:variables
}

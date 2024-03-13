/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import System.Employee.EmployeeRecords;
import System.Employee.Request;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class LogIn extends javax.swing.JFrame {

    private EmployeeRecords[] employees;
   
    public LogIn() {
       
        initComponents();
        
        // Load employee records from CSV when the form is initialized
        employees = EmployeeRecords.readEmployeesFromCSV("/Files/EmployeeData.csv");
       
    }
   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forgotPWDialog = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        forgotUserId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        forgotPWSubmitBtn = new javax.swing.JButton();
        cancelForgotPWBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        UserId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        password = new javax.swing.JPasswordField();
        LogInbtn = new javax.swing.JButton();
        forgotPWBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        forgotPWDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        forgotPWDialog.setTitle("Forgot Password");
        forgotPWDialog.setMaximumSize(new java.awt.Dimension(372, 280));
        forgotPWDialog.setMinimumSize(new java.awt.Dimension(372, 260));
        forgotPWDialog.setUndecorated(true);
        forgotPWDialog.setPreferredSize(new java.awt.Dimension(372, 280));
        forgotPWDialog.setResizable(false);
        forgotPWDialog.setSize(new java.awt.Dimension(380, 260));

        jPanel10.setBackground(new java.awt.Color(34, 34, 50, 220));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(361, 272));

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Please enter your Employee ID to send");

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        forgotUserId.setBackground(new java.awt.Color(51, 51, 51));
        forgotUserId.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        forgotUserId.setForeground(new java.awt.Color(255, 255, 255));
        forgotUserId.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8));
        forgotUserId.setCaretColor(new java.awt.Color(255, 255, 255));
        forgotUserId.setMargin(new java.awt.Insets(2, 8, 2, 8));
        forgotUserId.setMinimumSize(new java.awt.Dimension(240, 36));
        forgotUserId.setPreferredSize(new java.awt.Dimension(240, 36));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Forgot Password");

        forgotPWSubmitBtn.setBackground(new java.awt.Color(255, 153, 0));
        forgotPWSubmitBtn.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        forgotPWSubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        forgotPWSubmitBtn.setText("SUBMIT");
        forgotPWSubmitBtn.setBorderPainted(false);
        forgotPWSubmitBtn.setMaximumSize(new java.awt.Dimension(100, 36));
        forgotPWSubmitBtn.setPreferredSize(new java.awt.Dimension(100, 36));
        forgotPWSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPWSubmitBtnActionPerformed(evt);
            }
        });

        cancelForgotPWBtn.setBackground(new java.awt.Color(102, 102, 102));
        cancelForgotPWBtn.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        cancelForgotPWBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelForgotPWBtn.setText("CANCEL");
        cancelForgotPWBtn.setBorderPainted(false);
        cancelForgotPWBtn.setMaximumSize(new java.awt.Dimension(100, 36));
        cancelForgotPWBtn.setPreferredSize(new java.awt.Dimension(100, 36));
        cancelForgotPWBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelForgotPWBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("a password reset request to the Administrator.");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(cancelForgotPWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(forgotPWSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPWSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelForgotPWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout forgotPWDialogLayout = new javax.swing.GroupLayout(forgotPWDialog.getContentPane());
        forgotPWDialog.getContentPane().setLayout(forgotPWDialogLayout);
        forgotPWDialogLayout.setHorizontalGroup(
            forgotPWDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
            .addGroup(forgotPWDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        forgotPWDialogLayout.setVerticalGroup(
            forgotPWDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
            .addGroup(forgotPWDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 0));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your Trusted Choice in");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Affordable Rides Since 2020");

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));

        jPanel2.setBackground(new java.awt.Color(34, 34, 50, 220));
        jPanel2.setPreferredSize(new java.awt.Dimension(404, 415));

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Log into MotorPH Portal");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(284, 36));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(32, 32));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(36, 36));
        jPanel3.add(jLabel1);
        jPanel3.add(filler1);

        UserId.setBackground(new java.awt.Color(0, 0, 0,0));
        UserId.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        UserId.setForeground(new java.awt.Color(255, 255, 255));
        UserId.setBorder(null);
        UserId.setCaretColor(new java.awt.Color(255, 255, 255));
        UserId.setPreferredSize(new java.awt.Dimension(240, 36));
        jPanel3.add(UserId);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padlock.png"))); // NOI18N
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(36, 36));
        jPanel4.add(jLabel7);
        jPanel4.add(filler2);

        password.setBackground(new java.awt.Color(0, 0, 0,0));
        password.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.setPreferredSize(new java.awt.Dimension(240, 36));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel4.add(password);

        LogInbtn.setBackground(new java.awt.Color(255, 102, 0));
        LogInbtn.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        LogInbtn.setForeground(new java.awt.Color(255, 255, 255));
        LogInbtn.setText("Log in");
        LogInbtn.setBorder(null);
        LogInbtn.setBorderPainted(false);
        LogInbtn.setFocusPainted(false);
        LogInbtn.setMaximumSize(new java.awt.Dimension(240, 40));
        LogInbtn.setMinimumSize(new java.awt.Dimension(240, 40));
        LogInbtn.setOpaque(true);
        LogInbtn.setPreferredSize(new java.awt.Dimension(280, 40));
        LogInbtn.setRequestFocusEnabled(false);
        LogInbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInbtnMouseExited(evt);
            }
        });
        LogInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInbtnActionPerformed(evt);
            }
        });

        forgotPWBtn.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        forgotPWBtn.setForeground(new java.awt.Color(51, 153, 255));
        forgotPWBtn.setText("Forgotten your password?");
        forgotPWBtn.setBorder(null);
        forgotPWBtn.setBorderPainted(false);
        forgotPWBtn.setContentAreaFilled(false);
        forgotPWBtn.setRequestFocusEnabled(false);
        forgotPWBtn.setRolloverEnabled(false);
        forgotPWBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPWBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgotPWBtn))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8)
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LogInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgotPWBtn)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 16, 5));

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(162, 60));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motor");
        jLabel2.setIconTextGap(0);

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PH");
        jLabel3.setIconTextGap(0);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(5, 5, 5)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel6.add(jPanel9);

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("People Portal");
        jPanel6.add(jLabel4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main-bg.jpg"))); // NOI18N
        Background.setOpaque(true);
        Background.setRequestFocusEnabled(false);
        Background.setVerifyInputWhenFocusTarget(false);
        jPanel7.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void LogInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInbtnActionPerformed
        Dashboard dashboard = new Dashboard();
        Request request = new Request();
        String userID = UserId.getText().trim();
        String pass = password.getText().trim();
        String csvFile = "/Files/LeaveRequests.csv";

        // Check if the userID exists in the employee records
        boolean accessGranted = false;

        // Validate if the input is a valid integer
        try {
            int parsedUserID = Integer.parseInt(userID);
    
            for (EmployeeRecords employee : employees) {
                if (employee.getEmpNo() == parsedUserID && employee.getPassword().equals(pass)) {
                accessGranted = true;
                dashboard.getMainDashBoardFirstName().setText(employee.getFirstName());
                dashboard.getMainDashboardempNo().setText(userID);
                dashboard.getLblPending().setText(String.valueOf(request.countRequest(csvFile,parsedUserID)));
                if (employee.getRole().equals("Admin")) {
                    dashboard.getEmployeeRecords_MainDashboard().setVisible(true);
                    dashboard.getPayrollRecords_MainDashboard().setVisible(false);
                    dashboard.getRequestList_MainDashboard().setVisible(false);
                } else if (employee.getRole().equals("Payroll")) { 
                    dashboard.getPayrollRecords_MainDashboard().setVisible(true);
                    dashboard.getEmployeeRecords_MainDashboard().setVisible(false);
                    dashboard.getRequestList_MainDashboard().setVisible(false);
                } else if (employee.getRole().equals("Supervisor")) { 
                    dashboard.getPayrollRecords_MainDashboard().setVisible(false);
                    dashboard.getEmployeeRecords_MainDashboard().setVisible(false);
                    dashboard.getRequestList_MainDashboard().setVisible(true);
                } else {
                    dashboard.getEmployeeRecords_MainDashboard().setVisible(false);
                    dashboard.getPayrollRecords_MainDashboard().setVisible(false);
                    dashboard.getRequestList_MainDashboard().setVisible(false);
                }
                break;
            }
            }
        } catch (NumberFormatException e) {
        // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(this, "Invalid UserID! Please enter a valid integer.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }

        // Grant or deny access based on the result
        if (accessGranted) {
            // Access granted, you can open the dashboard or perform any action here
        this.dispose();
        dashboard.getProfilePanel().setVisible(false);
        dashboard.getPayslipPanel().setVisible(false);
        dashboard.getAttendancePanel().setVisible(false);
        dashboard.getLeavePanel().setVisible(false);
        dashboard.setVisible(true);
        } else {
        // Access denied, display an error message
            JOptionPane.showMessageDialog(this, "Invalid UserID! Access Denied.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_LogInbtnActionPerformed

    private void LogInbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInbtnMouseEntered
        // TODO add your handling code here:
        LogInbtn.setBackground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_LogInbtnMouseEntered

    private void LogInbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInbtnMouseExited
        // TODO add your handling code here:
        LogInbtn.setBackground(new java.awt.Color(255, 102, 0));
    }//GEN-LAST:event_LogInbtnMouseExited

    private void forgotPWBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPWBtnActionPerformed
        // TODO add your handling code here:
        forgotPWDialog.setVisible(true);
        forgotPWDialog.pack();
        forgotPWDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_forgotPWBtnActionPerformed

    private void forgotPWSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPWSubmitBtnActionPerformed
        // TODO add your handling code here:
        String userID = forgotUserId.getText().trim();
        // Check if input is a valid integer
        try {
            int parsedUserID = Integer.parseInt(userID);
            boolean userExists = false;
            for (EmployeeRecords employee : employees) {
                if (employee.getEmpNo() == parsedUserID) {
                userExists = true;
                // If user exists, show message
                JOptionPane.showMessageDialog(this, "Password reset request sent for\nEmployee ID: " + parsedUserID + "\nPlease check your email for further details.", "Password Reset Request", JOptionPane.INFORMATION_MESSAGE);
                forgotUserId.setText("");
                forgotPWDialog.dispose();
                break; // No need to continue looping
                }
            }
            if (!userExists) {
            JOptionPane.showMessageDialog(this, "This Employee ID does not exist!", "ID Not Found", JOptionPane.ERROR_MESSAGE);
        }

        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Employee ID!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_forgotPWSubmitBtnActionPerformed

    private void cancelForgotPWBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelForgotPWBtnActionPerformed
        // TODO add your handling code here:
        forgotPWDialog.dispose();
    }//GEN-LAST:event_cancelForgotPWBtnActionPerformed

    public JTextField getUserId() {
        return UserId;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        FlatLightLaf.setup();
        //</editor-fold

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton LogInbtn;
    private javax.swing.JTextField UserId;
    private javax.swing.JButton cancelForgotPWBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton forgotPWBtn;
    private javax.swing.JDialog forgotPWDialog;
    private javax.swing.JButton forgotPWSubmitBtn;
    private javax.swing.JTextField forgotUserId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}


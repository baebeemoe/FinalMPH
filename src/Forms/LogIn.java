/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import System.Employee.EmployeeRecords;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import  System.Employee.Request;


public class LogIn extends javax.swing.JFrame {

    private EmployeeRecords[] employees;
   
    public LogIn() {
       
        initComponents();
        
        // Load employee records from CSV when the form is initialized
        employees = EmployeeRecords.readEmployeesFromCSV("src/Files/EmployeeData.csv");
       
    }
   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        UserId = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LogInbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("People Portal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 80)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PH");
        jLabel3.setIconTextGap(0);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, 80));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motor");
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 250, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("\"Discover MotorPH: Your Trusted Choice for");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 370, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Affordable Rides Since 2020. \"");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 250, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1310, 10));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,100));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 156, 26), 2, true));

        UserId.setBackground(new java.awt.Color(0, 0, 0,0));
        UserId.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        UserId.setForeground(new java.awt.Color(255, 255, 255));
        UserId.setBorder(null);
        UserId.setCaretColor(new java.awt.Color(255, 255, 255));

        password.setBackground(new java.awt.Color(0, 0, 0,0));
        password.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0,0));
        jSeparator2.setForeground(new java.awt.Color(255, 153, 51));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0,0));
        jSeparator3.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-1.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padlock (1).png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Log In to MotorPH Portal");

        LogInbtn.setBackground(new java.awt.Color(0, 0, 0,0));
        LogInbtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        LogInbtn.setForeground(new java.awt.Color(255, 153, 0));
        LogInbtn.setText("Log In");
        LogInbtn.setBorder(null);
        LogInbtn.setPreferredSize(new java.awt.Dimension(41, 17));
        LogInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInbtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton1.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Forgotten your password?");
        jButton1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(LogInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel8)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7))
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(LogInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 360, 340));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newBackground.jpg"))); // NOI18N
        Background.setRequestFocusEnabled(false);
        Background.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 780));

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
    String csvFile = "src/Files/LeaveRequests.csv";

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
                } else if (employee.getRole().equals("Payroll")) { 
                    dashboard.getPayrollRecords_MainDashboard().setVisible(true);
                    dashboard.getEmployeeRecords_MainDashboard().setVisible(false);
                } else {
                    dashboard.getEmployeeRecords_MainDashboard().setVisible(false);
                    dashboard.getPayrollRecords_MainDashboard().setVisible(false);
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
        dashboard.getPayPeriodPanel().setVisible(false);
        dashboard.getOvertimePanel().setVisible(false);
        dashboard.getLeaveListPanel().setVisible(false);
        
        dashboard.setVisible(true);
    } else {
        // Access denied, display an error message
        JOptionPane.showMessageDialog(this, "Invalid UserID or Password! Access Denied.", "Login Error", JOptionPane.ERROR_MESSAGE);
    }  
  
    }//GEN-LAST:event_LogInbtnActionPerformed

    public JTextField getUserId() {
        return UserId;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton LogInbtn;
    private javax.swing.JTextField UserId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}


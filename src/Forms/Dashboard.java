
package Forms;

import System.AttendanceRecord;
import System.EmployeeRecords;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private EmployeeRecords[] employees;
    private AttendanceRecord[] attendance;
    
    public Dashboard() {
        initComponents();
        
        // Load employee records from CSV when the form is initialized
        employees = EmployeeRecords.readEmployeesFromCSV("src/Files/EmployeeData.csv");
        attendance = AttendanceRecord.readAttendanceFromCSV("src/Files/timekeeping.csv");
    }

    public JPanel getAttendancePanel() {
        return AttendancePanel;
    }

    public JLabel getMainDashBoardFirstName() {
        return MainDashBoardFirstName;
    }

    public JPanel getLeavePanel() {
        return LeavePanel;
    }
    
    
       
public javax.swing.JPanel getProfilePanel() {
    return ProfilePanel;
}

    public JLabel getMainDashboardempNo() {
        return MainDashboardempNo;
    }


    public JLabel getProfileEmpNo() {
        return ProfileEmpNo;
    }

    public JLabel getProfileFirstName() {
        return profileFirstName;
    }

    public JLabel getTimeInLabel() {
        return TimeInLabel;
    }
    
  public JLabel getTimeOutLabel() {
        return TimeOutLabel;
    }
  
  public JPanel getPayslipPanel() {
        return PayslipPanel;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        AttendancePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PayslipPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        EmployeeDashboard_MainDashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LogOut = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MainDashBoardFirstName = new javax.swing.JLabel();
        MainDashboardempNo = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        MenuBar_MainDashboard = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        ProfileButton = new javax.swing.JButton();
        AttendanceMainDashboardButton = new javax.swing.JButton();
        LeaveMainDashboard = new javax.swing.JButton();
        PayslipMaindashboard = new javax.swing.JButton();
        TimeKeeping_MainDashboard = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        PunchIn = new javax.swing.JButton();
        PunchOut = new javax.swing.JButton();
        TimeInLabel = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TimeOutLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Shift = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PayrollHealth_MainDashboard = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        NoOfDaysPresent = new javax.swing.JLabel();
        NoOfDaysPresent1 = new javax.swing.JLabel();
        NoOfDaysPresent2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        EmployeeRecords_MainDashboard = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Request_MainDashboard = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ProfilePanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        profileFirstName = new javax.swing.JLabel();
        ProfileEmpNo = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ProfilePosition = new javax.swing.JLabel();
        ProfileStatus = new javax.swing.JLabel();
        ProfileBirthdate = new javax.swing.JLabel();
        ProfilePhonenumber = new javax.swing.JLabel();
        ProfileSSS = new javax.swing.JLabel();
        ProfilePagIbig = new javax.swing.JLabel();
        ProfilePhilhealth = new javax.swing.JLabel();
        ProfileTinnumber = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProfileAddress = new javax.swing.JTextArea();
        LeavePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel113 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel114 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AttendancePanel.setBackground(new java.awt.Color(0, 0, 0,100));
        AttendancePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        AttendancePanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        attendanceTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Time In", "Time Out", "Overtime", "Status"
            }
        ));
        attendanceTable.setGridColor(new java.awt.Color(153, 153, 153));
        attendanceTable.setName(""); // NOI18N
        attendanceTable.setOpaque(false);
        attendanceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(attendanceTable);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("Attendance Record");

        jButton2.setText("Apply Dispute");

        javax.swing.GroupLayout AttendancePanelLayout = new javax.swing.GroupLayout(AttendancePanel);
        AttendancePanel.setLayout(AttendancePanelLayout);
        AttendancePanelLayout.setHorizontalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendancePanelLayout.createSequentialGroup()
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttendancePanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AttendancePanelLayout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(418, 418, 418)))
                .addGap(45, 45, 45))
        );
        AttendancePanelLayout.setVerticalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AttendancePanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel1.add(AttendancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 990, 530));

        PayslipPanel.setBackground(new java.awt.Color(255, 255, 255));
        PayslipPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        PayslipPanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jLabel33.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel33.setText("MotorPH");

        jSeparator12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel34.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel34.setText(" 7 Jupiter Avenue cor. F. Sandoval Jr., Bagong Nayon, Quezon City");

        jLabel35.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel35.setText("Phone: (028) 911-5071 / (028) 911-5072 / (028) 911-5073 ");

        jLabel57.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel57.setText(" Email: corporate@motorph.com\t\t\t");

        jLabel58.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel58.setText("EMPLOYEE PAYSLIP");

        jLabel59.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel59.setText("PAYSLIP NO");

        jLabel60.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel60.setText("EMPLOYEE ID");

        jLabel61.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel61.setText("EMPLOYEE NAME");

        jLabel62.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel62.setText("EMPLOYEE NAME");

        jLabel63.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel63.setText("EMPLOYEE ID");

        jLabel64.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel64.setText("PAYSLIP NO");

        jLabel65.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel65.setText("END DATE");

        jLabel66.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel66.setText("POSITION");

        jLabel67.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel67.setText("START DATE");

        jLabel68.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel68.setText("PAYSLIP NO");

        jLabel69.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel69.setText("EMPLOYEE ID");

        jLabel70.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel70.setText("EMPLOYEE NAME");

        jSeparator13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel71.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel71.setText("Social Security System");

        jLabel72.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel72.setText("PAYSLIP NO");

        jLabel73.setBackground(new java.awt.Color(0, 102, 153));
        jLabel73.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel73.setText("                                                         EARNINGS");
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel74.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel74.setText("Monthly Rate");

        jLabel75.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel75.setText("PAYSLIP NO");

        jLabel76.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel76.setText("Daily Rate");

        jLabel77.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel77.setText("PAYSLIP NO");

        jLabel78.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel78.setText("PAYSLIP NO");

        jLabel79.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel79.setText("Days Worked");

        jLabel80.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel80.setText("PAYSLIP NO");

        jLabel81.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel81.setText("Overtime");

        jLabel82.setBackground(new java.awt.Color(0, 0, 102));
        jLabel82.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel82.setText("                                                     DEDUCTIONS");
        jLabel82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        jLabel83.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel83.setText("Rice Subsidy");

        jLabel84.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel84.setText("PAYSLIP NO");

        jLabel85.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel85.setText("Phone Allowance");

        jLabel86.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel86.setText("PAYSLIP NO");

        jLabel87.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel87.setText("Clothing Allowance");

        jLabel88.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel88.setText("PAYSLIP NO");

        jLabel89.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel89.setText("TOTAL");

        jLabel90.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel90.setText("PAYSLIP NO");

        jLabel91.setBackground(new java.awt.Color(0, 0, 102));
        jLabel91.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel91.setText("                                                       BENEFITS");
        jLabel91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        jLabel92.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel92.setText("Philhealth");

        jLabel93.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel93.setText("PAYSLIP NO");

        jLabel94.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel94.setText("PAYSLIP NO");

        jLabel95.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel95.setText("Pag-IbigPag-Ibig");

        jLabel96.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel96.setText("PAYSLIP NO");

        jLabel97.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel97.setText("Withholding Tax");

        jLabel98.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel98.setText("TOTAL DEDUCTIONS");

        jLabel99.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel99.setText("PAYSLIP NO");

        jLabel100.setBackground(new java.awt.Color(0, 0, 102));
        jLabel100.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel100.setText("                                                     SUMMARY");
        jLabel100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        jLabel101.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel101.setText("Gross Income");

        jLabel102.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel102.setText("PAYSLIP NO");

        jLabel103.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel103.setText("PAYSLIP NO");

        jLabel104.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel104.setText("Benefits");

        jLabel105.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel105.setText("Total Deducations");

        jLabel106.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel106.setText("PAYSLIP NO");

        jLabel107.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel107.setText("TAKE HOME PAY");

        jLabel108.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel108.setText("PAYSLIP NO");

        jLabel109.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel109.setText("GROSS INCOME");

        jLabel110.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel110.setText("PAYSLIP NO");

        javax.swing.GroupLayout PayslipPanelLayout = new javax.swing.GroupLayout(PayslipPanel);
        PayslipPanel.setLayout(PayslipPanelLayout);
        PayslipPanelLayout.setHorizontalGroup(
            PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayslipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel33))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel57))
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel34))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator13)
                                    .addComponent(jLabel58))
                                .addGap(174, 174, 174)))))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(261, 261, 261)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addGap(80, 80, 80))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel105)
                                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(257, 257, 257)
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                            .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(PayslipPanelLayout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(jLabel98)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(39, 39, 39)))
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PayslipPanelLayout.setVerticalGroup(
            PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayslipPanelLayout.createSequentialGroup()
                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel58)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70))
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66))
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62))
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel61)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel77)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel110)
                            .addComponent(jLabel109)))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jLabel83))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel86)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel88)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel90)
                            .addComponent(jLabel89))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(jLabel96))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(jLabel99))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel106)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108)))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(PayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 990, 460));

        EmployeeDashboard_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        EmployeeDashboard_MainDashboard.setPreferredSize(new java.awt.Dimension(980, 120));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee");
        jLabel5.setIconTextGap(0);

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dashboard");

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        LogOut.setBackground(new java.awt.Color(255, 102, 0));
        LogOut.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("LOG OUT");
        LogOut.setBorderPainted(false);
        LogOut.setOpaque(true);
        LogOut.setPreferredSize(new java.awt.Dimension(84, 32));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 50));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {1, 2};
        jPanel4Layout.rowHeights = new int[] {1};
        jPanel4Layout.columnWeights = new double[] {1.0, 2.0};
        jPanel4.setLayout(jPanel4Layout);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome,");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(72, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        jPanel4.add(jLabel7, gridBagConstraints);

        MainDashBoardFirstName.setBackground(new java.awt.Color(255, 255, 255));
        MainDashBoardFirstName.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        MainDashBoardFirstName.setForeground(new java.awt.Color(255, 255, 255));
        MainDashBoardFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MainDashBoardFirstName.setMaximumSize(new java.awt.Dimension(100, 20));
        MainDashBoardFirstName.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(MainDashBoardFirstName, gridBagConstraints);

        MainDashboardempNo.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        MainDashboardempNo.setForeground(new java.awt.Color(255, 255, 255));
        MainDashboardempNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MainDashboardempNo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MainDashboardempNo.setMaximumSize(new java.awt.Dimension(60, 20));
        MainDashboardempNo.setPreferredSize(new java.awt.Dimension(72, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        jPanel4.add(MainDashboardempNo, gridBagConstraints);

        Department.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Department.setForeground(new java.awt.Color(255, 255, 255));
        Department.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Department.setText("Finance Department");
        Department.setMaximumSize(new java.awt.Dimension(120, 20));
        Department.setPreferredSize(new java.awt.Dimension(120, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(Department, gridBagConstraints);

        javax.swing.GroupLayout EmployeeDashboard_MainDashboardLayout = new javax.swing.GroupLayout(EmployeeDashboard_MainDashboard);
        EmployeeDashboard_MainDashboard.setLayout(EmployeeDashboard_MainDashboardLayout);
        EmployeeDashboard_MainDashboardLayout.setHorizontalGroup(
            EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(450, 450, 450)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        EmployeeDashboard_MainDashboardLayout.setVerticalGroup(
            EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                        .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(EmployeeDashboard_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));
        EmployeeDashboard_MainDashboard.getAccessibleContext().setAccessibleDescription("");

        MenuBar_MainDashboard.setBackground(new java.awt.Color(34, 34, 50));
        MenuBar_MainDashboard.setPreferredSize(new java.awt.Dimension(300, 280));

        jPanel5.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motor");
        jLabel2.setIconTextGap(0);

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PH");
        jLabel3.setIconTextGap(0);

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("People Portal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(5, 0));

        Home.setBackground(new java.awt.Color(34, 34, 50));
        Home.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Home.setBorderPainted(false);
        Home.setPreferredSize(new java.awt.Dimension(160, 52));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel6.add(Home);

        ProfileButton.setBackground(new java.awt.Color(34, 34, 50));
        ProfileButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        ProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        ProfileButton.setText("Profile");
        ProfileButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ProfileButton.setBorderPainted(false);
        ProfileButton.setPreferredSize(new java.awt.Dimension(160, 52));
        ProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileButtonMouseExited(evt);
            }
        });
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ProfileButton);

        AttendanceMainDashboardButton.setBackground(new java.awt.Color(34, 34, 50));
        AttendanceMainDashboardButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        AttendanceMainDashboardButton.setForeground(new java.awt.Color(255, 255, 255));
        AttendanceMainDashboardButton.setText("Attendance");
        AttendanceMainDashboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AttendanceMainDashboardButton.setBorderPainted(false);
        AttendanceMainDashboardButton.setPreferredSize(new java.awt.Dimension(160, 52));
        AttendanceMainDashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AttendanceMainDashboardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AttendanceMainDashboardButtonMouseExited(evt);
            }
        });
        AttendanceMainDashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceMainDashboardButtonActionPerformed(evt);
            }
        });
        jPanel6.add(AttendanceMainDashboardButton);

        LeaveMainDashboard.setBackground(new java.awt.Color(34, 34, 50));
        LeaveMainDashboard.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LeaveMainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        LeaveMainDashboard.setText("Leave");
        LeaveMainDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LeaveMainDashboard.setBorderPainted(false);
        LeaveMainDashboard.setPreferredSize(new java.awt.Dimension(160, 52));
        LeaveMainDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LeaveMainDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LeaveMainDashboardMouseExited(evt);
            }
        });
        LeaveMainDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveMainDashboardActionPerformed(evt);
            }
        });
        jPanel6.add(LeaveMainDashboard);

        PayslipMaindashboard.setBackground(new java.awt.Color(34, 34, 50));
        PayslipMaindashboard.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        PayslipMaindashboard.setForeground(new java.awt.Color(255, 255, 255));
        PayslipMaindashboard.setText("Payslip");
        PayslipMaindashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PayslipMaindashboard.setBorderPainted(false);
        PayslipMaindashboard.setPreferredSize(new java.awt.Dimension(160, 52));
        PayslipMaindashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PayslipMaindashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PayslipMaindashboardMouseExited(evt);
            }
        });
        PayslipMaindashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayslipMaindashboardActionPerformed(evt);
            }
        });
        jPanel6.add(PayslipMaindashboard);

        javax.swing.GroupLayout MenuBar_MainDashboardLayout = new javax.swing.GroupLayout(MenuBar_MainDashboard);
        MenuBar_MainDashboard.setLayout(MenuBar_MainDashboardLayout);
        MenuBar_MainDashboardLayout.setHorizontalGroup(
            MenuBar_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBar_MainDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuBar_MainDashboardLayout.setVerticalGroup(
            MenuBar_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBar_MainDashboardLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jPanel1.add(MenuBar_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        TimeKeeping_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        TimeKeeping_MainDashboard.setPreferredSize(new java.awt.Dimension(600, 260));

        jProgressBar1.setBackground(new java.awt.Color(51, 51, 51));
        jProgressBar1.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(255, 153, 0));
        jProgressBar1.setValue(20);
        jProgressBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        jProgressBar1.setFocusable(false);
        jProgressBar1.setOpaque(true);
        jProgressBar1.setRequestFocusEnabled(false);
        jProgressBar1.setStringPainted(true);

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Time in : ");

        PunchIn.setBackground(new java.awt.Color(0, 153, 0));
        PunchIn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        PunchIn.setForeground(new java.awt.Color(255, 255, 255));
        PunchIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterw24px.png"))); // NOI18N
        PunchIn.setText("Time in");
        PunchIn.setBorderPainted(false);
        PunchIn.setIconTextGap(8);
        PunchIn.setMargin(new java.awt.Insets(2, 8, 3, 8));
        PunchIn.setPreferredSize(new java.awt.Dimension(96, 52));
        PunchIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchInActionPerformed(evt);
            }
        });

        PunchOut.setBackground(new java.awt.Color(204, 51, 0));
        PunchOut.setForeground(new java.awt.Color(255, 255, 255));
        PunchOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitw24px.png"))); // NOI18N
        PunchOut.setText("Time out");
        PunchOut.setBorderPainted(false);
        PunchOut.setIconTextGap(8);
        PunchOut.setPreferredSize(new java.awt.Dimension(112, 52));
        PunchOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchOutActionPerformed(evt);
            }
        });

        TimeInLabel.setBackground(new java.awt.Color(0, 0, 0));
        TimeInLabel.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        TimeInLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeInLabel.setPreferredSize(new java.awt.Dimension(60, 16));

        jLabel56.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Time out : ");

        TimeOutLabel.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        TimeOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeOutLabel.setPreferredSize(new java.awt.Dimension(60, 16));

        jPanel7.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-box.png"))); // NOI18N
        jLabel9.setText(" Present");

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Schedule Status :");

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 0));
        jLabel11.setText("WORK");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Schedule :");

        Shift.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Shift.setForeground(new java.awt.Color(255, 255, 255));
        Shift.setText("03:15AM - 12:15 PM");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Shift))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Shift))
                .addContainerGap())
        );

        jLabel13.setBackground(new java.awt.Color(0,0,0,0));
        jLabel13.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Attendance");

        javax.swing.GroupLayout TimeKeeping_MainDashboardLayout = new javax.swing.GroupLayout(TimeKeeping_MainDashboard);
        TimeKeeping_MainDashboard.setLayout(TimeKeeping_MainDashboardLayout);
        TimeKeeping_MainDashboardLayout.setHorizontalGroup(
            TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(PunchIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(PunchOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        TimeKeeping_MainDashboardLayout.setVerticalGroup(
            TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PunchIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PunchOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TimeOutLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(TimeKeeping_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        PayrollHealth_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        PayrollHealth_MainDashboard.setPreferredSize(new java.awt.Dimension(360, 200));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Payroll Health");

        jSeparator6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 2, true));

        jSeparator7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jSeparator7.setVerifyInputWhenFocusTarget(false);

        jSeparator8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));

        NoOfDaysPresent.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        NoOfDaysPresent.setForeground(new java.awt.Color(255, 255, 255));
        NoOfDaysPresent.setText("0");
        NoOfDaysPresent.setToolTipText("Absences");

        NoOfDaysPresent1.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        NoOfDaysPresent1.setForeground(new java.awt.Color(255, 255, 255));
        NoOfDaysPresent1.setText("4");
        NoOfDaysPresent1.setToolTipText("Days Worked");

        NoOfDaysPresent2.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        NoOfDaysPresent2.setForeground(new java.awt.Color(255, 255, 255));
        NoOfDaysPresent2.setText("0");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle (1).png"))); // NOI18N

        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Days Worked");

        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Absences");

        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Leaves");

        javax.swing.GroupLayout PayrollHealth_MainDashboardLayout = new javax.swing.GroupLayout(PayrollHealth_MainDashboard);
        PayrollHealth_MainDashboard.setLayout(PayrollHealth_MainDashboardLayout);
        PayrollHealth_MainDashboardLayout.setHorizontalGroup(
            PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121)
                    .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoOfDaysPresent1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoOfDaysPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel123))
                .addGap(40, 40, 40)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoOfDaysPresent2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel124))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        PayrollHealth_MainDashboardLayout.setVerticalGroup(
            PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14))
                .addGap(23, 23, 23)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator7)
                    .addComponent(NoOfDaysPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfDaysPresent1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfDaysPresent2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel123)
                    .addComponent(jLabel124))
                .addGap(83, 83, 83))
        );

        jPanel1.add(PayrollHealth_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        EmployeeRecords_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        EmployeeRecords_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeRecords_MainDashboard.setPreferredSize(new java.awt.Dimension(600, 92));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Employee Records");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setMinimumSize(new java.awt.Dimension(200, 50));
        jButton3.setOpaque(true);
        jButton3.setPreferredSize(new java.awt.Dimension(540, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmployeeRecords_MainDashboardLayout = new javax.swing.GroupLayout(EmployeeRecords_MainDashboard);
        EmployeeRecords_MainDashboard.setLayout(EmployeeRecords_MainDashboardLayout);
        EmployeeRecords_MainDashboardLayout.setHorizontalGroup(
            EmployeeRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        EmployeeRecords_MainDashboardLayout.setVerticalGroup(
            EmployeeRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRecords_MainDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EmployeeRecords_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        Request_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        Request_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        Request_MainDashboard.setPreferredSize(new java.awt.Dimension(360, 240));

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("My Requests");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle (1).png"))); // NOI18N

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(3, 4));

        jLabel23.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Leave");
        jPanel8.add(jLabel23);

        jLabel26.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("-");
        jPanel8.add(jLabel26);

        jLabel30.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("-");
        jPanel8.add(jLabel30);

        jLabel31.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("-");
        jPanel8.add(jLabel31);

        jLabel24.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Correction");
        jPanel8.add(jLabel24);

        jLabel27.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("-");
        jPanel8.add(jLabel27);

        jLabel28.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("-");
        jPanel8.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("-");
        jPanel8.add(jLabel29);

        jLabel25.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Overtime");
        jPanel8.add(jLabel25);

        jLabel125.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("-");
        jPanel8.add(jLabel125);

        jLabel126.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("-");
        jPanel8.add(jLabel126);

        jLabel127.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("-");
        jPanel8.add(jLabel127);

        jPanel10.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Pending");

        jLabel21.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Approved");

        jLabel22.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Denied");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(26, 26, 26)
                .addComponent(jLabel21)
                .addGap(26, 26, 26)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        javax.swing.GroupLayout Request_MainDashboardLayout = new javax.swing.GroupLayout(Request_MainDashboard);
        Request_MainDashboard.setLayout(Request_MainDashboardLayout);
        Request_MainDashboardLayout.setHorizontalGroup(
            Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Request_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                        .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        Request_MainDashboardLayout.setVerticalGroup(
            Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jPanel1.add(Request_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, -1, -1));

        ProfilePanel.setBackground(new java.awt.Color(34, 34, 50, 220));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(980, 520));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        profileFirstName.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        ProfileEmpNo.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile (1).png"))); // NOI18N

        jSeparator11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel37.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel37.setText("Position");

        jLabel38.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel38.setText("Status");

        jLabel39.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel39.setText("Birthdate");

        jLabel40.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel40.setText("Phone Number");

        jLabel41.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel41.setText("Address");

        jLabel42.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel42.setText("My Account Numbers");

        jLabel43.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel43.setText("SSS");

        jLabel44.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel44.setText("Pag-ibig");

        jLabel45.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel45.setText("Phil-health");

        jLabel46.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel46.setText("Tin No.");

        jLabel47.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel47.setText(":");

        jLabel48.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel48.setText(":");

        jLabel49.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel49.setText(":");

        jLabel50.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel50.setText(":");

        jLabel51.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel51.setText(":");

        jLabel52.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel52.setText(":");

        jLabel53.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel53.setText(":");

        jLabel54.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel54.setText(":");

        jLabel55.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel55.setText(":");

        jButton4.setText("Update");

        ProfilePosition.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileStatus.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileBirthdate.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePhonenumber.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileSSS.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePagIbig.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePhilhealth.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileTinnumber.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileAddress.setBackground(new java.awt.Color(255, 255, 255));
        ProfileAddress.setColumns(20);
        ProfileAddress.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        ProfileAddress.setRows(5);
        ProfileAddress.setWrapStyleWord(true);
        ProfileAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(ProfileAddress);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfileEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel36))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ProfilePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ProfileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ProfileBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ProfilePhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProfilePhilhealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ProfileTinnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProfileSSS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProfilePagIbig, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(9, 9, 9)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(profileFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ProfileEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel47)
                                    .addComponent(ProfilePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel48)
                                    .addComponent(ProfileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel49)
                                    .addComponent(ProfileBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel50)
                                    .addComponent(ProfilePhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel51)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel44)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel45)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel46))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(ProfileSSS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel53))
                                    .addComponent(ProfilePagIbig, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(ProfilePhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel55))
                                    .addComponent(ProfileTinnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        LeavePanel.setBackground(new java.awt.Color(0, 0, 0,100));
        LeavePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        LeavePanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jLabel112.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel112.setText("Leave Type");

        jComboBox1.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Leave Type", "Vacation Leave", "Sick Leave", "Emergency Leave" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox1.setName("Choose the Type of Leave"); // NOI18N

        jLabel113.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel113.setText("Reason");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel114.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel114.setText("Date");

        jButton1.setText("Submit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel112)
                        .addComponent(jLabel114)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel113)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel114)
                .addGap(10, 10, 10)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel111.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Leave Application");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel115.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel115.setText("Leave Balance");
        jPanel3.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel122.setFont(new java.awt.Font("Lucida Bright", 1, 50)); // NOI18N
        jLabel122.setText("14");
        jPanel3.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel116.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel116.setText("Vacation Leave");
        jPanel3.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel120.setFont(new java.awt.Font("Lucida Bright", 1, 50)); // NOI18N
        jLabel120.setText("15");
        jPanel3.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel117.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel117.setText("Sick Leave");
        jPanel3.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new-moon (1).png"))); // NOI18N
        jPanel3.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 76, -1, -1));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new-moon (1).png"))); // NOI18N
        jPanel3.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 76, -1, -1));

        javax.swing.GroupLayout LeavePanelLayout = new javax.swing.GroupLayout(LeavePanel);
        LeavePanel.setLayout(LeavePanelLayout);
        LeavePanelLayout.setHorizontalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LeavePanelLayout.setVerticalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel1.add(LeavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 990, 530));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main-bg.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Background.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
     String empID = MainDashboardempNo.getText();


     // Check if the userID exists in the employee records
        boolean accessGranted = false;
        for (EmployeeRecords employee : employees) {
            if (employee.getEmpNo() == Integer.parseInt(empID)) {
                accessGranted = true;
                
                int emp = employee.getEmpNo();
                String empl = Integer.toString(emp);
                String firstname = employee.getFirstName();
                String lastname = employee.getLastName();
                String fullname = firstname +"  "+lastname;
                ProfileEmpNo.setText(empl);
                profileFirstName.setText(fullname);
                ProfilePosition.setText(employee.getPosition());
                ProfileStatus.setText(employee.getStatus());
                ProfileBirthdate.setText(employee.getBirthDate());
                ProfilePhonenumber.setText(employee.getPhoneNumber());
                ProfileSSS.setText(employee.getSss());
                ProfilePagIbig.setText(employee.getPagIbig());
                ProfilePhilhealth.setText(employee.getPhilHealth());
                ProfileTinnumber.setText(employee.getTin());
                ProfileAddress.setLineWrap(true); 
                ProfileAddress.setWrapStyleWord(true);
                ProfileAddress.setText(employee.getAddress());
                ProfileAddress.setEditable(false);
             AttendancePanel.setVisible(false);
                break;
            }
        }
        // Grant or deny access based on the result
        if (accessGranted) {
            // Access granted, you can open the dashboard or perform any action here
            TimeKeeping_MainDashboard.setVisible(false);
            PayrollHealth_MainDashboard.setVisible(false);
            EmployeeRecords_MainDashboard.setVisible(false);
            Request_MainDashboard.setVisible(false);
            PayslipPanel.setVisible(false);
            ProfilePanel.setVisible(true);
            
        } else {
            // Access denied, display an error message
            JOptionPane.showMessageDialog(this, "Invalid UserID! Access Denied.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }


// TODO add your handling code here:
    }//GEN-LAST:event_ProfileButtonActionPerformed

   
    private void AttendanceMainDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceMainDashboardButtonActionPerformed
       String empID = MainDashboardempNo.getText().trim();
boolean accessGranted = false;

System.out.println("Employee ID from input: " + empID);

for (AttendanceRecord att : attendance) {
     System.out.println("Employee ID from record: " + att.getEmpID());
    if (att.getEmpID() == Integer.parseInt(empID)) {
        accessGranted = true;
        break;
    }
}

// Grant or deny access based on the result
if (accessGranted) {
    DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
    model.setRowCount(0);

    // Populate the table with data from the CSV file
    String csvFilePath = "src/Files/timekeeping.csv";
    boolean foundRecords = false;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 5 && data[0].equals(empID)) {
                model.addRow(new Object[]{data[1], data[2], data[3], data[4]});
                foundRecords = true;
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    // Check if records were found for the employee
    if (!foundRecords) {
        JOptionPane.showMessageDialog(this, "No attendance records found for the employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Show the AttendancePanel and hide other panels
    TimeKeeping_MainDashboard.setVisible(false);
    PayrollHealth_MainDashboard.setVisible(false);
    EmployeeRecords_MainDashboard.setVisible(false);
    Request_MainDashboard.setVisible(false);
    PayslipPanel.setVisible(false);
    ProfilePanel.setVisible(false);
    AttendancePanel.setVisible(true);
    LeavePanel.setVisible(false);
} else {
    // Access denied, display an error message
    JOptionPane.showMessageDialog(this, "Access Denied. Employee ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
}

            
            
    }//GEN-LAST:event_AttendanceMainDashboardButtonActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed

            TimeKeeping_MainDashboard.setVisible(true);
            PayrollHealth_MainDashboard.setVisible(true);
            EmployeeRecords_MainDashboard.setVisible(true);
            Request_MainDashboard.setVisible(true);
            PayslipPanel.setVisible(false);
            ProfilePanel.setVisible(false);
            AttendancePanel.setVisible(false);
            LeavePanel.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void PayslipMaindashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayslipMaindashboardActionPerformed
         TimeKeeping_MainDashboard.setVisible(false);
            PayrollHealth_MainDashboard.setVisible(false);
            EmployeeRecords_MainDashboard.setVisible(false);
            Request_MainDashboard.setVisible(false);
            PayslipPanel.setVisible(true);
            ProfilePanel.setVisible(false);
            AttendancePanel.setVisible(false);
            LeavePanel.setVisible(false);
    }//GEN-LAST:event_PayslipMaindashboardActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
LogIn login = new LogIn();  
login.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void LeaveMainDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveMainDashboardActionPerformed
       TimeKeeping_MainDashboard.setVisible(false);
            PayrollHealth_MainDashboard.setVisible(false);
            EmployeeRecords_MainDashboard.setVisible(false);
            Request_MainDashboard.setVisible(false);
            PayslipPanel.setVisible(false);
            ProfilePanel.setVisible(false);
            AttendancePanel.setVisible(false);
            LeavePanel.setVisible(true);
    }//GEN-LAST:event_LeaveMainDashboardActionPerformed

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
        Home.setBackground(Color.BLACK);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        // TODO add your handling code here:
        Home.setBackground(new java.awt.Color(34, 34, 50));
    }//GEN-LAST:event_HomeMouseExited

    private void ProfileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileButtonMouseEntered
        // TODO add your handling code here:
        ProfileButton.setBackground(Color.black);
    }//GEN-LAST:event_ProfileButtonMouseEntered

    private void ProfileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileButtonMouseExited
        // TODO add your handling code here:
        ProfileButton.setBackground(new java.awt.Color(34, 34, 50));
    }//GEN-LAST:event_ProfileButtonMouseExited

    private void AttendanceMainDashboardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendanceMainDashboardButtonMouseEntered
        // TODO add your handling code here:
        AttendanceMainDashboardButton.setBackground(Color.black);
    }//GEN-LAST:event_AttendanceMainDashboardButtonMouseEntered

    private void AttendanceMainDashboardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendanceMainDashboardButtonMouseExited
        // TODO add your handling code here:
        AttendanceMainDashboardButton.setBackground(new java.awt.Color(34, 34, 50));
    }//GEN-LAST:event_AttendanceMainDashboardButtonMouseExited

    private void LeaveMainDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveMainDashboardMouseEntered
        // TODO add your handling code here:
        LeaveMainDashboard.setBackground(Color.black);
    }//GEN-LAST:event_LeaveMainDashboardMouseEntered

    private void LeaveMainDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveMainDashboardMouseExited
        // TODO add your handling code here:
        LeaveMainDashboard.setBackground(new java.awt.Color(34, 34, 50));
    }//GEN-LAST:event_LeaveMainDashboardMouseExited

    private void PayslipMaindashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayslipMaindashboardMouseEntered
        // TODO add your handling code here:
        PayslipMaindashboard.setBackground(Color.black);
    }//GEN-LAST:event_PayslipMaindashboardMouseEntered

    private void PayslipMaindashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayslipMaindashboardMouseExited
        // TODO add your handling code here:
        PayslipMaindashboard.setBackground(new java.awt.Color(34, 34, 50));
    }//GEN-LAST:event_PayslipMaindashboardMouseExited

    private void PunchOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunchOutActionPerformed
        String empID = MainDashboardempNo.getText();
        boolean accessGranted = false;

        for (AttendanceRecord att : attendance) {
            if (att.getEmpID()== Integer.parseInt(empID)) {
                // Compare empID with the employee ID from the CSV
                accessGranted = true;
                try {
                    String timeOut = att.getTimeOut(); // Record time out
                    if (timeOut != null) {
                        TimeOutLabel.setText(att.formatTime(timeOut)); // Display time out
                        att.writeToCSV(TimeInLabel.getText(), TimeOutLabel.getText()); // Write to CSV
                        PunchOut.setEnabled(false);
                        PunchIn.setEnabled(true);
                    } else {
                        // Handle the case when timeOut is null
                        System.out.println("Error: Time out is null.");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
                break; // Exit the loop once the employee ID is found
            } else {    }
        }

        if (!accessGranted) {
            // If access is not granted (i.e., employee ID not found in the CSV), display an error message
            JOptionPane.showMessageDialog(this, "Invalid Employee ID! Access Denied.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_PunchOutActionPerformed

    private void PunchInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunchInActionPerformed

        String empID = MainDashboardempNo.getText(); // Assuming you're getting the employee ID from a JTextField
        boolean accessGranted = false;

        for (AttendanceRecord att : attendance) {
            if (att.getEmpID() == Integer.parseInt(empID)) {
                // Compare empID with the employee ID from the CSV
                accessGranted = true;
                try {
                    String timeIn = att.timeIn(); // Record time in
                    if (timeIn != null) {
                        TimeInLabel.setText(att.formatTime(timeIn)); // Display time in
                        PunchIn.setEnabled(false);
                        PunchOut.setEnabled(true);
                        break; // Exit the loop once time in is recorded
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (!accessGranted) {
            // If access is not granted (i.e., employee ID not found in the CSV), display an error message
            JOptionPane.showMessageDialog(this, "Invalid Employee ID! Access Denied.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_PunchInActionPerformed

    private void ProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileButtonMouseClicked
        // TODO add your handling code here:
        jLabel6.setText("Profile");
        
    }//GEN-LAST:event_ProfileButtonMouseClicked

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttendanceMainDashboardButton;
    private javax.swing.JPanel AttendancePanel;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Department;
    private javax.swing.JPanel EmployeeDashboard_MainDashboard;
    private javax.swing.JPanel EmployeeRecords_MainDashboard;
    private javax.swing.JButton Home;
    private javax.swing.JButton LeaveMainDashboard;
    private javax.swing.JPanel LeavePanel;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel MainDashBoardFirstName;
    private javax.swing.JLabel MainDashboardempNo;
    private javax.swing.JPanel MenuBar_MainDashboard;
    private javax.swing.JLabel NoOfDaysPresent;
    private javax.swing.JLabel NoOfDaysPresent1;
    private javax.swing.JLabel NoOfDaysPresent2;
    private javax.swing.JPanel PayrollHealth_MainDashboard;
    private javax.swing.JButton PayslipMaindashboard;
    private javax.swing.JPanel PayslipPanel;
    private javax.swing.JTextArea ProfileAddress;
    private javax.swing.JLabel ProfileBirthdate;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JLabel ProfileEmpNo;
    private javax.swing.JLabel ProfilePagIbig;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JLabel ProfilePhilhealth;
    private javax.swing.JLabel ProfilePhonenumber;
    private javax.swing.JLabel ProfilePosition;
    private javax.swing.JLabel ProfileSSS;
    private javax.swing.JLabel ProfileStatus;
    private javax.swing.JLabel ProfileTinnumber;
    private javax.swing.JButton PunchIn;
    private javax.swing.JButton PunchOut;
    private javax.swing.JPanel Request_MainDashboard;
    private javax.swing.JLabel Shift;
    private javax.swing.JLabel TimeInLabel;
    private javax.swing.JPanel TimeKeeping_MainDashboard;
    private javax.swing.JLabel TimeOutLabel;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel profileFirstName;
    // End of variables declaration//GEN-END:variables

   
}
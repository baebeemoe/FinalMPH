
package Forms;

import System.AttendanceRecord;
import System.EmployeeRecords;
import System.Benefit;
import System.Deduction;
import System.PayPeriod;
import System.Request;
import System.Earning;
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
    private PayPeriod payperiod;
    
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
        payslipEmployeeName = new javax.swing.JLabel();
        payslipEmployeeNumber = new javax.swing.JLabel();
        payslipNumber = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        payslipStartDate = new javax.swing.JLabel();
        payslipEndDate = new javax.swing.JLabel();
        payslipPosition = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        payslipSSS = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        payslipMonthlyRate = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        payslipDailyRate = new javax.swing.JLabel();
        payslipDaysWorked = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        payslipOvertime = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        payslipRiceAllowance = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        payslipPhoneAllowance = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        payslipClothingAllowance = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        payslipBenefitTotal = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        payslipPhilhealth = new javax.swing.JLabel();
        payslipPagibig = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        payslipTax = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        payslipDeductionTotal = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        summaryGrossIncome = new javax.swing.JLabel();
        summaryBenefits = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        summaryTotalDeduction = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        summaryTakeHomePay = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        payslipGrossIncome = new javax.swing.JLabel();
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
        jLabel42 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        labelPosition = new javax.swing.JLabel();
        ProfilePosition = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        ProfileStatus = new javax.swing.JLabel();
        labelBirthdate = new javax.swing.JLabel();
        ProfileBirthdate = new javax.swing.JLabel();
        labelPhoneNumber = new javax.swing.JLabel();
        ProfilePhonenumber = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProfileAddress = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        labelSSSNo = new javax.swing.JLabel();
        ProfileSSS = new javax.swing.JLabel();
        labelPagibigNo = new javax.swing.JLabel();
        ProfilePagIbig = new javax.swing.JLabel();
        labelPhilhealthNo = new javax.swing.JLabel();
        ProfilePhilhealth = new javax.swing.JLabel();
        labelTIN = new javax.swing.JLabel();
        ProfileTinnumber = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        LeavePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        LeavePanelLeaveSelector = new javax.swing.JComboBox<>();
        jLabel113 = new javax.swing.JLabel();
        LeavePanelStartDate = new com.toedter.calendar.JDateChooser();
        LeavePanelReason = new javax.swing.JTextArea();
        jLabel114 = new javax.swing.JLabel();
        LeavePanelSubmitButton = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        LeavePanelEndDate = new com.toedter.calendar.JDateChooser();
        jLabel119 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
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

        AttendancePanel.setBackground(new java.awt.Color(34, 34, 50, 220));
        AttendancePanel.setPreferredSize(new java.awt.Dimension(980, 520));

        attendanceTable.setBackground(new java.awt.Color(255, 255, 255));
        attendanceTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        attendanceTable.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        attendanceTable.setForeground(new java.awt.Color(0, 0, 0));
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

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("APPLY DISPUTE");
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(180, 36));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AttendancePanelLayout = new javax.swing.GroupLayout(AttendancePanel);
        AttendancePanel.setLayout(AttendancePanelLayout);
        AttendancePanelLayout.setHorizontalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendancePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(431, 431, 431))
        );
        AttendancePanelLayout.setVerticalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AttendancePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel1.add(AttendancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        PayslipPanel.setBackground(new java.awt.Color(255, 255, 255));
        PayslipPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        PayslipPanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jLabel33.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel33.setText("MotorPH");

        jSeparator12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jSeparator12.setOpaque(true);

        jLabel34.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel34.setText(" 7 Jupiter Avenue cor. F. Sandoval Jr., Bagong Nayon, Quezon City");

        jLabel35.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel35.setText("Phone: (028) 911-5071 / (028) 911-5072 / (028) 911-5073 ");

        jLabel57.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel57.setText(" Email: corporate@motorph.com\t\t\t");

        jLabel58.setBackground(new java.awt.Color(51, 51, 51));
        jLabel58.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("EMPLOYEE PAYSLIP");
        jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel58.setOpaque(true);
        jLabel58.setPreferredSize(new java.awt.Dimension(500, 24));

        jLabel59.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel59.setText("PAYSLIP NO");

        jLabel60.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel60.setText("EMPLOYEE ID");

        jLabel61.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel61.setText("EMPLOYEE NAME");

        payslipEmployeeName.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipEmployeeName.setText("EMPLOYEE NAME");

        payslipEmployeeNumber.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipEmployeeNumber.setText("EMPLOYEE ID");

        payslipNumber.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipNumber.setText("00001");

        jLabel65.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel65.setText("END DATE");

        jLabel66.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel66.setText("POSITION");

        jLabel67.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel67.setText("START DATE");

        payslipStartDate.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipStartDate.setText("02/01/2024");

        payslipEndDate.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipEndDate.setText("02/15/2024");

        payslipPosition.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipPosition.setText("EMPLOYEE NAME");

        jLabel71.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel71.setText("Social Security System");

        payslipSSS.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipSSS.setText("PAYSLIP NO");

        jLabel73.setBackground(new java.awt.Color(102, 102, 102));
        jLabel73.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("EARNINGS");
        jLabel73.setOpaque(true);

        jLabel74.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel74.setText("Monthly Rate");

        payslipMonthlyRate.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipMonthlyRate.setText("PAYSLIP NO");

        jLabel76.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel76.setText("Daily Rate");

        payslipDailyRate.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipDailyRate.setText("PAYSLIP NO");

        payslipDaysWorked.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipDaysWorked.setText("PAYSLIP NO");

        jLabel79.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel79.setText("Days Worked");

        payslipOvertime.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipOvertime.setText("PAYSLIP NO");

        jLabel81.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel81.setText("Overtime");

        jLabel82.setBackground(new java.awt.Color(0, 0, 102));
        jLabel82.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel82.setText("                                                     DEDUCTIONS");
        jLabel82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        jLabel83.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel83.setText("Rice Subsidy");

        payslipRiceAllowance.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipRiceAllowance.setText("PAYSLIP NO");

        jLabel85.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel85.setText("Phone Allowance");

        payslipPhoneAllowance.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipPhoneAllowance.setText("PAYSLIP NO");

        jLabel87.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel87.setText("Clothing Allowance");

        payslipClothingAllowance.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipClothingAllowance.setText("PAYSLIP NO");

        jLabel89.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel89.setText("TOTAL");

        payslipBenefitTotal.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipBenefitTotal.setText("PAYSLIP NO");

        jLabel91.setBackground(new java.awt.Color(0, 0, 102));
        jLabel91.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel91.setText("                                                       BENEFITS");
        jLabel91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        jLabel92.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel92.setText("Philhealth");

        payslipPhilhealth.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipPhilhealth.setText("PAYSLIP NO");

        payslipPagibig.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipPagibig.setText("PAYSLIP NO");

        jLabel95.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel95.setText("Pag-Ibig");

        payslipTax.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipTax.setText("PAYSLIP NO");

        jLabel97.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel97.setText("Withholding Tax");

        jLabel98.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel98.setText("TOTAL DEDUCTIONS");

        payslipDeductionTotal.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        payslipDeductionTotal.setText("PAYSLIP NO");

        jLabel100.setBackground(new java.awt.Color(0, 0, 102));
        jLabel100.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel100.setText("                                                     SUMMARY");
        jLabel100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        jLabel101.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel101.setText("Gross Income");

        summaryGrossIncome.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        summaryGrossIncome.setText("PAYSLIP NO");

        summaryBenefits.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        summaryBenefits.setText("PAYSLIP NO");

        jLabel104.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel104.setText("Benefits");

        jLabel105.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel105.setText("Total Deducations");

        summaryTotalDeduction.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        summaryTotalDeduction.setText("PAYSLIP NO");

        jLabel107.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel107.setText("TAKE HOME PAY");

        summaryTakeHomePay.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        summaryTakeHomePay.setText("PAYSLIP NO");

        jLabel109.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel109.setText("GROSS INCOME");

        payslipGrossIncome.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipGrossIncome.setText("PAYSLIP NO");

        javax.swing.GroupLayout PayslipPanelLayout = new javax.swing.GroupLayout(PayslipPanel);
        PayslipPanel.setLayout(PayslipPanelLayout);
        PayslipPanelLayout.setHorizontalGroup(
            PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayslipPanelLayout.createSequentialGroup()
                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel57))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(payslipNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payslipEmployeeNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payslipEmployeeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(payslipStartDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payslipEndDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payslipPosition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(306, 306, 306)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(payslipGrossIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payslipMonthlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payslipDailyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payslipOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payslipDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(261, 261, 261)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(payslipRiceAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addGap(80, 80, 80))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(payslipPhoneAllowance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(payslipClothingAllowance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(payslipBenefitTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                            .addComponent(summaryGrossIncome, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(summaryBenefits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel105)
                                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(257, 257, 257)
                                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(summaryTotalDeduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(summaryTakeHomePay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(payslipSSS, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(payslipPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(payslipPagibig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(payslipTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(payslipDeductionTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(39, 39, 39)))
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                .addComponent(payslipStartDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipEndDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipPosition))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                .addComponent(payslipNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipEmployeeNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipEmployeeName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel61)))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel73)
                        .addGap(18, 18, 18)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipMonthlyRate)
                            .addComponent(jLabel74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipDailyRate)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipDaysWorked)
                            .addComponent(jLabel79))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipOvertime)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipGrossIncome)
                            .addComponent(jLabel109)))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payslipRiceAllowance)
                            .addComponent(jLabel83))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipPhoneAllowance)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipClothingAllowance)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(payslipBenefitTotal)
                            .addComponent(jLabel89))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payslipSSS)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(payslipPhilhealth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(payslipPagibig))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(payslipTax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(payslipDeductionTotal))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(summaryGrossIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(summaryBenefits)
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(summaryTotalDeduction)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(summaryTakeHomePay)))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel1.add(PayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 980, 460));

        EmployeeDashboard_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        EmployeeDashboard_MainDashboard.setMaximumSize(new java.awt.Dimension(980, 120));
        EmployeeDashboard_MainDashboard.setPreferredSize(new java.awt.Dimension(980, 120));
        EmployeeDashboard_MainDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee");
        jLabel5.setIconTextGap(0);
        EmployeeDashboard_MainDashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 24, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dashboard");
        EmployeeDashboard_MainDashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 67, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        EmployeeDashboard_MainDashboard.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 6, 1, 108));

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
        EmployeeDashboard_MainDashboard.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 41, -1, -1));

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

        EmployeeDashboard_MainDashboard.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 29, -1, 58));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttendanceMainDashboardButtonMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeaveMainDashboardMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayslipMaindashboardMouseClicked(evt);
            }
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
                .addContainerGap(44, Short.MAX_VALUE))
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
        PunchIn.setPreferredSize(new java.awt.Dimension(112, 52));
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
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(PunchIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(PunchOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13)))
                .addContainerGap(25, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PunchIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PunchOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TimeOutLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
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

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(936, 463));

        jSeparator10.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator10.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(1, 300));

        profileFirstName.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        profileFirstName.setForeground(new java.awt.Color(255, 255, 255));
        profileFirstName.setText("Name");

        ProfileEmpNo.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ProfileEmpNo.setForeground(new java.awt.Color(255, 255, 255));
        ProfileEmpNo.setText("Employee No.");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile (1).png"))); // NOI18N

        jSeparator11.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator11.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator11.setOpaque(true);

        jLabel42.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("My Account Numbers");

        jPanel11.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jPanel11.setOpaque(false);
        java.awt.GridBagLayout jPanel11Layout = new java.awt.GridBagLayout();
        jPanel11Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel11Layout.rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 2.0};
        jPanel11.setLayout(jPanel11Layout);

        labelPosition.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelPosition.setForeground(new java.awt.Color(255, 255, 255));
        labelPosition.setText("Position");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel11.add(labelPosition, gridBagConstraints);

        ProfilePosition.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfilePosition.setForeground(new java.awt.Color(255, 255, 255));
        ProfilePosition.setText("position");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        jPanel11.add(ProfilePosition, gridBagConstraints);

        labelStatus.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel11.add(labelStatus, gridBagConstraints);

        ProfileStatus.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfileStatus.setForeground(new java.awt.Color(255, 255, 255));
        ProfileStatus.setText("status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        jPanel11.add(ProfileStatus, gridBagConstraints);

        labelBirthdate.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelBirthdate.setForeground(new java.awt.Color(255, 255, 255));
        labelBirthdate.setText("Birthdate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel11.add(labelBirthdate, gridBagConstraints);

        ProfileBirthdate.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfileBirthdate.setForeground(new java.awt.Color(255, 255, 255));
        ProfileBirthdate.setText("birthday");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        jPanel11.add(ProfileBirthdate, gridBagConstraints);

        labelPhoneNumber.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        labelPhoneNumber.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel11.add(labelPhoneNumber, gridBagConstraints);

        ProfilePhonenumber.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfilePhonenumber.setForeground(new java.awt.Color(255, 255, 255));
        ProfilePhonenumber.setText("phone number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        jPanel11.add(ProfilePhonenumber, gridBagConstraints);

        labelAddress.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(255, 255, 255));
        labelAddress.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel11.add(labelAddress, gridBagConstraints);

        jScrollPane2.setBorder(null);

        ProfileAddress.setBackground(new java.awt.Color(51, 51, 51));
        ProfileAddress.setColumns(20);
        ProfileAddress.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfileAddress.setForeground(new java.awt.Color(255, 255, 255));
        ProfileAddress.setRows(5);
        ProfileAddress.setText("Address");
        ProfileAddress.setWrapStyleWord(true);
        ProfileAddress.setBorder(null);
        jScrollPane2.setViewportView(ProfileAddress);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel11.add(jScrollPane2, gridBagConstraints);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridBagLayout());

        labelSSSNo.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelSSSNo.setForeground(new java.awt.Color(255, 255, 255));
        labelSSSNo.setText("SSS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel12.add(labelSSSNo, gridBagConstraints);

        ProfileSSS.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfileSSS.setForeground(new java.awt.Color(255, 255, 255));
        ProfileSSS.setText("sss no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel12.add(ProfileSSS, gridBagConstraints);

        labelPagibigNo.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelPagibigNo.setForeground(new java.awt.Color(255, 255, 255));
        labelPagibigNo.setText("Pag-ibig");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel12.add(labelPagibigNo, gridBagConstraints);

        ProfilePagIbig.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfilePagIbig.setForeground(new java.awt.Color(255, 255, 255));
        ProfilePagIbig.setText("pag-ibig no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel12.add(ProfilePagIbig, gridBagConstraints);

        labelPhilhealthNo.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelPhilhealthNo.setForeground(new java.awt.Color(255, 255, 255));
        labelPhilhealthNo.setText("Philhealth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel12.add(labelPhilhealthNo, gridBagConstraints);

        ProfilePhilhealth.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfilePhilhealth.setForeground(new java.awt.Color(255, 255, 255));
        ProfilePhilhealth.setText("philhealth no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel12.add(ProfilePhilhealth, gridBagConstraints);

        labelTIN.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        labelTIN.setForeground(new java.awt.Color(255, 255, 255));
        labelTIN.setText("TIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 12);
        jPanel12.add(labelTIN, gridBagConstraints);

        ProfileTinnumber.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ProfileTinnumber.setForeground(new java.awt.Color(255, 255, 255));
        ProfileTinnumber.setText("tin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel12.add(ProfileTinnumber, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPDATE");
        jButton4.setBorderPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(83, 32));
        jButton4.setPreferredSize(new java.awt.Dimension(83, 32));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfileEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel36))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator11))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel42))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel42)
                .addGap(54, 54, 54)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(profileFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProfileEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel1.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        LeavePanel.setBackground(new java.awt.Color(34, 34, 50, 220));
        LeavePanel.setPreferredSize(new java.awt.Dimension(980, 520));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel112.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Leave Type");

        LeavePanelLeaveSelector.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelLeaveSelector.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelLeaveSelector.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelLeaveSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Leave Type", "Vacation Leave", "Sick Leave", "Emergency Leave" }));
        LeavePanelLeaveSelector.setBorder(null);
        LeavePanelLeaveSelector.setName("Choose the Type of Leave"); // NOI18N
        LeavePanelLeaveSelector.setOpaque(true);
        LeavePanelLeaveSelector.setPreferredSize(new java.awt.Dimension(290, 28));

        jLabel113.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Reason");

        LeavePanelStartDate.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelStartDate.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelStartDate.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelStartDate.setMinSelectableDate(new java.util.Date(-62135794718000L));
        LeavePanelStartDate.setPreferredSize(new java.awt.Dimension(290, 28));

        LeavePanelReason.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelReason.setColumns(20);
        LeavePanelReason.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelReason.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelReason.setRows(5);
        LeavePanelReason.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));

        jLabel114.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Start Date");

        LeavePanelSubmitButton.setBackground(new java.awt.Color(255, 153, 0));
        LeavePanelSubmitButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LeavePanelSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelSubmitButton.setText("SUBMIT");
        LeavePanelSubmitButton.setBorderPainted(false);
        LeavePanelSubmitButton.setMaximumSize(new java.awt.Dimension(100, 36));
        LeavePanelSubmitButton.setPreferredSize(new java.awt.Dimension(100, 36));
        LeavePanelSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeavePanelSubmitButtonActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Leave Request");

        LeavePanelEndDate.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelEndDate.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelEndDate.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelEndDate.setMinSelectableDate(new java.util.Date(-62135794718000L));
        LeavePanelEndDate.setPreferredSize(new java.awt.Dimension(290, 28));

        jLabel119.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("End Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel115))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel112))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel113))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel114))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel119)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel115)
                .addGap(18, 18, 18)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel114)
                .addGap(10, 10, 10)
                .addComponent(LeavePanelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel119)
                .addGap(10, 10, 10)
                .addComponent(LeavePanelEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Vacation Leave");
        jPanel3.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel120.setFont(new java.awt.Font("Poppins", 1, 50)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 153, 0));
        jLabel120.setText("15");
        jPanel3.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel117.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Sick Leave");
        jPanel3.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel122.setFont(new java.awt.Font("Poppins", 1, 50)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 153, 0));
        jLabel122.setText("14");
        jPanel3.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel118.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("Leave Balance");
        jPanel3.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        javax.swing.GroupLayout LeavePanelLayout = new javax.swing.GroupLayout(LeavePanel);
        LeavePanel.setLayout(LeavePanelLayout);
        LeavePanelLayout.setHorizontalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        LeavePanelLayout.setVerticalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(LeavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

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

        for (EmployeeRecords employee : employees) {
            System.out.println("Employee ID from record: " + employee.getEmpNo());
            if (employee.getEmpNo() == Integer.parseInt(empID)) {
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
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            PayPeriod payperiod = new PayPeriod("10001", dateFormat.parse("09/01/2022"), dateFormat.parse("9/14/2022"), "");
            String empID = MainDashboardempNo.getText();
            Benefit benefit = new Benefit();
            Earning earning = new Earning();
            Deduction deduction = new Deduction();
            boolean accessGranted = false;

        for (EmployeeRecords employee : employees) 
        for (AttendanceRecord att : attendance) {
            if (att.getEmpID() == Integer.parseInt(empID))
                if (employee.getEmpNo() == Integer.parseInt(empID)) {
                accessGranted = true;
                
                //Payslip information
                payslipNumber.setText(payperiod.getPayslipNo());
                payslipEmployeeNumber.setText(String.valueOf(employee.getEmpNo()));
                payslipEmployeeName.setText(employee.getFirstName() + " " + employee.getLastName());
                payslipStartDate.setText(dateFormat.format(payperiod.getStartDate()));
                payslipEndDate.setText(dateFormat.format(payperiod.getEndDate()));
                payslipPosition.setText(employee.getPosition());
                
                //Earnings
                payslipMonthlyRate.setText(String.valueOf("Php" + " " +employee.getBasicSalary()));
                payslipDailyRate.setText(String.valueOf("Php" + " " + earning.dailyRate(employee)));
                payslipOvertime.setText(String.valueOf("Php" + " " +earning.overTime(employee, payperiod)));
                payslipDaysWorked.setText(String.valueOf(earning.daysWorked(payperiod) + " " + "Days"));
                payslipGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.GrossSalary(employee, payperiod))));
                
                //Benefits
                payslipRiceAllowance.setText("Php" + " " + employee.getFormattedDouble(employee.getRiceSubsidy()));
                payslipPhoneAllowance.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(employee.getPhoneAllowance())));
                payslipClothingAllowance.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(employee.getClothingAllowance())));
                payslipBenefitTotal.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(benefit.getTotalBenefits(employee))));

                //Deductions
                payslipSSS.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculateSssContribution(employee))));
                payslipPhilhealth.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculatePhilhealthContribution(employee))));
                payslipPagibig.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculatePagibigContribution(employee))));
                payslipTax.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculateTax(employee))));
                payslipDeductionTotal.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.totalDeduction(employee))));
                
                
               //Summary
               
               double takehomepay = earning.GrossSalary(employee, payperiod)+ benefit.getTotalBenefits(employee)+ deduction.totalDeduction(employee);
               
               summaryGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.GrossSalary(employee, payperiod))));
               summaryBenefits.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(benefit.getTotalBenefits(employee))));
               summaryTotalDeduction.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.totalDeduction(employee))));
               summaryTakeHomePay.setText("Php" + " " + String.valueOf(takehomepay));
                
                break; // No need to continue the loop if access is granted
            }
        }

        if (accessGranted) {
            
            for (AttendanceRecord att : attendance)  
            for (EmployeeRecords employee : employees) {
            
            //Hide other panels
            TimeKeeping_MainDashboard.setVisible(false);
            PayrollHealth_MainDashboard.setVisible(false);
            EmployeeRecords_MainDashboard.setVisible(false);
            Request_MainDashboard.setVisible(false);
            PayslipPanel.setVisible(true);
            ProfilePanel.setVisible(false);
            AttendancePanel.setVisible(false);
            LeavePanel.setVisible(false);
            }
            
        } else {
            // Handle cases where access is not granted
        }
    } catch (ParseException e) {
        e.printStackTrace();
        // Handle ParseException (e.g., display an error message)
    }
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
            // Show a confirmation dialog
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to punch out?", "Punch Out Confirmation", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                String timeOut = att.punchOut(); // Record time out
                if (timeOut != null) {
                    TimeOutLabel.setText(att.formatTime(timeOut)); // Display time out
                    att.writeToCSV(TimeInLabel.getText().toString(), TimeOutLabel.getText().toString()); // Write to CSV
                    JOptionPane.showMessageDialog(this, "Punch Out successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    PunchOut.setEnabled(false);
                    PunchIn.setEnabled(true);
                } else {
                    // Handle the case when timeOut is null
                    System.out.println("Error: Time out is null.");
                }
            } else {
                // User canceled the punch out, do nothing
            }
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        break; // Exit the loop once the employee ID is found
    }
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
                    String timeIn = att.punchIn(); // Record time in
                    if (timeIn != null) {
                        TimeInLabel.setText(att.formatTime(timeIn)); // Display time in
                        PunchIn.setEnabled(false);
                        PunchOut.setEnabled(true);
                        JOptionPane.showMessageDialog(this, "Punch in successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
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

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        jLabel6.setText("Dashboard");
    }//GEN-LAST:event_HomeMouseClicked

    private void AttendanceMainDashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendanceMainDashboardButtonMouseClicked
        // TODO add your handling code here:
        jLabel6.setText("Attendance Records");
    }//GEN-LAST:event_AttendanceMainDashboardButtonMouseClicked

    private void LeaveMainDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveMainDashboardMouseClicked
        // TODO add your handling code here:
        jLabel6.setText("Leave Application");
    }//GEN-LAST:event_LeaveMainDashboardMouseClicked

    private void PayslipMaindashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayslipMaindashboardMouseClicked
        // TODO add your handling code here:
        jLabel6.setText("Payslip");
    }//GEN-LAST:event_PayslipMaindashboardMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LeavePanelSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeavePanelSubmitButtonActionPerformed
        // TODO add your handling code here:
        Request request = new Request();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
              
            Date startDate = LeavePanelStartDate.getDate();
            Date endDate = LeavePanelEndDate.getDate();
            String empID = MainDashboardempNo.getText();
            String startdateFiled = dateFormat.format(startDate);
            String enddateFiled = dateFormat.format(endDate);
            String leaveType = LeavePanelLeaveSelector.getSelectedItem().toString();
            String reason = LeavePanelReason.getText();

            if (startDate.compareTo(endDate) >= 0) {
                JOptionPane.showMessageDialog(this, "End date should be greater than Start Date");
          } else {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Submit Request Form?", "Leave Request Confirmation", JOptionPane.YES_NO_OPTION);

    if (dialogResult == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Submitted Successfully");
        request.LeaveRequestwriteToCSV(empID, startdateFiled, enddateFiled, reason);
        
        
    }
}

System.out.println("EmployeeID " + empID);
System.out.println("LeaveType " + leaveType);
System.out.println("startDate " + startdateFiled);
System.out.println("endDate " + enddateFiled);
System.out.println("Reason " + reason);
    }//GEN-LAST:event_LeavePanelSubmitButtonActionPerformed

    
    

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
    private com.toedter.calendar.JDateChooser LeavePanelEndDate;
    private javax.swing.JComboBox<String> LeavePanelLeaveSelector;
    private javax.swing.JTextArea LeavePanelReason;
    private com.toedter.calendar.JDateChooser LeavePanelStartDate;
    private javax.swing.JButton LeavePanelSubmitButton;
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBirthdate;
    private javax.swing.JLabel labelPagibigNo;
    private javax.swing.JLabel labelPhilhealthNo;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JLabel labelPosition;
    private javax.swing.JLabel labelSSSNo;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTIN;
    private javax.swing.JLabel payslipBenefitTotal;
    private javax.swing.JLabel payslipClothingAllowance;
    private javax.swing.JLabel payslipDailyRate;
    private javax.swing.JLabel payslipDaysWorked;
    private javax.swing.JLabel payslipDeductionTotal;
    private javax.swing.JLabel payslipEmployeeName;
    private javax.swing.JLabel payslipEmployeeNumber;
    private javax.swing.JLabel payslipEndDate;
    private javax.swing.JLabel payslipGrossIncome;
    private javax.swing.JLabel payslipMonthlyRate;
    private javax.swing.JLabel payslipNumber;
    private javax.swing.JLabel payslipOvertime;
    private javax.swing.JLabel payslipPagibig;
    private javax.swing.JLabel payslipPhilhealth;
    private javax.swing.JLabel payslipPhoneAllowance;
    private javax.swing.JLabel payslipPosition;
    private javax.swing.JLabel payslipRiceAllowance;
    private javax.swing.JLabel payslipSSS;
    private javax.swing.JLabel payslipStartDate;
    private javax.swing.JLabel payslipTax;
    private javax.swing.JLabel profileFirstName;
    private javax.swing.JLabel summaryBenefits;
    private javax.swing.JLabel summaryGrossIncome;
    private javax.swing.JLabel summaryTakeHomePay;
    private javax.swing.JLabel summaryTotalDeduction;
    // End of variables declaration//GEN-END:variables

   
}
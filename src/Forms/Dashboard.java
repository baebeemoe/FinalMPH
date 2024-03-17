
package Forms;

import System.Employee.AttendanceRecord;
import System.Employee.EmployeeRecords;
import System.Employee.Benefit;
import System.Employee.Deduction;
import System.Employee.PayPeriod;
import System.Employee.Request;
import System.Employee.Earning;
import System.Employee.PayRate;
import System.Employee.SessionManager;
import System.Employee.User;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private EmployeeRecords[] employees;
    private AttendanceRecord[] attendance;
    private User[] user;
    private PayRate[] pay;
    private PayPeriod payperiod;
    
    public Dashboard() {
        initComponents();
        
        // Load employee records from CSV when the form is initialized
        employees = EmployeeRecords.readEmployeesFromCSV("/Files/EmployeeData.csv");
        attendance = AttendanceRecord.readAttendanceFromCSV("/Files/Attendance.csv");
        user = User.readUserFromCSV("/Files/User.csv");
        pay = PayRate.readPayFromCSV("/Files/PayRate.csv");
    }

    public JLabel getLblPending() {
        return lblPending;
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
    
    public JPanel getPayrollRecords_MainDashboard(){
        return PayrollRecords_MainDashboard;
    }
    
    public JPanel getEmployeeRecords_MainDashboard()
       {
        return EmployeeRecords_MainDashboard;
    }
    
    public JPanel getRequestList_MainDashboard() {
        return RequestList_MainDashboard;
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
  
  public JPanel getPayslipViewPanel()  {
          return PayslipViewPanel;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        otRequestDialog = new javax.swing.JDialog();
        otRequestDlgPnl = new javax.swing.JPanel();
        requestOTLbl = new java.awt.Label();
        otRequestFieldsPnl = new javax.swing.JPanel();
        dateOTRequestLbl = new java.awt.Label();
        datePickerOT = new com.github.lgooddatepicker.components.DatePicker();
        startTimeOTLbl = new java.awt.Label();
        startTimePickerOT = new com.github.lgooddatepicker.components.TimePicker();
        endTimeOTLbl = new java.awt.Label();
        endTimePickerOT = new com.github.lgooddatepicker.components.TimePicker();
        reasonOTRequestLbl = new java.awt.Label();
        reasonTextOT = new java.awt.TextArea();
        cancelBtnOT = new javax.swing.JButton();
        submitBtnOT = new javax.swing.JButton();
        changePassDialog = new javax.swing.JDialog();
        changePassPnl = new javax.swing.JPanel();
        requestOTLbl1 = new java.awt.Label();
        changePassFieldsPnl = new javax.swing.JPanel();
        newPassLbl = new java.awt.Label();
        tfNewPass = new javax.swing.JPasswordField();
        confirmPassLbl = new java.awt.Label();
        tfConfirmPass = new javax.swing.JPasswordField();
        cancelPassBtn = new javax.swing.JButton();
        updatePassBtn = new javax.swing.JButton();
        leaveReqDialog = new javax.swing.JDialog();
        leaveReqFormPnl = new javax.swing.JPanel();
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
        cancelLeaveReqBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        AttendancePanel = new javax.swing.JPanel();
        attTabbedPane = new javax.swing.JTabbedPane();
        attListPanel = new javax.swing.JPanel();
        attScrollPane = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        otPanel = new javax.swing.JPanel();
        otScrollPane = new javax.swing.JScrollPane();
        otRequestTable = new javax.swing.JTable();
        requestOvertimeBtn = new javax.swing.JButton();
        PayslipPanel = new javax.swing.JPanel();
        PayslipViewPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        payPanelEmpInfo = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        payslipNumber = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        payslipStartDate = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        payslipEmployeeNumber = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        payslipEndDate = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        payslipEmployeeName = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        payslipPosition = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        payPanelEarnings = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        payslipMonthlyRate = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        payslipDailyRate = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        payslipDaysWorked = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        payslipOvertime = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        payslipGrossIncome = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        payPanelBenefits = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        payslipRiceAllowance = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        payslipPhoneAllowance = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        payslipClothingAllowance = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        payslipBenefitTotal = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        payslipSSS = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        payslipPhilhealth = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        payslipPagibig = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        payslipTax = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        payslipDeductionTotal = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        summaryGrossIncome = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        summaryBenefits = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        summaryTotalDeduction = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        summaryTakeHomePay = new javax.swing.JLabel();
        PayslipListPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cutoffSelector = new javax.swing.JComboBox<>();
        viewPayslipButton = new javax.swing.JButton();
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
        jLabel10 = new javax.swing.JLabel();
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
        TimeButton = new javax.swing.JToggleButton();
        PayrollHealth_MainDashboard = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        NoOfDaysPresent = new javax.swing.JLabel();
        NoOfDaysPresent1 = new javax.swing.JLabel();
        NoOfDaysPresent2 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        EmployeeRecords_MainDashboard = new javax.swing.JPanel();
        hrsBtn = new javax.swing.JButton();
        Request_MainDashboard = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        lblPending = new javax.swing.JLabel();
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
        profileInnerPnl = new javax.swing.JPanel();
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
        changePassBtn = new javax.swing.JButton();
        LeavePanel = new javax.swing.JPanel();
        leaveBalPnl = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        leaveReqHistoryPnl = new javax.swing.JPanel();
        leaveReqHistoryLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        leaveReqTbl = new javax.swing.JTable();
        reqLeaveBtn = new javax.swing.JButton();
        PayrollRecords_MainDashboard = new javax.swing.JPanel();
        payrollBtn = new javax.swing.JButton();
        RequestList_MainDashboard = new javax.swing.JPanel();
        requestListBtn = new javax.swing.JButton();
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

        otRequestDialog.setTitle("Overtime Request");
        otRequestDialog.setBackground(new java.awt.Color(51, 51, 51));
        otRequestDialog.setBounds(new java.awt.Rectangle(0, 0, 400, 360));
        otRequestDialog.setMinimumSize(new java.awt.Dimension(400, 320));
        otRequestDialog.setUndecorated(true);
        otRequestDialog.setResizable(false);
        otRequestDialog.setSize(new java.awt.Dimension(450, 340));

        otRequestDlgPnl.setBackground(new java.awt.Color(51, 51, 51));
        otRequestDlgPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        otRequestDlgPnl.setPreferredSize(new java.awt.Dimension(450, 320));
        otRequestDlgPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestOTLbl.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        requestOTLbl.setForeground(new java.awt.Color(255, 255, 255));
        requestOTLbl.setName(""); // NOI18N
        requestOTLbl.setText("Request Overtime");
        otRequestDlgPnl.add(requestOTLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        otRequestFieldsPnl.setBackground(new java.awt.Color(51, 51, 51));
        otRequestFieldsPnl.setLayout(new java.awt.GridBagLayout());

        dateOTRequestLbl.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        dateOTRequestLbl.setForeground(new java.awt.Color(255, 255, 255));
        dateOTRequestLbl.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(dateOTRequestLbl, gridBagConstraints);

        datePickerOT.setBackground(new java.awt.Color(51, 51, 51));
        datePickerOT.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(datePickerOT, gridBagConstraints);

        startTimeOTLbl.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        startTimeOTLbl.setForeground(new java.awt.Color(255, 255, 255));
        startTimeOTLbl.setText("Start Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(startTimeOTLbl, gridBagConstraints);

        startTimePickerOT.setBackground(new java.awt.Color(51, 51, 51));
        startTimePickerOT.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(startTimePickerOT, gridBagConstraints);

        endTimeOTLbl.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        endTimeOTLbl.setForeground(new java.awt.Color(255, 255, 255));
        endTimeOTLbl.setText("End Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(endTimeOTLbl, gridBagConstraints);

        endTimePickerOT.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(endTimePickerOT, gridBagConstraints);

        reasonOTRequestLbl.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        reasonOTRequestLbl.setForeground(new java.awt.Color(255, 255, 255));
        reasonOTRequestLbl.setText("Reason");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(reasonOTRequestLbl, gridBagConstraints);

        reasonTextOT.setBackground(new java.awt.Color(51, 51, 51));
        reasonTextOT.setForeground(new java.awt.Color(255, 255, 255));
        reasonTextOT.setPreferredSize(new java.awt.Dimension(160, 80));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        otRequestFieldsPnl.add(reasonTextOT, gridBagConstraints);

        otRequestDlgPnl.add(otRequestFieldsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cancelBtnOT.setText("CANCEL");
        cancelBtnOT.setBackground(new java.awt.Color(51, 51, 51));
        cancelBtnOT.setBorderPainted(false);
        cancelBtnOT.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        cancelBtnOT.setForeground(new java.awt.Color(255, 102, 0));
        cancelBtnOT.setOpaque(true);
        cancelBtnOT.setPreferredSize(new java.awt.Dimension(180, 36));
        cancelBtnOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnOTActionPerformed(evt);
            }
        });
        otRequestDlgPnl.add(cancelBtnOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 84, -1));

        submitBtnOT.setText("SUBMIT");
        submitBtnOT.setBackground(new java.awt.Color(255, 153, 0));
        submitBtnOT.setBorderPainted(false);
        submitBtnOT.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        submitBtnOT.setForeground(new java.awt.Color(255, 255, 255));
        submitBtnOT.setPreferredSize(new java.awt.Dimension(180, 36));
        submitBtnOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnOTActionPerformed(evt);
            }
        });
        otRequestDlgPnl.add(submitBtnOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 84, -1));

        javax.swing.GroupLayout otRequestDialogLayout = new javax.swing.GroupLayout(otRequestDialog.getContentPane());
        otRequestDialog.getContentPane().setLayout(otRequestDialogLayout);
        otRequestDialogLayout.setHorizontalGroup(
            otRequestDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otRequestDlgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        otRequestDialogLayout.setVerticalGroup(
            otRequestDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otRequestDlgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        changePassDialog.setTitle("Change Password");
        changePassDialog.setBackground(new java.awt.Color(51, 51, 51));
        changePassDialog.setBounds(new java.awt.Rectangle(0, 0, 400, 360));
        changePassDialog.setMinimumSize(new java.awt.Dimension(386, 205));
        changePassDialog.setUndecorated(true);
        changePassDialog.setResizable(false);
        changePassDialog.setSize(new java.awt.Dimension(386, 205));

        changePassPnl.setBackground(new java.awt.Color(51, 51, 51));
        changePassPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        changePassPnl.setPreferredSize(new java.awt.Dimension(450, 320));
        changePassPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestOTLbl1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        requestOTLbl1.setForeground(new java.awt.Color(255, 255, 255));
        requestOTLbl1.setName(""); // NOI18N
        requestOTLbl1.setText("Change Password");
        changePassPnl.add(requestOTLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        changePassFieldsPnl.setBackground(new java.awt.Color(51, 51, 51));
        changePassFieldsPnl.setLayout(new java.awt.GridBagLayout());

        newPassLbl.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        newPassLbl.setForeground(new java.awt.Color(255, 255, 255));
        newPassLbl.setText("New Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        changePassFieldsPnl.add(newPassLbl, gridBagConstraints);

        tfNewPass.setPreferredSize(new java.awt.Dimension(180, 22));
        changePassFieldsPnl.add(tfNewPass, new java.awt.GridBagConstraints());

        confirmPassLbl.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        confirmPassLbl.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassLbl.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        changePassFieldsPnl.add(confirmPassLbl, gridBagConstraints);

        tfConfirmPass.setPreferredSize(new java.awt.Dimension(180, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        changePassFieldsPnl.add(tfConfirmPass, gridBagConstraints);

        changePassPnl.add(changePassFieldsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cancelPassBtn.setText("CANCEL");
        cancelPassBtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelPassBtn.setBorderPainted(false);
        cancelPassBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        cancelPassBtn.setForeground(new java.awt.Color(255, 102, 0));
        cancelPassBtn.setOpaque(true);
        cancelPassBtn.setPreferredSize(new java.awt.Dimension(180, 36));
        cancelPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPassBtnActionPerformed(evt);
            }
        });
        changePassPnl.add(cancelPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 84, -1));

        updatePassBtn.setText("UPDATE PASSWORD");
        updatePassBtn.setBackground(new java.awt.Color(255, 153, 0));
        updatePassBtn.setBorderPainted(false);
        updatePassBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        updatePassBtn.setForeground(new java.awt.Color(255, 255, 255));
        updatePassBtn.setPreferredSize(new java.awt.Dimension(180, 36));
        updatePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePassBtnActionPerformed(evt);
            }
        });
        changePassPnl.add(updatePassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, -1));

        javax.swing.GroupLayout changePassDialogLayout = new javax.swing.GroupLayout(changePassDialog.getContentPane());
        changePassDialog.getContentPane().setLayout(changePassDialogLayout);
        changePassDialogLayout.setHorizontalGroup(
            changePassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changePassPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        changePassDialogLayout.setVerticalGroup(
            changePassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changePassPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        leaveReqDialog.setTitle("Leave Request");
        leaveReqDialog.setMinimumSize(new java.awt.Dimension(360, 520));
        leaveReqDialog.setUndecorated(true);

        leaveReqFormPnl.setBackground(new java.awt.Color(51, 51, 51));
        leaveReqFormPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        leaveReqFormPnl.setPreferredSize(new java.awt.Dimension(340, 515));

        jLabel112.setText("Leave Type");
        jLabel112.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));

        LeavePanelLeaveSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Leave Type", "Vacation Leave", "Sick Leave", "Emergency Leave" }));
        LeavePanelLeaveSelector.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelLeaveSelector.setBorder(null);
        LeavePanelLeaveSelector.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelLeaveSelector.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelLeaveSelector.setName("Choose the Type of Leave"); // NOI18N
        LeavePanelLeaveSelector.setOpaque(true);
        LeavePanelLeaveSelector.setPreferredSize(new java.awt.Dimension(290, 28));

        jLabel113.setText("Reason");
        jLabel113.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));

        LeavePanelStartDate.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelStartDate.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelStartDate.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelStartDate.setMinSelectableDate(new java.util.Date(-62135794718000L));
        LeavePanelStartDate.setPreferredSize(new java.awt.Dimension(290, 28));

        LeavePanelReason.setColumns(20);
        LeavePanelReason.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelReason.setRows(5);
        LeavePanelReason.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelReason.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        LeavePanelReason.setForeground(new java.awt.Color(255, 255, 255));

        jLabel114.setText("Start Date");
        jLabel114.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));

        LeavePanelSubmitButton.setText("SUBMIT");
        LeavePanelSubmitButton.setBackground(new java.awt.Color(255, 153, 0));
        LeavePanelSubmitButton.setBorderPainted(false);
        LeavePanelSubmitButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LeavePanelSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelSubmitButton.setMaximumSize(new java.awt.Dimension(100, 36));
        LeavePanelSubmitButton.setPreferredSize(new java.awt.Dimension(100, 36));
        LeavePanelSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeavePanelSubmitButtonActionPerformed(evt);
            }
        });

        jLabel115.setText("Leave Request");
        jLabel115.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));

        LeavePanelEndDate.setBackground(new java.awt.Color(102, 102, 102));
        LeavePanelEndDate.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeavePanelEndDate.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelEndDate.setMinSelectableDate(new java.util.Date(-62135794718000L));
        LeavePanelEndDate.setPreferredSize(new java.awt.Dimension(290, 28));

        jLabel119.setText("End Date");
        jLabel119.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));

        cancelLeaveReqBtn.setText("CANCEL");
        cancelLeaveReqBtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelLeaveReqBtn.setBorderPainted(false);
        cancelLeaveReqBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        cancelLeaveReqBtn.setForeground(new java.awt.Color(255, 102, 0));
        cancelLeaveReqBtn.setOpaque(true);
        cancelLeaveReqBtn.setPreferredSize(new java.awt.Dimension(180, 36));
        cancelLeaveReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelLeaveReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leaveReqFormPnlLayout = new javax.swing.GroupLayout(leaveReqFormPnl);
        leaveReqFormPnl.setLayout(leaveReqFormPnlLayout);
        leaveReqFormPnlLayout.setHorizontalGroup(
            leaveReqFormPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                .addGroup(leaveReqFormPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel115))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel112))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LeavePanelEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel113))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel114))
                    .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel119))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, leaveReqFormPnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelLeaveReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        leaveReqFormPnlLayout.setVerticalGroup(
            leaveReqFormPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveReqFormPnlLayout.createSequentialGroup()
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
                .addGroup(leaveReqFormPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelLeaveReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leaveReqDialogLayout = new javax.swing.GroupLayout(leaveReqDialog.getContentPane());
        leaveReqDialog.getContentPane().setLayout(leaveReqDialogLayout);
        leaveReqDialogLayout.setHorizontalGroup(
            leaveReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(leaveReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leaveReqFormPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );
        leaveReqDialogLayout.setVerticalGroup(
            leaveReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(leaveReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leaveReqFormPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AttendancePanel.setBackground(new java.awt.Color(34, 34, 50));
        AttendancePanel.setPreferredSize(new java.awt.Dimension(980, 520));
        AttendancePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        attTabbedPane.setBackground(new java.awt.Color(51, 51, 51));
        attTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        attTabbedPane.setOpaque(true);

        attendanceTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Time In", "Time Out", "Overtime"
            }
        ));
        attendanceTable.setBackground(new java.awt.Color(255, 255, 255));
        attendanceTable.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        attendanceTable.setForeground(new java.awt.Color(0, 0, 0));
        attendanceTable.setGridColor(new java.awt.Color(153, 153, 153));
        attendanceTable.setName(""); // NOI18N
        attendanceTable.setOpaque(false);
        attendanceTable.getTableHeader().setReorderingAllowed(false);
        attScrollPane.setViewportView(attendanceTable);

        javax.swing.GroupLayout attListPanelLayout = new javax.swing.GroupLayout(attListPanel);
        attListPanel.setLayout(attListPanelLayout);
        attListPanelLayout.setHorizontalGroup(
            attListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attListPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(attScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        attListPanelLayout.setVerticalGroup(
            attListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attListPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(attScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        attTabbedPane.addTab("Attendance", attListPanel);

        otRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Start Time", "End Time", "Reason", "Status"
            }
        ));
        otScrollPane.setViewportView(otRequestTable);

        requestOvertimeBtn.setText("REQUEST OVERTIME");
        requestOvertimeBtn.setBackground(new java.awt.Color(255, 153, 0));
        requestOvertimeBtn.setBorderPainted(false);
        requestOvertimeBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        requestOvertimeBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestOvertimeBtn.setPreferredSize(new java.awt.Dimension(180, 36));
        requestOvertimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestOvertimeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout otPanelLayout = new javax.swing.GroupLayout(otPanel);
        otPanel.setLayout(otPanelLayout);
        otPanelLayout.setHorizontalGroup(
            otPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(otPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestOvertimeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        otPanelLayout.setVerticalGroup(
            otPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otPanelLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(otScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requestOvertimeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        attTabbedPane.addTab("Overtime Request", otPanel);

        AttendancePanel.add(attTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        MainPanel.add(AttendancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        PayslipPanel.setBackground(new java.awt.Color(51, 51, 51));
        PayslipPanel.setPreferredSize(new java.awt.Dimension(980, 560));

        PayslipViewPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setText("MotorPH");
        jLabel33.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N

        jLabel34.setText(" 7 Jupiter Avenue cor. F. Sandoval Jr., Bagong Nayon, Quezon City");
        jLabel34.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N

        jLabel35.setText("Phone: (028) 911-5071 / (028) 911-5072 / (028) 911-5073 ");
        jLabel35.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N

        jLabel57.setText(" Email: corporate@motorph.com\t\t\t");
        jLabel57.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("EARNINGS");
        jLabel73.setBackground(new java.awt.Color(102, 102, 102));
        jLabel73.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setOpaque(true);
        jLabel73.setPreferredSize(new java.awt.Dimension(460, 20));

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("EMPLOYEE PAYSLIP");
        jLabel58.setBackground(new java.awt.Color(51, 51, 51));
        jLabel58.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel58.setOpaque(true);
        jLabel58.setPreferredSize(new java.awt.Dimension(460, 24));

        payPanelEmpInfo.setBackground(new java.awt.Color(255, 255, 255));
        payPanelEmpInfo.setLayout(new java.awt.GridBagLayout());

        jLabel59.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel59.setText("PAYSLIP NO");
        jLabel59.setPreferredSize(new java.awt.Dimension(84, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(jLabel59, gridBagConstraints);

        payslipNumber.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipNumber.setText("00001");
        payslipNumber.setMaximumSize(new java.awt.Dimension(64, 16));
        payslipNumber.setPreferredSize(new java.awt.Dimension(64, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(payslipNumber, gridBagConstraints);

        jLabel67.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel67.setText("START DATE");
        jLabel67.setPreferredSize(new java.awt.Dimension(60, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(jLabel67, gridBagConstraints);

        payslipStartDate.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipStartDate.setText("02/01/2024");
        payslipStartDate.setPreferredSize(new java.awt.Dimension(0, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(payslipStartDate, gridBagConstraints);

        jLabel60.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel60.setText("EMPLOYEE ID");
        jLabel60.setPreferredSize(new java.awt.Dimension(84, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(jLabel60, gridBagConstraints);

        payslipEmployeeNumber.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipEmployeeNumber.setText("EMPLOYEE ID");
        payslipEmployeeNumber.setMaximumSize(new java.awt.Dimension(64, 16));
        payslipEmployeeNumber.setPreferredSize(new java.awt.Dimension(64, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(payslipEmployeeNumber, gridBagConstraints);

        jLabel65.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel65.setText("END DATE");
        jLabel65.setPreferredSize(new java.awt.Dimension(60, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(jLabel65, gridBagConstraints);

        payslipEndDate.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipEndDate.setText("02/15/2024");
        payslipEndDate.setPreferredSize(new java.awt.Dimension(0, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(payslipEndDate, gridBagConstraints);

        jLabel61.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel61.setText("EMPLOYEE NAME");
        jLabel61.setPreferredSize(new java.awt.Dimension(84, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(jLabel61, gridBagConstraints);

        payslipEmployeeName.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipEmployeeName.setText("EMPLOYEE NAME");
        payslipEmployeeName.setMaximumSize(new java.awt.Dimension(64, 16));
        payslipEmployeeName.setMinimumSize(new java.awt.Dimension(64, 16));
        payslipEmployeeName.setPreferredSize(new java.awt.Dimension(64, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(payslipEmployeeName, gridBagConstraints);

        jLabel66.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel66.setText("POSITION");
        jLabel66.setPreferredSize(new java.awt.Dimension(48, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(jLabel66, gridBagConstraints);

        payslipPosition.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        payslipPosition.setText("Position of Employee");
        payslipPosition.setMaximumSize(new java.awt.Dimension(60, 14));
        payslipPosition.setMinimumSize(new java.awt.Dimension(120, 14));
        payslipPosition.setPreferredSize(new java.awt.Dimension(120, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        payPanelEmpInfo.add(payslipPosition, gridBagConstraints);

        jSeparator12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jSeparator12.setOpaque(true);

        payPanelEarnings.setBackground(new java.awt.Color(255, 255, 255));
        payPanelEarnings.setLayout(new java.awt.GridLayout(5, 2, 4, 4));

        jLabel74.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel74.setText("Monthly Rate");
        payPanelEarnings.add(jLabel74);

        payslipMonthlyRate.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipMonthlyRate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipMonthlyRate.setText("PAYSLIP NO");
        payPanelEarnings.add(payslipMonthlyRate);

        jLabel76.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel76.setText("Daily Rate");
        payPanelEarnings.add(jLabel76);

        payslipDailyRate.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipDailyRate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipDailyRate.setText("PAYSLIP NO");
        payPanelEarnings.add(payslipDailyRate);

        jLabel79.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel79.setText("Days Worked");
        payPanelEarnings.add(jLabel79);

        payslipDaysWorked.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipDaysWorked.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipDaysWorked.setText("PAYSLIP NO");
        payPanelEarnings.add(payslipDaysWorked);

        jLabel81.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel81.setText("Overtime");
        payPanelEarnings.add(jLabel81);

        payslipOvertime.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipOvertime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipOvertime.setText("PAYSLIP NO");
        payPanelEarnings.add(payslipOvertime);

        jLabel109.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel109.setText("GROSS INCOME");
        payPanelEarnings.add(jLabel109);

        payslipGrossIncome.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipGrossIncome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipGrossIncome.setText("PAYSLIP NO");
        payPanelEarnings.add(payslipGrossIncome);

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("BENEFITS");
        jLabel75.setBackground(new java.awt.Color(102, 102, 102));
        jLabel75.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setOpaque(true);
        jLabel75.setPreferredSize(new java.awt.Dimension(460, 20));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("DEDUCTIONS");
        jLabel77.setBackground(new java.awt.Color(102, 102, 102));
        jLabel77.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setOpaque(true);
        jLabel77.setPreferredSize(new java.awt.Dimension(460, 20));

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("SUMMARY");
        jLabel78.setBackground(new java.awt.Color(102, 102, 102));
        jLabel78.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setOpaque(true);
        jLabel78.setPreferredSize(new java.awt.Dimension(460, 20));

        payPanelBenefits.setBackground(new java.awt.Color(255, 255, 255));
        payPanelBenefits.setLayout(new java.awt.GridLayout(4, 2, 4, 4));

        jLabel83.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel83.setText("Rice Subsidy");
        payPanelBenefits.add(jLabel83);

        payslipRiceAllowance.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipRiceAllowance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipRiceAllowance.setText("PAYSLIP NO");
        payPanelBenefits.add(payslipRiceAllowance);

        jLabel85.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel85.setText("Phone Allowance");
        payPanelBenefits.add(jLabel85);

        payslipPhoneAllowance.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipPhoneAllowance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipPhoneAllowance.setText("PAYSLIP NO");
        payPanelBenefits.add(payslipPhoneAllowance);

        jLabel87.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel87.setText("Clothing Allowance");
        payPanelBenefits.add(jLabel87);

        payslipClothingAllowance.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipClothingAllowance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipClothingAllowance.setText("PAYSLIP NO");
        payPanelBenefits.add(payslipClothingAllowance);

        jLabel89.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel89.setText("TOTAL");
        payPanelBenefits.add(jLabel89);

        payslipBenefitTotal.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipBenefitTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipBenefitTotal.setText("PAYSLIP NO");
        payPanelBenefits.add(payslipBenefitTotal);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.GridLayout(5, 2, 4, 4));

        jLabel71.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel71.setText("Social Security System");
        jPanel13.add(jLabel71);

        payslipSSS.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipSSS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipSSS.setText("PAYSLIP NO");
        jPanel13.add(payslipSSS);

        jLabel92.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel92.setText("Philhealth");
        jPanel13.add(jLabel92);

        payslipPhilhealth.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipPhilhealth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipPhilhealth.setText("PAYSLIP NO");
        jPanel13.add(payslipPhilhealth);

        jLabel95.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel95.setText("Pag-Ibig");
        jPanel13.add(jLabel95);

        payslipPagibig.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipPagibig.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipPagibig.setText("PAYSLIP NO");
        jPanel13.add(payslipPagibig);

        jLabel97.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel97.setText("Withholding Tax");
        jPanel13.add(jLabel97);

        payslipTax.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipTax.setText("PAYSLIP NO");
        jPanel13.add(payslipTax);

        jLabel98.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel98.setText("TOTAL DEDUCTIONS");
        jPanel13.add(jLabel98);

        payslipDeductionTotal.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        payslipDeductionTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        payslipDeductionTotal.setText("PAYSLIP NO");
        jPanel13.add(payslipDeductionTotal);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.GridLayout(4, 2, 4, 4));

        jLabel101.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel101.setText("Gross Income");
        jPanel14.add(jLabel101);

        summaryGrossIncome.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        summaryGrossIncome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        summaryGrossIncome.setText("PAYSLIP NO");
        jPanel14.add(summaryGrossIncome);

        jLabel104.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel104.setText("Benefits");
        jPanel14.add(jLabel104);

        summaryBenefits.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        summaryBenefits.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        summaryBenefits.setText("PAYSLIP NO");
        jPanel14.add(summaryBenefits);

        jLabel105.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel105.setText("Total Deducations");
        jPanel14.add(jLabel105);

        summaryTotalDeduction.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        summaryTotalDeduction.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        summaryTotalDeduction.setText("PAYSLIP NO");
        jPanel14.add(summaryTotalDeduction);

        jLabel107.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel107.setText("TAKE HOME PAY");
        jPanel14.add(jLabel107);

        summaryTakeHomePay.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        summaryTakeHomePay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        summaryTakeHomePay.setText("PAYSLIP NO");
        jPanel14.add(summaryTakeHomePay);

        javax.swing.GroupLayout PayslipViewPanelLayout = new javax.swing.GroupLayout(PayslipViewPanel);
        PayslipViewPanel.setLayout(PayslipViewPanelLayout);
        PayslipViewPanelLayout.setHorizontalGroup(
            PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                        .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                                .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel57)))
                                    .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(payPanelEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipViewPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(payPanelEmpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payPanelBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PayslipViewPanelLayout.setVerticalGroup(
            PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PayslipViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(payPanelEmpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(payPanelEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PayslipViewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(payPanelBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PayslipListPanel.setOpaque(false);
        PayslipListPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Cut off Dates");
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        PayslipListPanel.add(jLabel1, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Action");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 4);
        PayslipListPanel.add(jLabel15, gridBagConstraints);

        cutoffSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "03/01/2024 - 03/15/2024", "02/16/2024 - 02/29/2024", "02/01/2024 - 02/15/2024" }));
        cutoffSelector.setBackground(new java.awt.Color(102, 102, 102));
        cutoffSelector.setBorder(null);
        cutoffSelector.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        cutoffSelector.setForeground(new java.awt.Color(255, 255, 255));
        cutoffSelector.setOpaque(true);
        cutoffSelector.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        PayslipListPanel.add(cutoffSelector, gridBagConstraints);

        viewPayslipButton.setText("VIEW PAYSLIP");
        viewPayslipButton.setBackground(new java.awt.Color(255, 153, 0));
        viewPayslipButton.setBorderPainted(false);
        viewPayslipButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        viewPayslipButton.setForeground(new java.awt.Color(255, 255, 255));
        viewPayslipButton.setPreferredSize(new java.awt.Dimension(120, 28));
        viewPayslipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPayslipButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 4);
        PayslipListPanel.add(viewPayslipButton, gridBagConstraints);

        javax.swing.GroupLayout PayslipPanelLayout = new javax.swing.GroupLayout(PayslipPanel);
        PayslipPanel.setLayout(PayslipPanelLayout);
        PayslipPanelLayout.setHorizontalGroup(
            PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PayslipViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(PayslipPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PayslipListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(622, Short.MAX_VALUE))
        );
        PayslipPanelLayout.setVerticalGroup(
            PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PayslipListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(PayslipViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        MainPanel.add(PayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

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

        MainPanel.add(EmployeeDashboard_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));
        EmployeeDashboard_MainDashboard.getAccessibleContext().setAccessibleDescription("");

        MenuBar_MainDashboard.setBackground(new java.awt.Color(34, 34, 50));
        MenuBar_MainDashboard.setPreferredSize(new java.awt.Dimension(300, 280));

        jPanel5.setOpaque(false);

        jLabel2.setText("Motor");
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIconTextGap(0);

        jLabel3.setText("PH");
        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setIconTextGap(0);

        jLabel4.setText("People Portal");
        jLabel4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

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

        AttendanceMainDashboardButton.setText("Attendance");
        AttendanceMainDashboardButton.setBackground(new java.awt.Color(34, 34, 50));
        AttendanceMainDashboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AttendanceMainDashboardButton.setBorderPainted(false);
        AttendanceMainDashboardButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        AttendanceMainDashboardButton.setForeground(new java.awt.Color(255, 255, 255));
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

        MainPanel.add(MenuBar_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        TimeKeeping_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        TimeKeeping_MainDashboard.setPreferredSize(new java.awt.Dimension(600, 260));

        jLabel10.setText("Time in : ");
        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        TimeInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeInLabel.setBackground(new java.awt.Color(0, 0, 0));
        TimeInLabel.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        TimeInLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeInLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        jLabel56.setText("Time out : ");
        jLabel56.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));

        TimeOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeOutLabel.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        TimeOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeOutLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        jPanel7.setOpaque(false);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-box.png"))); // NOI18N
        jLabel9.setText(" Present");
        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setText("Schedule Status :");
        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("WORK");
        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 0));

        jLabel12.setText("Schedule :");
        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        Shift.setText("03:15AM - 12:15 PM");
        Shift.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Shift.setForeground(new java.awt.Color(255, 255, 255));

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

        jLabel13.setText("Attendance");
        jLabel13.setBackground(new java.awt.Color(0,0,0,0));
        jLabel13.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        TimeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterw24px.png"))); // NOI18N
        TimeButton.setText("Time in");
        TimeButton.setBackground(new java.awt.Color(255, 153, 0));
        TimeButton.setBorderPainted(false);
        TimeButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        TimeButton.setForeground(new java.awt.Color(255, 255, 255));
        TimeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        TimeButton.setIconTextGap(8);
        TimeButton.setPreferredSize(new java.awt.Dimension(110, 52));
        TimeButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitw24px.png"))); // NOI18N
        TimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TimeKeeping_MainDashboardLayout = new javax.swing.GroupLayout(TimeKeeping_MainDashboard);
        TimeKeeping_MainDashboard.setLayout(TimeKeeping_MainDashboardLayout);
        TimeKeeping_MainDashboardLayout.setHorizontalGroup(
            TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13))
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(164, 164, 164)
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TimeKeeping_MainDashboardLayout.setVerticalGroup(
            TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(46, 46, 46))
        );

        MainPanel.add(TimeKeeping_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        PayrollHealth_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        PayrollHealth_MainDashboard.setPreferredSize(new java.awt.Dimension(360, 200));

        jLabel14.setText("Payroll Health");
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 2, true));

        jSeparator7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jSeparator7.setVerifyInputWhenFocusTarget(false);

        jSeparator8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));

        NoOfDaysPresent.setText("0");
        NoOfDaysPresent.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        NoOfDaysPresent.setForeground(new java.awt.Color(255, 255, 255));
        NoOfDaysPresent.setToolTipText("Absences");

        NoOfDaysPresent1.setText("4");
        NoOfDaysPresent1.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        NoOfDaysPresent1.setForeground(new java.awt.Color(255, 255, 255));
        NoOfDaysPresent1.setToolTipText("Days Worked");

        NoOfDaysPresent2.setText("0");
        NoOfDaysPresent2.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        NoOfDaysPresent2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel121.setText("Days Worked");
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));

        jLabel123.setText("Absences");
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));

        jLabel124.setText("Leaves");
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PayrollHealth_MainDashboardLayout = new javax.swing.GroupLayout(PayrollHealth_MainDashboard);
        PayrollHealth_MainDashboard.setLayout(PayrollHealth_MainDashboardLayout);
        PayrollHealth_MainDashboardLayout.setHorizontalGroup(
            PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel14))
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
                            .addComponent(jLabel124))))
                .addGap(34, 86, Short.MAX_VALUE))
        );
        PayrollHealth_MainDashboardLayout.setVerticalGroup(
            PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
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

        MainPanel.add(PayrollHealth_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        EmployeeRecords_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        EmployeeRecords_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeRecords_MainDashboard.setPreferredSize(new java.awt.Dimension(600, 92));

        hrsBtn.setText("Manage Employee Information");
        hrsBtn.setBackground(new java.awt.Color(255, 153, 0));
        hrsBtn.setBorderPainted(false);
        hrsBtn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        hrsBtn.setForeground(new java.awt.Color(255, 255, 255));
        hrsBtn.setMinimumSize(new java.awt.Dimension(200, 28));
        hrsBtn.setOpaque(true);
        hrsBtn.setPreferredSize(new java.awt.Dimension(540, 52));
        hrsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmployeeRecords_MainDashboardLayout = new javax.swing.GroupLayout(EmployeeRecords_MainDashboard);
        EmployeeRecords_MainDashboard.setLayout(EmployeeRecords_MainDashboardLayout);
        EmployeeRecords_MainDashboardLayout.setHorizontalGroup(
            EmployeeRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(hrsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        EmployeeRecords_MainDashboardLayout.setVerticalGroup(
            EmployeeRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hrsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        MainPanel.add(EmployeeRecords_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        Request_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        Request_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        Request_MainDashboard.setPreferredSize(new java.awt.Dimension(360, 240));

        jLabel17.setText("My Requests");
        jLabel17.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(3, 4));

        jLabel23.setText("Leave");
        jLabel23.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel23);

        lblPending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPending.setText("-");
        lblPending.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        lblPending.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(lblPending);

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

        jLabel20.setText("Pending");
        jLabel20.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Approved");
        jLabel21.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setText("Denied");
        jLabel22.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));

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
                    .addComponent(jLabel17)
                    .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 34, Short.MAX_VALUE))
        );
        Request_MainDashboardLayout.setVerticalGroup(
            Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        MainPanel.add(Request_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, -1, -1));

        ProfilePanel.setBackground(new java.awt.Color(34, 34, 50, 220));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(980, 520));

        profileInnerPnl.setBackground(new java.awt.Color(51, 51, 51));
        profileInnerPnl.setForeground(new java.awt.Color(0, 0, 0));
        profileInnerPnl.setPreferredSize(new java.awt.Dimension(936, 463));

        jSeparator10.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator10.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(1, 300));

        profileFirstName.setText("Name");
        profileFirstName.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        profileFirstName.setForeground(new java.awt.Color(255, 255, 255));

        ProfileEmpNo.setText("Employee No.");
        ProfileEmpNo.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ProfileEmpNo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile (1).png"))); // NOI18N

        jSeparator11.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator11.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator11.setOpaque(true);

        jLabel42.setText("My Account Numbers");
        jLabel42.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));

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

        changePassBtn.setText("CHANGE PASSWORD");
        changePassBtn.setBackground(new java.awt.Color(255, 153, 0));
        changePassBtn.setBorderPainted(false);
        changePassBtn.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        changePassBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePassBtn.setMaximumSize(new java.awt.Dimension(83, 32));
        changePassBtn.setPreferredSize(new java.awt.Dimension(180, 32));
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileInnerPnlLayout = new javax.swing.GroupLayout(profileInnerPnl);
        profileInnerPnl.setLayout(profileInnerPnlLayout);
        profileInnerPnlLayout.setHorizontalGroup(
            profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileInnerPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(profileInnerPnlLayout.createSequentialGroup()
                        .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfileEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel36))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator11))
                .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileInnerPnlLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileInnerPnlLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel42))
                            .addGroup(profileInnerPnlLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInnerPnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        profileInnerPnlLayout.setVerticalGroup(
            profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileInnerPnlLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(profileInnerPnlLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(profileInnerPnlLayout.createSequentialGroup()
                            .addGroup(profileInnerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel36)
                                .addGroup(profileInnerPnlLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(profileFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ProfileEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(profileInnerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(profileInnerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        MainPanel.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        LeavePanel.setBackground(new java.awt.Color(34, 34, 50, 220));
        LeavePanel.setPreferredSize(new java.awt.Dimension(980, 550));

        leaveBalPnl.setBackground(new java.awt.Color(51, 51, 51));
        leaveBalPnl.setOpaque(false);
        leaveBalPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setText("Vacation Leave");
        jLabel116.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        leaveBalPnl.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel120.setText("15");
        jLabel120.setFont(new java.awt.Font("Poppins", 1, 50)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 153, 0));
        leaveBalPnl.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel117.setText("Sick Leave");
        jLabel117.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        leaveBalPnl.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel122.setText("14");
        jLabel122.setFont(new java.awt.Font("Poppins", 1, 50)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 153, 0));
        leaveBalPnl.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel118.setText("Leave Balance");
        jLabel118.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        leaveBalPnl.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        leaveReqHistoryPnl.setBackground(new java.awt.Color(51, 51, 51));
        leaveReqHistoryPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leaveReqHistoryLbl.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        leaveReqHistoryLbl.setForeground(new java.awt.Color(255, 255, 255));
        leaveReqHistoryLbl.setText("Leave Request History");
        leaveReqHistoryPnl.add(leaveReqHistoryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        leaveReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date Filed", "Type of Leave", "Start Date", "End Date", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(leaveReqTbl);

        leaveReqHistoryPnl.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 870, 250));

        reqLeaveBtn.setText("REQUEST LEAVE");
        reqLeaveBtn.setBackground(new java.awt.Color(255, 153, 0));
        reqLeaveBtn.setBorderPainted(false);
        reqLeaveBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        reqLeaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        reqLeaveBtn.setPreferredSize(new java.awt.Dimension(180, 36));
        reqLeaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqLeaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeavePanelLayout = new javax.swing.GroupLayout(LeavePanel);
        LeavePanel.setLayout(LeavePanelLayout);
        LeavePanelLayout.setHorizontalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeavePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(leaveReqHistoryPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeavePanelLayout.createSequentialGroup()
                        .addComponent(reqLeaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leaveBalPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        LeavePanelLayout.setVerticalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(leaveReqHistoryPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reqLeaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaveBalPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        MainPanel.add(LeavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        PayrollRecords_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        PayrollRecords_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        PayrollRecords_MainDashboard.setPreferredSize(new java.awt.Dimension(600, 92));

        payrollBtn.setText("Manage Payroll");
        payrollBtn.setBackground(new java.awt.Color(255, 153, 0));
        payrollBtn.setBorderPainted(false);
        payrollBtn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        payrollBtn.setForeground(new java.awt.Color(255, 255, 255));
        payrollBtn.setMinimumSize(new java.awt.Dimension(200, 40));
        payrollBtn.setOpaque(true);
        payrollBtn.setPreferredSize(new java.awt.Dimension(540, 52));
        payrollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PayrollRecords_MainDashboardLayout = new javax.swing.GroupLayout(PayrollRecords_MainDashboard);
        PayrollRecords_MainDashboard.setLayout(PayrollRecords_MainDashboardLayout);
        PayrollRecords_MainDashboardLayout.setHorizontalGroup(
            PayrollRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(payrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PayrollRecords_MainDashboardLayout.setVerticalGroup(
            PayrollRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(payrollBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        MainPanel.add(PayrollRecords_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        RequestList_MainDashboard.setBackground(new java.awt.Color(34, 34, 50, 220));
        RequestList_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        RequestList_MainDashboard.setPreferredSize(new java.awt.Dimension(600, 92));

        requestListBtn.setText("Manage Requests");
        requestListBtn.setBackground(new java.awt.Color(255, 153, 0));
        requestListBtn.setBorderPainted(false);
        requestListBtn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        requestListBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestListBtn.setMinimumSize(new java.awt.Dimension(200, 40));
        requestListBtn.setOpaque(true);
        requestListBtn.setPreferredSize(new java.awt.Dimension(540, 52));
        requestListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestList_MainDashboardLayout = new javax.swing.GroupLayout(RequestList_MainDashboard);
        RequestList_MainDashboard.setLayout(RequestList_MainDashboardLayout);
        RequestList_MainDashboardLayout.setHorizontalGroup(
            RequestList_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestList_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(requestListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        RequestList_MainDashboardLayout.setVerticalGroup(
            RequestList_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestList_MainDashboardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(requestListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        MainPanel.add(RequestList_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main-bg.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Background.setPreferredSize(new java.awt.Dimension(1366, 768));
        MainPanel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1370, 770));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hrsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrsBtnActionPerformed
        // TODO add your handling code here:
        EmployeeHRSDataBase employeeDataBase = new EmployeeHRSDataBase();
        this.setVisible(true);
        employeeDataBase.setVisible(true);
    }//GEN-LAST:event_hrsBtnActionPerformed

    
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
            EmployeeRecords_MainDashboard.setVisible(false);
            PayrollRecords_MainDashboard.setVisible(false);
            RequestList_MainDashboard.setVisible(false);
            LeavePanel.setVisible(false);
            
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
            populateAttTableFromCSV("/Files/Attendance.csv", attendanceTable, empID);
            populateOTTableFromCSV("/Files/OvertimeRequest.csv", otRequestTable, empID);
            DefaultTableModel model = new DefaultTableModel();
            model.setRowCount(0);

        // Show the AttendancePanel and hide other panels
        TimeKeeping_MainDashboard.setVisible(false);
        PayrollHealth_MainDashboard.setVisible(false);
        EmployeeRecords_MainDashboard.setVisible(false);
        Request_MainDashboard.setVisible(false);
        PayslipPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        AttendancePanel.setVisible(true);
        LeavePanel.setVisible(false);
        otPanel.setVisible(false);
    } else {
    // Access denied, display an error message
        JOptionPane.showMessageDialog(this, "Access Denied. Employee ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }         
    }//GEN-LAST:event_AttendanceMainDashboardButtonActionPerformed

    private void populateAttTableFromCSV(String csvFilePath, JTable table, String empID) {
        boolean foundRecords = false;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        List<List<Object>> rowDataList = new ArrayList<>();

        try (InputStream inputStream = getClass().getResourceAsStream(csvFilePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5 && data[0].equals(empID)) {
                rowDataList.add(Arrays.asList(data[1], data[2], data[3], data[4]));
                foundRecords = true;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Sort the rowDataList based on the date (data[1])
        Collections.sort(rowDataList, new Comparator<List<Object>>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            public int compare(List<Object> o1, List<Object> o2) {
                try {
                    Date date1 = dateFormat.parse((String)o1.get(0));
                    Date date2 = dateFormat.parse((String)o2.get(0));
                    return date2.compareTo(date1); // Sort in descending order
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });

    // Populate the sorted data into the table model
        for (List<Object> rowData : rowDataList) {
            model.addRow(rowData.toArray());
        }

    // Check if records were found for the employee
        if (!foundRecords) {
            JOptionPane.showMessageDialog(this, "No records found for the employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void populateOTTableFromCSV(String csvFilePath, JTable table, String empID) {
        boolean foundRecords = false;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    
        List<List<Object>> rowOTDataList = new ArrayList<>();

        try (InputStream inputStream = getClass().getResourceAsStream(csvFilePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5 && data[0].equals(empID)) {
                    rowOTDataList.add(Arrays.asList(data[1], data[2], data[3], data[4], data[5]));
                    foundRecords = true;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Sort the rowDataList based on the date (data[1])
        Collections.sort(rowOTDataList, new Comparator<List<Object>>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            public int compare(List<Object> o1, List<Object> o2) {
                try {
                    Date date1 = dateFormat.parse((String)o1.get(0)); // Second column contains the date
                    Date date2 = dateFormat.parse((String)o2.get(0));
                    return date2.compareTo(date1); // Sort in descending order
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });

        // Populate the sorted data into the table model
        for (List<Object> rowData : rowOTDataList) {
            model.addRow(rowData.toArray());
        }

    // Check if records were found for the employee
    if (!foundRecords) {
        JOptionPane.showMessageDialog(this, "No records found for the employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
            
            int currentUserId = Integer.parseInt(getMainDashboardempNo().getText().trim());
            String accessRole = SessionManager.getCurrentUserRole(currentUserId);

            // Adjust visibility based on access role
            if (accessRole.equals("Admin")) {
            getEmployeeRecords_MainDashboard().setVisible(true);
            getPayrollRecords_MainDashboard().setVisible(false);
            getRequestList_MainDashboard().setVisible(false);
            } else if (accessRole.equals("Payroll")) {
            getPayrollRecords_MainDashboard().setVisible(true);
            getEmployeeRecords_MainDashboard().setVisible(false);
            getRequestList_MainDashboard().setVisible(false);
            } else if (accessRole.equals("Supervisor")) {
            getPayrollRecords_MainDashboard().setVisible(false);
            getEmployeeRecords_MainDashboard().setVisible(false);
            getRequestList_MainDashboard().setVisible(true);
            } else {
            getEmployeeRecords_MainDashboard().setVisible(false);
            getPayrollRecords_MainDashboard().setVisible(false);
            getRequestList_MainDashboard().setVisible(false);
    }


        // TODO add your handling code here:
        TimeKeeping_MainDashboard.setVisible(true);
        PayrollHealth_MainDashboard.setVisible(true);
        Request_MainDashboard.setVisible(true);
        PayslipPanel.setVisible(false);
        PayslipViewPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        AttendancePanel.setVisible(false);
        LeavePanel.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

    private void PayslipMaindashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayslipMaindashboardActionPerformed
        String empID = MainDashboardempNo.getText(); 
        boolean accessGranted = false;
        for (EmployeeRecords employee : employees) 
            for (AttendanceRecord att : attendance) {
                if (att.getEmpID() == Integer.parseInt(empID))
                    if (employee.getEmpNo() == Integer.parseInt(empID)) {
                        accessGranted = true;
                        
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
                    PayslipViewPanel.setVisible(false);
                    ProfilePanel.setVisible(false);
                    AttendancePanel.setVisible(false);
                    LeavePanel.setVisible(false);
                }
            
        } else {
            // Handle cases where access is not granted
        }
    }//GEN-LAST:event_PayslipMaindashboardActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        LogIn login = new LogIn();  
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void LeaveMainDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveMainDashboardActionPerformed
            
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
            populateLeaveTable(empID);

    // Show the AttendancePanel and hide other panels
    TimeKeeping_MainDashboard.setVisible(false);
    PayrollHealth_MainDashboard.setVisible(false);
    EmployeeRecords_MainDashboard.setVisible(false);
    Request_MainDashboard.setVisible(false);
    PayslipPanel.setVisible(false);
    ProfilePanel.setVisible(false);
    AttendancePanel.setVisible(false);
    LeavePanel.setVisible(false);
    LeavePanel.setVisible(true);
    PayrollRecords_MainDashboard.setVisible(false);
    RequestList_MainDashboard.setVisible(false);
    
} else {
    // Access denied, display an error message
    JOptionPane.showMessageDialog(this, "Access Denied. Employee ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_LeaveMainDashboardActionPerformed

    private void populateLeaveTable (String empID) {
        DefaultTableModel model = (DefaultTableModel) leaveReqTbl.getModel();
        model.setRowCount(0); // Clear existing data

        String csvFilePath = "/Files/LeaveRequests.csv";
        boolean foundRecords = false;

        try (InputStream inputStream = getClass().getResourceAsStream(csvFilePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 7 && data[0].equals(empID)) {
                    model.addRow(new Object[]{data[2], data[1], data[3], data[4], data[5], data[6]});
                    foundRecords = true;
                }
            }
        } catch (IOException ex) {
        ex.printStackTrace();
        }

        if (!foundRecords) {
            // Optional: Display message if no records found for the employee
            JOptionPane.showMessageDialog(this, "No leave requests found for " + empID);
        }
    }
    
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

    private void requestOvertimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestOvertimeBtnActionPerformed
        // TODO add your handling code here:
        otRequestDialog.setVisible(true);
        otRequestDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_requestOvertimeBtnActionPerformed

    private void LeavePanelSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeavePanelSubmitButtonActionPerformed
        // TODO add your handling code here:
        Request request = new Request();
        
        Date startDate = LeavePanelStartDate.getDate();
        Date endDate = LeavePanelEndDate.getDate();
        String empID = MainDashboardempNo.getText();
        String leaveType = LeavePanelLeaveSelector.getSelectedItem().toString();
        String reason = LeavePanelReason.getText();
        String status = "Pending";
        
        if (startDate == null || endDate == null || leaveType.equals("Choose Leave Type") || reason.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return; // Stop further execution
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String startdateFiled = dateFormat.format(startDate);
        String enddateFiled = dateFormat.format(endDate);
               
        if (startDate.compareTo(endDate) >= 0) {
            JOptionPane.showMessageDialog(this, "End date should be greater than Start Date");
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Submit Request Form?", "Leave Request Confirmation", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Submitted Successfully");
                request.LeaveRequestwriteToCSV(empID,leaveType, startdateFiled, enddateFiled, reason, status);
                
                // Populate the table with the newly submitted leave request
                DefaultTableModel model = (DefaultTableModel) leaveReqTbl.getModel();
                String submissionDate = dateFormat.format(new Date()); // Current date as submission date
                model.addRow(new Object[]{submissionDate, leaveType, startdateFiled, enddateFiled, reason, status});
                
                LeavePanelStartDate.setDateFormatString("");
                LeavePanelEndDate.setDateFormatString("");
                LeavePanelLeaveSelector.setSelectedIndex(0);
                LeavePanelReason.setText("");
                
                leaveReqDialog.dispose();
            }
        }

        System.out.println("EmployeeID " + empID);
        System.out.println("LeaveType " + leaveType);
        System.out.println("startDate " + startdateFiled);
        System.out.println("endDate " + enddateFiled);
        System.out.println("Reason " + reason);
    }//GEN-LAST:event_LeavePanelSubmitButtonActionPerformed
    
    private void TimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeButtonActionPerformed
        // TODO add your handling code here:
        if (TimeButton.getText().equals("Time in")) {
            timeIn();
        } else {
            timeOut();
        }
    }//GEN-LAST:event_TimeButtonActionPerformed

    private void viewPayslipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPayslipButtonActionPerformed
        // TODO add your handling code here:
        String selectedCutOff = (String) cutoffSelector.getSelectedItem();
        displayPayslip(selectedCutOff);
    }//GEN-LAST:event_viewPayslipButtonActionPerformed

    private void submitBtnOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnOTActionPerformed
        // TODO add your handling code here:
        Request request = new Request();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        String employeeID = MainDashboardempNo.getText(); //
        String date = datePickerOT.getDateStringOrEmptyString();
        String startTime = startTimePickerOT.getTimeStringOrEmptyString();
        String endTime = endTimePickerOT.getTimeStringOrEmptyString();
        String reason = reasonTextOT.getText();
        String status ="Pending";
        
        if (employeeID.isEmpty() || date.isEmpty() || startTime.isEmpty() || endTime.isEmpty() || reason.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further execution
        }
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Submit Request Form?", "Leave Request Confirmation", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Submitted Successfully");
        request.OvertimeRequestwriteToCSV(employeeID, date, startTime, endTime, reason, status );
        
        DefaultTableModel model = (DefaultTableModel) otRequestTable.getModel();
        model.addRow(new Object[]{date, startTime, endTime, reason, status});
               
        datePickerOT.setText("");
        startTimePickerOT.setText("");
        endTimePickerOT.setText("");
        reasonTextOT.setText("");
        
        otRequestDialog.dispose();
        }
    }//GEN-LAST:event_submitBtnOTActionPerformed

    private void cancelBtnOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnOTActionPerformed
        // TODO add your handling code here:
        otRequestDialog.dispose();
    }//GEN-LAST:event_cancelBtnOTActionPerformed

    private void payrollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollBtnActionPerformed
        // TODO add your handling code here:
        try {
            EmployeePayroll employeepayroll = new EmployeePayroll();
            this.setVisible(true);
            employeepayroll.setVisible(true);          
        } catch (ParseException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payrollBtnActionPerformed

    private void requestListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestListBtnActionPerformed
        // TODO add your handling code here:
        Requests requests = new Requests();
        this.setVisible(true);
        requests.setVisible(true);
        
    }//GEN-LAST:event_requestListBtnActionPerformed

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        // TODO add your handling code here:
        changePassDialog.setVisible(true);
        changePassDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void cancelPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPassBtnActionPerformed
        // TODO add your handling code here:
        changePassDialog.dispose();
    }//GEN-LAST:event_cancelPassBtnActionPerformed

    private void updatePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePassBtnActionPerformed
        // TODO add your handling code here:
        String empID = MainDashboardempNo.getText().trim();
        String newPassword = tfNewPass.getText();
        String confirmPassword = tfConfirmPass.getText();
    
        if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        return; // Stop further execution
        }
        
        if (newPassword.equals(confirmPassword)) {
            // Path to the CSV file
            String csvFilePath = "src/Files/User.csv";
    
        try {
        // Read the CSV file
        File file = new File(csvFilePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
    
        String line;
    
        while ((line = br.readLine()) != null) {
            String[] data = line.split(";");
            // Assuming employee number is stored in the first column
            int employeeID = Integer.parseInt(data[0]);
        
            if (employeeID == Integer.parseInt(empID)) {
            // Update password (assuming password is stored in second last column)
            data[data.length - 2] = newPassword;
            }
        
            sb.append(String.join(";", data)).append("\n");
        }
        br.close();

        // Write the updated data back to the CSV file
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(sb.toString());
        bw.close();

        JOptionPane.showMessageDialog(null, "Password updated successfully.");
        tfNewPass.setText("");
        tfConfirmPass.setText("");
    } catch (IOException e) {
        e.printStackTrace();
    }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.");
        }
    }//GEN-LAST:event_updatePassBtnActionPerformed

    private void reqLeaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqLeaveBtnActionPerformed
        // TODO add your handling code here:
        leaveReqDialog.setVisible(true);
        leaveReqDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_reqLeaveBtnActionPerformed

    private void cancelLeaveReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelLeaveReqBtnActionPerformed
        // TODO add your handling code here:
        leaveReqDialog.dispose();
    }//GEN-LAST:event_cancelLeaveReqBtnActionPerformed

    private void displayPayslip(String cutoffDate) {
        try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String[] dates = cutoffDate.split(" - ");
        String startDateString = dates[0];
        String endDateString = dates[1];
        PayPeriod payperiod = new PayPeriod("10001", dateFormat.parse(startDateString), dateFormat.parse(endDateString), "/Files/Attendance.csv");
        String empID = MainDashboardempNo.getText();
        Benefit benefit = new Benefit();
        Earning earning = new Earning();
        Deduction deduction = new Deduction();

        boolean accessGranted = false;
        for (EmployeeRecords employee : employees)
        for (AttendanceRecord att : attendance)
        for (PayRate pay : pay){
            if (att.getEmpID() == Integer.parseInt(empID) && employee.getEmpNo() == Integer.parseInt(empID)){
                accessGranted = true; 


                 //Payslip information
                payslipNumber.setText(payperiod.getPayslipNo());
                payslipEmployeeNumber.setText(String.valueOf(employee.getEmpNo()));
                payslipEmployeeName.setText(employee.getFirstName() + " " + employee.getLastName());
                payslipStartDate.setText(dateFormat.format(payperiod.getStartDate()));
                payslipEndDate.setText(dateFormat.format(payperiod.getEndDate()));
                payslipPosition.setText(employee.getPosition());

                //Earnings
                payslipMonthlyRate.setText(String.valueOf("Php" + " " + pay.getBasicSalary()));
                payslipDailyRate.setText(String.valueOf("Php" + " " + earning.dailyRate(pay)));
                payslipOvertime.setText(String.valueOf("Php" + " " + earning.overTime(employee, payperiod, att, pay)));
                payslipDaysWorked.setText(String.valueOf(earning.daysWorked(payperiod,att) + " " + "Days"));
                payslipGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.grossSalary(employee, payperiod, att, pay))));

                //Benefits
                payslipRiceAllowance.setText("Php" + " " + employee.getFormattedDouble(pay.getRiceSubsidy()));
                payslipPhoneAllowance.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(pay.getPhoneAllowance())));
                payslipClothingAllowance.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(pay.getClothingAllowance())));
                payslipBenefitTotal.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(benefit.getTotalBenefits(pay))));

                //Deductions
                payslipSSS.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculateSssContribution(pay))));
                payslipPhilhealth.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculatePhilhealthContribution(pay))));
                payslipPagibig.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculatePagibigContribution(pay))));
                payslipTax.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.calculateTax(pay))));
                payslipDeductionTotal.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.totalDeduction(pay))));


               //Summary

               double takehomepay = earning.grossSalary(employee, payperiod, att, pay)+ benefit.getTotalBenefits(pay)+ deduction.totalDeduction(pay);

               summaryGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.grossSalary(employee, payperiod, att, pay))));
               summaryBenefits.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(benefit.getTotalBenefits(pay))));
               summaryTotalDeduction.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.totalDeduction(pay))));
               summaryTakeHomePay.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(takehomepay)));



                break; // No need to continue the loop if access is granted
            }
        }

        if (accessGranted) {




                   //hide other panels
                TimeKeeping_MainDashboard.setVisible(false);
                PayrollHealth_MainDashboard.setVisible(false);
                EmployeeRecords_MainDashboard.setVisible(false);
                Request_MainDashboard.setVisible(false);
                PayslipPanel.setVisible(true);
                ProfilePanel.setVisible(false);
                AttendancePanel.setVisible(false);
                LeavePanel.setVisible(false);
                PayslipViewPanel.setVisible(true);
        }         

    } catch (ParseException e) {
        e.printStackTrace();
        // Handle ParseException (e.g., display an error message)
    }
    }
    
    private void timeIn() {
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
                        JOptionPane.showMessageDialog(this, "Punch in successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        TimeButton.setText("Time out");
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
        
    }
    
    private void timeOut() {
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
                    TimeButton.setText("Time in");
                    break; // Exit the loop once time in is recorded
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
    }
    

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
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuBar_MainDashboard;
    private javax.swing.JLabel NoOfDaysPresent;
    private javax.swing.JLabel NoOfDaysPresent1;
    private javax.swing.JLabel NoOfDaysPresent2;
    private javax.swing.JPanel PayrollHealth_MainDashboard;
    private javax.swing.JPanel PayrollRecords_MainDashboard;
    private javax.swing.JPanel PayslipListPanel;
    private javax.swing.JButton PayslipMaindashboard;
    private javax.swing.JPanel PayslipPanel;
    private javax.swing.JPanel PayslipViewPanel;
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
    private javax.swing.JPanel RequestList_MainDashboard;
    private javax.swing.JPanel Request_MainDashboard;
    private javax.swing.JLabel Shift;
    private javax.swing.JToggleButton TimeButton;
    private javax.swing.JLabel TimeInLabel;
    private javax.swing.JPanel TimeKeeping_MainDashboard;
    private javax.swing.JLabel TimeOutLabel;
    private javax.swing.JPanel attListPanel;
    private javax.swing.JScrollPane attScrollPane;
    private javax.swing.JTabbedPane attTabbedPane;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton cancelBtnOT;
    private javax.swing.JButton cancelLeaveReqBtn;
    private javax.swing.JButton cancelPassBtn;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JDialog changePassDialog;
    private javax.swing.JPanel changePassFieldsPnl;
    private javax.swing.JPanel changePassPnl;
    private java.awt.Label confirmPassLbl;
    private javax.swing.JComboBox<String> cutoffSelector;
    private java.awt.Label dateOTRequestLbl;
    private com.github.lgooddatepicker.components.DatePicker datePickerOT;
    private java.awt.Label endTimeOTLbl;
    private com.github.lgooddatepicker.components.TimePicker endTimePickerOT;
    private javax.swing.JButton hrsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JLabel lblPending;
    private javax.swing.JPanel leaveBalPnl;
    private javax.swing.JDialog leaveReqDialog;
    private javax.swing.JPanel leaveReqFormPnl;
    private javax.swing.JLabel leaveReqHistoryLbl;
    private javax.swing.JPanel leaveReqHistoryPnl;
    private javax.swing.JTable leaveReqTbl;
    private java.awt.Label newPassLbl;
    private javax.swing.JPanel otPanel;
    private javax.swing.JDialog otRequestDialog;
    private javax.swing.JPanel otRequestDlgPnl;
    private javax.swing.JPanel otRequestFieldsPnl;
    private javax.swing.JTable otRequestTable;
    private javax.swing.JScrollPane otScrollPane;
    private javax.swing.JPanel payPanelBenefits;
    private javax.swing.JPanel payPanelEarnings;
    private javax.swing.JPanel payPanelEmpInfo;
    private javax.swing.JButton payrollBtn;
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
    private javax.swing.JPanel profileInnerPnl;
    private java.awt.Label reasonOTRequestLbl;
    private java.awt.TextArea reasonTextOT;
    private javax.swing.JButton reqLeaveBtn;
    private javax.swing.JButton requestListBtn;
    private java.awt.Label requestOTLbl;
    private java.awt.Label requestOTLbl1;
    private javax.swing.JButton requestOvertimeBtn;
    private java.awt.Label startTimeOTLbl;
    private com.github.lgooddatepicker.components.TimePicker startTimePickerOT;
    private javax.swing.JButton submitBtnOT;
    private javax.swing.JLabel summaryBenefits;
    private javax.swing.JLabel summaryGrossIncome;
    private javax.swing.JLabel summaryTakeHomePay;
    private javax.swing.JLabel summaryTotalDeduction;
    private javax.swing.JPasswordField tfConfirmPass;
    private javax.swing.JPasswordField tfNewPass;
    private javax.swing.JButton updatePassBtn;
    private javax.swing.JButton viewPayslipButton;
    // End of variables declaration//GEN-END:variables

   
}
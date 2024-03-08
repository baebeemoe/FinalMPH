
package Forms;
import System.Employee.PayPeriod;
import System.Employee.AttendanceRecord;
import System.Employee.EmployeeRecords;
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
import javax.swing.JDialog;
import System.Employee.Benefit;
import System.Employee.Earning;
import System.Employee.Deduction;
import System.Employee.Request;
import Forms.EmployeePayroll;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import Forms.EmployeeHSRDataBase;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;

public class Dashboard extends javax.swing.JFrame {

    private EmployeeRecords[] employees;
    private AttendanceRecord[] attendance;
    private PayPeriod payperiod;
    private Request request;
    public Dashboard() {
        initComponents();
        
        // Load employee records from CSV when the form is initialized
        employees = EmployeeRecords.readEmployeesFromCSV("src/Files/EmployeeData.csv");
        attendance = AttendanceRecord.readAttendanceFromCSV("src/Files/Attendance.csv");
    }

    public JPanel getOvertimePanel() {
        return OvertimePanel;
    }

    public JLabel getLblPending() {
        return lblPending;
    }

    public JPanel getPayrollRecords_MainDashboard(){
    
   return PayrollRecords_MainDashboard;
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
    
    public JPanel getEmployeeRecords_MainDashboard()
       {
        return EmployeeRecords_MainDashboard;
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

    public JPanel getPayPeriodPanel() {
        return PayPeriodPanel;
    }
    
    public JDialog getOTRequestDialog() {
        return OTRequestDialog;
    }

    public JPanel getLeaveListPanel() {
        return LeaveListPanel;
    }

    
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OTRequestDialog = new javax.swing.JDialog();
        jLabel72 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        OvertTimeSubmitButton = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel70 = new javax.swing.JLabel();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel75 = new javax.swing.JLabel();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OvertimeReason = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AttendancePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnovertimerequest = new javax.swing.JButton();
        OvertimeRequest = new javax.swing.JButton();
        Request_MainDashboard = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblPending = new javax.swing.JLabel();
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
        jLabel32 = new javax.swing.JLabel();
        OvertimePanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        overtimeListTable = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        OvertimeRequest1 = new javax.swing.JButton();
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
        payslipEmployeNumber = new javax.swing.JLabel();
        payslipNumber = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        payslipStartDate = new javax.swing.JLabel();
        payslipEndDate = new javax.swing.JLabel();
        payslipPosition = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
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
        jLabel7 = new javax.swing.JLabel();
        MainDashBoardFirstName = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        MainDashboardempNo = new javax.swing.JLabel();
        MenuBar_MainDashboard = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        ProfileButton = new javax.swing.JButton();
        AttendanceMainDashboardButtion = new javax.swing.JButton();
        LeaveMainDashboard = new javax.swing.JButton();
        PayslipMaindashboard = new javax.swing.JButton();
        PayrollHealth_MainDashboard = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        NoOfDaysPresent = new javax.swing.JLabel();
        NoOfDaysPresent1 = new javax.swing.JLabel();
        NoOfDaysPresent2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PayrollRecords_MainDashboard = new javax.swing.JPanel();
        btnPayrollemployeeDatabase1 = new javax.swing.JButton();
        LeaveListPanel = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        LeaveListTable1 = new javax.swing.JTable();
        LeavePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        LeavePanelLeaveSelector = new javax.swing.JComboBox<>();
        jLabel113 = new javax.swing.JLabel();
        LeavePanelStartDate = new com.toedter.calendar.JDateChooser();
        LeavePanelReason = new javax.swing.JTextArea();
        jLabel114 = new javax.swing.JLabel();
        LeavePanelSubmitButton = new javax.swing.JButton();
        LeavePanelEndDate = new com.toedter.calendar.JDateChooser();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        btnLeaveList = new javax.swing.JButton();
        EmployeeRecords_MainDashboard = new javax.swing.JPanel();
        btnHRSemployeeDatabase = new javax.swing.JButton();
        PayPeriodPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        PayPeriodPanelButtonSept1to15 = new javax.swing.JButton();
        PayPeriodbtnSept16to30 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        TimeKeeping_MainDashboard = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        timeprogressbar = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Shift = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        PunchIn = new javax.swing.JButton();
        PunchOut = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TimeInLabel = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TimeOutLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        OTRequestDialog.setMinimumSize(new java.awt.Dimension(500, 400));

        jLabel72.setText("Request Overtime Work");
        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton5.setText("Cancel");

        OvertTimeSubmitButton.setText("Submit");
        OvertTimeSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvertTimeSubmitButtonActionPerformed(evt);
            }
        });

        jLabel77.setText("Date");

        jLabel70.setText("Start Time");

        jLabel75.setText("End Time");

        jLabel78.setText("Reason");

        OvertimeReason.setColumns(20);
        OvertimeReason.setRows(5);
        jScrollPane4.setViewportView(OvertimeReason);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(OvertTimeSubmitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel70)
                            .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(timePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(timePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OvertTimeSubmitButton)
                    .addComponent(jButton5))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout OTRequestDialogLayout = new javax.swing.GroupLayout(OTRequestDialog.getContentPane());
        OTRequestDialog.getContentPane().setLayout(OTRequestDialogLayout);
        OTRequestDialogLayout.setHorizontalGroup(
            OTRequestDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OTRequestDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(OTRequestDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        OTRequestDialogLayout.setVerticalGroup(
            OTRequestDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OTRequestDialogLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motor");
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PH");
        jLabel3.setIconTextGap(0);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("People Portal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        AttendancePanel.setBackground(new java.awt.Color(0, 0, 0,100));
        AttendancePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        AttendancePanel.setPreferredSize(new java.awt.Dimension(980, 520));

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
        attendanceTable.setGridColor(new java.awt.Color(153, 153, 153));
        attendanceTable.setName(""); // NOI18N
        attendanceTable.setOpaque(false);
        attendanceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(attendanceTable);

        jLabel1.setText("Attendance Record");
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        btnovertimerequest.setText("Overtime Request List");
        btnovertimerequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovertimerequestActionPerformed(evt);
            }
        });

        OvertimeRequest.setText("Request Overtime");
        OvertimeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvertimeRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AttendancePanelLayout = new javax.swing.GroupLayout(AttendancePanel);
        AttendancePanel.setLayout(AttendancePanelLayout);
        AttendancePanelLayout.setHorizontalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendancePanelLayout.createSequentialGroup()
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttendancePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnovertimerequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OvertimeRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AttendancePanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        AttendancePanelLayout.setVerticalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AttendancePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AttendancePanelLayout.createSequentialGroup()
                        .addComponent(OvertimeRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnovertimerequest)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(AttendancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 540));

        Request_MainDashboard.setBackground(new java.awt.Color(0, 0, 0));
        Request_MainDashboard.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setText("My Requests");
        jLabel17.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle (1).png"))); // NOI18N

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));

        jLabel20.setText("Pending");
        jLabel20.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Approved");
        jLabel21.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setText("Denied");
        jLabel22.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setText("Leave");
        jLabel23.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Correction");
        jLabel24.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setText("Overtime");
        jLabel25.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("-");
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setText("-");
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));

        jLabel28.setText("-");
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));

        jLabel29.setText("-");
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));

        jLabel30.setText("-");
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));

        jLabel31.setText("-");
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));

        lblPending.setText("lblPending");
        lblPending.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Request_MainDashboardLayout = new javax.swing.GroupLayout(Request_MainDashboard);
        Request_MainDashboard.setLayout(Request_MainDashboardLayout);
        Request_MainDashboardLayout.setHorizontalGroup(
            Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Request_MainDashboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel22))
                    .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                        .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(60, 60, 60)
                        .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                                .addComponent(lblPending, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))))
                .addContainerGap())
        );
        Request_MainDashboardLayout.setVerticalGroup(
            Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(Request_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29)
                    .addComponent(lblPending))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Request_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31))
                .addGap(155, 155, 155))
        );

        jSeparator9.getAccessibleContext().setAccessibleName("");
        jSeparator9.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(Request_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, 300, 130));

        ProfilePanel.setBackground(new java.awt.Color(0, 0, 0,100));
        ProfilePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        profileFirstName.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        ProfileEmpNo.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile (1).png"))); // NOI18N

        jSeparator11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel37.setText("Position");
        jLabel37.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel38.setText("Status");
        jLabel38.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel39.setText("Birthdate");
        jLabel39.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel40.setText("Phone Number");
        jLabel40.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel41.setText("Address");
        jLabel41.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel42.setText("My Account Numbers");
        jLabel42.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jLabel43.setText("SSS");
        jLabel43.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel44.setText("Pag-ibig");
        jLabel44.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel45.setText("Phil-health");
        jLabel45.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel46.setText("Tin No.");
        jLabel46.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel47.setText(":");
        jLabel47.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel48.setText(":");
        jLabel48.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel49.setText(":");
        jLabel49.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel50.setText(":");
        jLabel50.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel51.setText(":");
        jLabel51.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel52.setText(":");
        jLabel52.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel53.setText(":");
        jLabel53.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel54.setText(":");
        jLabel54.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jLabel55.setText(":");
        jLabel55.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePosition.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileStatus.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileBirthdate.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePhonenumber.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileSSS.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePagIbig.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfilePhilhealth.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        ProfileTinnumber.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

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
                                    .addComponent(ProfilePagIbig, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
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
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(ProfileTinnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel32.setText("Profile");
        jLabel32.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel32))
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 530));

        OvertimePanel.setBackground(new java.awt.Color(0, 0, 0,100));
        OvertimePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        OvertimePanel.setPreferredSize(new java.awt.Dimension(980, 520));

        overtimeListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        overtimeListTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Date", "Start Time", "End Time", "Reason", "Status"
            }
        ));
        overtimeListTable.setGridColor(new java.awt.Color(153, 153, 153));
        overtimeListTable.setName(""); // NOI18N
        overtimeListTable.setOpaque(false);
        overtimeListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(overtimeListTable);
        if (overtimeListTable.getColumnModel().getColumnCount() > 0) {
            overtimeListTable.getColumnModel().getColumn(4).setHeaderValue("Status");
        }

        jLabel80.setText("Overtime Request List");
        jLabel80.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));

        OvertimeRequest1.setText("Request Overtime");
        OvertimeRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvertimeRequest1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OvertimePanelLayout = new javax.swing.GroupLayout(OvertimePanel);
        OvertimePanel.setLayout(OvertimePanelLayout);
        OvertimePanelLayout.setHorizontalGroup(
            OvertimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OvertimePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(OvertimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OvertimePanelLayout.createSequentialGroup()
                        .addComponent(OvertimeRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        OvertimePanelLayout.setVerticalGroup(
            OvertimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OvertimePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addGroup(OvertimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OvertimeRequest1))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(OvertimePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 540));

        PayslipPanel.setBackground(new java.awt.Color(255, 255, 255));
        PayslipPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        PayslipPanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jLabel33.setText("MotorPH");
        jLabel33.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N

        jSeparator12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel34.setText(" 7 Jupiter Avenue cor. F. Sandoval Jr., Bagong Nayon, Quezon City");
        jLabel34.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        jLabel35.setText("Phone: (028) 911-5071 / (028) 911-5072 / (028) 911-5073 ");
        jLabel35.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        jLabel57.setText(" Email: corporate@motorph.com\t\t\t");
        jLabel57.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        jLabel58.setText("EMPLOYEE PAYSLIP");
        jLabel58.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jLabel59.setText("PAYSLIP NO");
        jLabel59.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel60.setText("EMPLOYEE ID");
        jLabel60.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel61.setText("EMPLOYEE NAME");
        jLabel61.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipEmployeeName.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipEmployeNumber.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipNumber.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel65.setText("END DATE");
        jLabel65.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel66.setText("POSITION");
        jLabel66.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel67.setText("START DATE");
        jLabel67.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipStartDate.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipEndDate.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipPosition.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jSeparator13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel71.setText("SSS");
        jLabel71.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipSSS.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel73.setText("                                                         EARNINGS");
        jLabel73.setBackground(new java.awt.Color(0, 102, 153));
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jLabel73.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N

        jLabel74.setText("Monthly Rate");
        jLabel74.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipMonthlyRate.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel76.setText("Daily Rate");
        jLabel76.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipDailyRate.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipDaysWorked.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel79.setText("Days Worked");
        jLabel79.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipOvertime.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel81.setText("Overtime");
        jLabel81.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel82.setText("                                                     DEDUCTIONS");
        jLabel82.setBackground(new java.awt.Color(0, 0, 102));
        jLabel82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jLabel82.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N

        jLabel83.setText("Rice Subsidy");
        jLabel83.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipRiceAllowance.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel85.setText("Phone Allowance");
        jLabel85.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipPhoneAllowance.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel87.setText("Clothing Allowance");
        jLabel87.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipClothingAllowance.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel89.setText("TOTAL");
        jLabel89.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        payslipBenefitTotal.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel91.setText("                                                       BENEFITS");
        jLabel91.setBackground(new java.awt.Color(0, 0, 102));
        jLabel91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jLabel91.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N

        jLabel92.setText("Philhealth");
        jLabel92.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipPhilhealth.setText("PAYSLIP NO");
        payslipPhilhealth.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipPagibig.setText("PAYSLIP NO");
        payslipPagibig.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel95.setText("Pag-IbigPag-Ibig");
        jLabel95.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        payslipTax.setText("PAYSLIP NO");
        payslipTax.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel97.setText("Withholding Tax");
        jLabel97.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel98.setText("TOTAL DEDUCTIONS");
        jLabel98.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        payslipDeductionTotal.setText("PAYSLIP NO");
        payslipDeductionTotal.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel100.setText("                                                     SUMMARY");
        jLabel100.setBackground(new java.awt.Color(0, 0, 102));
        jLabel100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jLabel100.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N

        jLabel101.setText("Gross Income");
        jLabel101.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        summaryGrossIncome.setText("PAYSLIP NO");
        summaryGrossIncome.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        summaryBenefits.setText("PAYSLIP NO");
        summaryBenefits.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel104.setText("Benefits");
        jLabel104.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel105.setText("Total Deducations");
        jLabel105.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        summaryTotalDeduction.setText("PAYSLIP NO");
        summaryTotalDeduction.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel107.setText("TAKE HOME PAY");
        jLabel107.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        summaryTakeHomePay.setText("PAYSLIP NO");
        summaryTakeHomePay.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jLabel109.setText("GROSS INCOME");
        jLabel109.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N

        payslipGrossIncome.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

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
                            .addComponent(payslipNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payslipEmployeNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payslipEmployeeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payslipStartDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payslipEndDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payslipPosition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayslipPanelLayout.createSequentialGroup()
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(payslipOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(payslipDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(payslipDailyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(payslipMonthlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(312, 312, 312)
                                        .addComponent(payslipGrossIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(8, 8, 8)
                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayslipPanelLayout.createSequentialGroup()
                        .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addGap(252, 252, 252)
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
                            .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PayslipPanelLayout.createSequentialGroup()
                                    .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PayslipPanelLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(271, 271, 271)
                                    .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(summaryBenefits, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(summaryGrossIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(PayslipPanelLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel105)
                                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(257, 257, 257)
                                    .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(summaryTakeHomePay, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(summaryTotalDeduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PayslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PayslipPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                                        .addComponent(payslipSSS, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(payslipTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(payslipPagibig, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(payslipPhilhealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(payslipDeductionTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
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
                                .addComponent(payslipStartDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipEndDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipPosition))
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66))
                            .addGroup(PayslipPanelLayout.createSequentialGroup()
                                .addComponent(payslipNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipEmployeNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payslipEmployeeName))
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
                .addGap(33, 33, 33))
        );

        jPanel1.add(PayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 460));

        EmployeeDashboard_MainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));
        EmployeeDashboard_MainDashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        jLabel5.setText("Employee");
        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIconTextGap(0);

        jLabel6.setText("Dashboard");
        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));

        jLabel7.setText("Welcome,");
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        MainDashBoardFirstName.setBackground(new java.awt.Color(255, 255, 255));
        MainDashBoardFirstName.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        MainDashBoardFirstName.setForeground(new java.awt.Color(255, 255, 255));

        LogOut.setText("Log Out");
        LogOut.setBackground(new java.awt.Color(255, 51, 51));
        LogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        LogOut.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        MainDashboardempNo.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        MainDashboardempNo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EmployeeDashboard_MainDashboardLayout = new javax.swing.GroupLayout(EmployeeDashboard_MainDashboard);
        EmployeeDashboard_MainDashboard.setLayout(EmployeeDashboard_MainDashboardLayout);
        EmployeeDashboard_MainDashboardLayout.setHorizontalGroup(
            EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(501, 501, 501)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainDashBoardFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                        .addComponent(MainDashboardempNo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        EmployeeDashboard_MainDashboardLayout.setVerticalGroup(
            EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainDashBoardFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EmployeeDashboard_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainDashboardempNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EmployeeDashboard_MainDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );

        jPanel1.add(EmployeeDashboard_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 990, -1));
        EmployeeDashboard_MainDashboard.getAccessibleContext().setAccessibleDescription("");

        MenuBar_MainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));
        MenuBar_MainDashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Home.setText("Home");
        Home.setBackground(new java.awt.Color(0, 0, 0,100));
        Home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Home.setBorderPainted(false);
        Home.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        ProfileButton.setText("Profile");
        ProfileButton.setBackground(new java.awt.Color(0, 0, 0,100));
        ProfileButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ProfileButton.setBorderPainted(false);
        ProfileButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        ProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        AttendanceMainDashboardButtion.setText("Attendnce");
        AttendanceMainDashboardButtion.setBackground(new java.awt.Color(0, 0, 0,100));
        AttendanceMainDashboardButtion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AttendanceMainDashboardButtion.setBorderPainted(false);
        AttendanceMainDashboardButtion.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        AttendanceMainDashboardButtion.setForeground(new java.awt.Color(255, 255, 255));
        AttendanceMainDashboardButtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceMainDashboardButtionActionPerformed(evt);
            }
        });

        LeaveMainDashboard.setText("Leave");
        LeaveMainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));
        LeaveMainDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LeaveMainDashboard.setBorderPainted(false);
        LeaveMainDashboard.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        LeaveMainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        LeaveMainDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveMainDashboardActionPerformed(evt);
            }
        });

        PayslipMaindashboard.setText("Payslip");
        PayslipMaindashboard.setBackground(new java.awt.Color(0, 0, 0,100));
        PayslipMaindashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PayslipMaindashboard.setBorderPainted(false);
        PayslipMaindashboard.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        PayslipMaindashboard.setForeground(new java.awt.Color(255, 255, 255));
        PayslipMaindashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayslipMaindashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuBar_MainDashboardLayout = new javax.swing.GroupLayout(MenuBar_MainDashboard);
        MenuBar_MainDashboard.setLayout(MenuBar_MainDashboardLayout);
        MenuBar_MainDashboardLayout.setHorizontalGroup(
            MenuBar_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBar_MainDashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MenuBar_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AttendanceMainDashboardButtion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeaveMainDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PayslipMaindashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        MenuBar_MainDashboardLayout.setVerticalGroup(
            MenuBar_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBar_MainDashboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttendanceMainDashboardButtion, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeaveMainDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PayslipMaindashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        jPanel1.add(MenuBar_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, 260));

        PayrollHealth_MainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));

        jLabel14.setText("Payroll Health");
        jLabel14.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jSeparator6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 2, true));

        jSeparator7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jSeparator7.setVerifyInputWhenFocusTarget(false);

        jSeparator8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));

        NoOfDaysPresent.setText("0");
        NoOfDaysPresent.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        NoOfDaysPresent.setForeground(new java.awt.Color(255, 255, 255));

        NoOfDaysPresent1.setText("4");
        NoOfDaysPresent1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        NoOfDaysPresent1.setForeground(new java.awt.Color(255, 255, 255));

        NoOfDaysPresent2.setText("0");
        NoOfDaysPresent2.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        NoOfDaysPresent2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle (1).png"))); // NOI18N

        javax.swing.GroupLayout PayrollHealth_MainDashboardLayout = new javax.swing.GroupLayout(PayrollHealth_MainDashboard);
        PayrollHealth_MainDashboard.setLayout(PayrollHealth_MainDashboardLayout);
        PayrollHealth_MainDashboardLayout.setHorizontalGroup(
            PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NoOfDaysPresent1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoOfDaysPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoOfDaysPresent2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        PayrollHealth_MainDashboardLayout.setVerticalGroup(
            PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollHealth_MainDashboardLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(PayrollHealth_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator7)
                    .addComponent(NoOfDaysPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfDaysPresent1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfDaysPresent2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        jPanel1.add(PayrollHealth_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 300, 150));

        PayrollRecords_MainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));

        btnPayrollemployeeDatabase1.setBackground(new java.awt.Color(0, 0, 0,0));
        btnPayrollemployeeDatabase1.setFont(new java.awt.Font("Lucida Bright", 0, 36)); // NOI18N
        btnPayrollemployeeDatabase1.setForeground(new java.awt.Color(255, 255, 255));
        btnPayrollemployeeDatabase1.setText("Payroll Records");
        btnPayrollemployeeDatabase1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPayrollemployeeDatabase1.setBorderPainted(false);
        btnPayrollemployeeDatabase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayrollemployeeDatabase1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PayrollRecords_MainDashboardLayout = new javax.swing.GroupLayout(PayrollRecords_MainDashboard);
        PayrollRecords_MainDashboard.setLayout(PayrollRecords_MainDashboardLayout);
        PayrollRecords_MainDashboardLayout.setHorizontalGroup(
            PayrollRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnPayrollemployeeDatabase1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PayrollRecords_MainDashboardLayout.setVerticalGroup(
            PayrollRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayrollRecords_MainDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPayrollemployeeDatabase1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(PayrollRecords_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 660, -1));

        LeaveListPanel.setBackground(new java.awt.Color(0, 0, 0,100));
        LeaveListPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        LeaveListPanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jLabel125.setText("Leave Application");
        jLabel125.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));

        LeaveListTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        LeaveListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Leave Type", "Date  Filed", "Start Date", "End Date", "Reason", "Status"
            }
        ));
        LeaveListTable1.setGridColor(new java.awt.Color(153, 153, 153));
        LeaveListTable1.setName(""); // NOI18N
        LeaveListTable1.setOpaque(false);
        LeaveListTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(LeaveListTable1);

        javax.swing.GroupLayout LeaveListPanelLayout = new javax.swing.GroupLayout(LeaveListPanel);
        LeaveListPanel.setLayout(LeaveListPanelLayout);
        LeaveListPanelLayout.setHorizontalGroup(
            LeaveListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeaveListPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(LeaveListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        LeaveListPanelLayout.setVerticalGroup(
            LeaveListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeaveListPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(LeaveListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 530));

        LeavePanel.setBackground(new java.awt.Color(0, 0, 0,100));
        LeavePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        LeavePanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jLabel112.setText("Leave Type");
        jLabel112.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        LeavePanelLeaveSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Leave Type", "Vacation Leave", "Sick Leave", "Emergency Leave" }));
        LeavePanelLeaveSelector.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LeavePanelLeaveSelector.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        LeavePanelLeaveSelector.setName("Choose the Type of Leave"); // NOI18N

        jLabel113.setText("Reason");
        jLabel113.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        LeavePanelReason.setColumns(20);
        LeavePanelReason.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        LeavePanelReason.setRows(5);
        LeavePanelReason.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel114.setText("Date");
        jLabel114.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        LeavePanelSubmitButton.setText("Submit");
        LeavePanelSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeavePanelSubmitButtonActionPerformed(evt);
            }
        });

        jLabel62.setText("Start Date");

        jLabel63.setText("End Date");

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
                        .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LeavePanelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel113))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LeavePanelEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel114)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeavePanelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LeavePanelEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(LeavePanelSubmitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel111.setText("Leave Application");
        jLabel111.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));

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

        btnLeaveList.setText("Leave List");
        btnLeaveList.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnLeaveList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeavePanelLayout = new javax.swing.GroupLayout(LeavePanel);
        LeavePanel.setLayout(LeavePanelLayout);
        LeavePanelLayout.setHorizontalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeavePanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(LeavePanelLayout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(btnLeaveList)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LeavePanelLayout.setVerticalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnLeaveList)
                .addGap(27, 27, 27))
        );

        jPanel1.add(LeavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 530));

        EmployeeRecords_MainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));

        btnHRSemployeeDatabase.setText("Employee Records");
        btnHRSemployeeDatabase.setBackground(new java.awt.Color(0, 0, 0,0));
        btnHRSemployeeDatabase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHRSemployeeDatabase.setBorderPainted(false);
        btnHRSemployeeDatabase.setFont(new java.awt.Font("Lucida Bright", 0, 36)); // NOI18N
        btnHRSemployeeDatabase.setForeground(new java.awt.Color(255, 255, 255));
        btnHRSemployeeDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHRSemployeeDatabaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmployeeRecords_MainDashboardLayout = new javax.swing.GroupLayout(EmployeeRecords_MainDashboard);
        EmployeeRecords_MainDashboard.setLayout(EmployeeRecords_MainDashboardLayout);
        EmployeeRecords_MainDashboardLayout.setHorizontalGroup(
            EmployeeRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRecords_MainDashboardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnHRSemployeeDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        EmployeeRecords_MainDashboardLayout.setVerticalGroup(
            EmployeeRecords_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRecords_MainDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHRSemployeeDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EmployeeRecords_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 660, -1));

        PayPeriodPanel.setBackground(new java.awt.Color(0, 0, 0));
        PayPeriodPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        PayPeriodPanel.setPreferredSize(new java.awt.Dimension(1114, 520));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,100));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        jLabel68.setText("September 01, 2023 to September 15, 20223");
        jLabel68.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));

        jLabel69.setText("September 16, 2023 to September 30, 2023");
        jLabel69.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));

        PayPeriodPanelButtonSept1to15.setText("View Payslip");
        PayPeriodPanelButtonSept1to15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayPeriodPanelButtonSept1to15ActionPerformed(evt);
            }
        });

        PayPeriodbtnSept16to30.setText("View Payslip");
        PayPeriodbtnSept16to30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayPeriodbtnSept16to30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayPeriodPanelButtonSept1to15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PayPeriodbtnSept16to30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(179, 179, 179))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(PayPeriodPanelButtonSept1to15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(PayPeriodbtnSept16to30))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jLabel64.setText("Pay Period");
        jLabel64.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PayPeriodPanelLayout = new javax.swing.GroupLayout(PayPeriodPanel);
        PayPeriodPanel.setLayout(PayPeriodPanelLayout);
        PayPeriodPanelLayout.setHorizontalGroup(
            PayPeriodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayPeriodPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayPeriodPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(425, 425, 425))
        );
        PayPeriodPanelLayout.setVerticalGroup(
            PayPeriodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayPeriodPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel64)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PayPeriodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 990, 530));

        TimeKeeping_MainDashboard.setBackground(new java.awt.Color(0, 0, 0,100));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 1));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 1));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        timeprogressbar.setRequestFocusEnabled(false);
        timeprogressbar.setStringPainted(true);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-box.png"))); // NOI18N
        jLabel9.setText(" Present");
        jLabel9.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 102));

        jLabel10.setText("Time In : ");
        jLabel10.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Schedule Status :");
        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("WORK");
        jLabel11.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 51));

        jLabel12.setText("Schedule :");
        jLabel12.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        Shift.setText("03:15AM - 12:15 PM");
        Shift.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        Shift.setForeground(new java.awt.Color(255, 255, 255));

        Department.setText("Finance Department");
        Department.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        Department.setForeground(new java.awt.Color(255, 255, 255));

        PunchIn.setText("Time In");
        PunchIn.setBackground(new java.awt.Color(0, 255, 51));
        PunchIn.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        PunchIn.setForeground(new java.awt.Color(255, 255, 255));
        PunchIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchInActionPerformed(evt);
            }
        });

        PunchOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock (4).png"))); // NOI18N
        PunchOut.setBackground(new java.awt.Color(0, 0, 0,0));
        PunchOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchOutActionPerformed(evt);
            }
        });

        jLabel13.setText("Time out");
        jLabel13.setFont(new java.awt.Font("Lucida Bright", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        TimeInLabel.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        TimeInLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel56.setText("Time Out : ");
        jLabel56.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));

        TimeOutLabel.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        TimeOutLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout TimeKeeping_MainDashboardLayout = new javax.swing.GroupLayout(TimeKeeping_MainDashboard);
        TimeKeeping_MainDashboard.setLayout(TimeKeeping_MainDashboardLayout);
        TimeKeeping_MainDashboardLayout.setHorizontalGroup(
            TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Shift))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Department)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(PunchIn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PunchOut)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timeprogressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TimeKeeping_MainDashboardLayout.setVerticalGroup(
            TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(Shift)))
                            .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Department)
                                .addGap(18, 18, 18)
                                .addComponent(PunchIn))
                            .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))))
                    .addGroup(TimeKeeping_MainDashboardLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PunchOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(1, 1, 1)))
                .addComponent(timeprogressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeKeeping_MainDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel10)
                    .addComponent(TimeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator2.getAccessibleContext().setAccessibleName("");

        jPanel1.add(TimeKeeping_MainDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 660, 150));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newBackground.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Background.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHRSemployeeDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHRSemployeeDatabaseActionPerformed
     EmployeeHSRDataBase employeeDataBase = new EmployeeHSRDataBase();
      this.setVisible(true);
     employeeDataBase.setVisible(true);
    




        // TODO add your handling code here:
    }//GEN-LAST:event_btnHRSemployeeDatabaseActionPerformed

    
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
            PayPeriodPanel.setVisible(false);
            OvertimePanel.setVisible(false);
            LeaveListPanel.setVisible(false);
            
            
        } else {
            // Access denied, display an error message
            JOptionPane.showMessageDialog(this, "Invalid UserID! Access Denied.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }


// TODO add your handling code here:
    }//GEN-LAST:event_ProfileButtonActionPerformed

   
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

    private void PunchOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunchOutActionPerformed
       String empID = MainDashboardempNo.getText();
boolean accessGranted = false;

for (AttendanceRecord att : attendance) {
    if (att.getEmpID() == Integer.parseInt(empID)) {
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


    
    private void AttendanceMainDashboardButtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceMainDashboardButtionActionPerformed
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
    String csvFilePath = "src/Files/Attendance.csv";
    boolean foundRecords = false;

    /*// Create a JComboBox to act as the cell editor
        JComboBox<String> statusComboBox = new JComboBox<>();
        statusComboBox.addItem("Pending");
        statusComboBox.addItem("Approved");
        statusComboBox.addItem("Declined");
        
        
        // Set the cell editor for the last column (3rd index)
        TableColumn dropdownColumn = attendanceTable.getColumnModel().getColumn(5);
        dropdownColumn.setCellEditor(new DefaultCellEditor(statusComboBox));
     */   
    
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
    PayPeriodPanel.setVisible(false);
    OvertimePanel.setVisible(false);
    LeaveListPanel.setVisible(false);
    
} else {
    // Access denied, display an error message
    JOptionPane.showMessageDialog(this, "Access Denied. Employee ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
}

            
            
    }//GEN-LAST:event_AttendanceMainDashboardButtionActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        String empID = MainDashboardempNo.getText().trim();   
        int employeeID = Integer.parseInt(empID);
        for (EmployeeRecords employee : employees)
        
        if (employeeID == employee.getEmpNo()){    
            
        if (employee.getRole().equals("Admin")) {
                  EmployeeRecords_MainDashboard.setVisible(true);
                   PayrollRecords_MainDashboard.setVisible(false);
                } else if (employee.getRole().equals("Payroll")) { 
                    PayrollRecords_MainDashboard.setVisible(true);
                  EmployeeRecords_MainDashboard.setVisible(false);
                } else {
                  EmployeeRecords_MainDashboard.setVisible(false);
                    PayrollRecords_MainDashboard.setVisible(false);
                }
        }
        
            TimeKeeping_MainDashboard.setVisible(true);
            PayrollHealth_MainDashboard.setVisible(true);
            Request_MainDashboard.setVisible(true);
            PayslipPanel.setVisible(false);
            ProfilePanel.setVisible(false);
            AttendancePanel.setVisible(false);
            LeavePanel.setVisible(false);
            PayPeriodPanel.setVisible(false);
            OvertimePanel.setVisible(false);
            LeaveListPanel.setVisible(false);
            
            

        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void PayslipMaindashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayslipMaindashboardActionPerformed
          
                PayPeriodPanel.setVisible(true);
                   //hide other panels
                TimeKeeping_MainDashboard.setVisible(false);
                PayrollHealth_MainDashboard.setVisible(false);
                EmployeeRecords_MainDashboard.setVisible(false);
                Request_MainDashboard.setVisible(false);
                PayslipPanel.setVisible(false);
                ProfilePanel.setVisible(false);
                AttendancePanel.setVisible(false);
                LeavePanel.setVisible(false);
                OvertimePanel.setVisible(false);
                LeaveListPanel.setVisible(false);
                PayrollRecords_MainDashboard.setVisible(false);
         
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
            PayPeriodPanel.setVisible(false);
            OvertimePanel.setVisible(false);
            LeaveListPanel.setVisible(false);
            PayrollRecords_MainDashboard.setVisible(false);
        
    }//GEN-LAST:event_LeaveMainDashboardActionPerformed

    private void PayPeriodPanelButtonSept1to15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayPeriodPanelButtonSept1to15ActionPerformed

try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        PayPeriod payperiod = new PayPeriod("10001", dateFormat.parse("09/01/2022"), dateFormat.parse("09/15/2022"), "src/Files/Attendance.csv");
        String empID = MainDashboardempNo.getText();
        Benefit benefit = new Benefit();
        Earning earning = new Earning();
        Deduction deduction = new Deduction();
        
        boolean accessGranted = false;
        for (EmployeeRecords employee : employees)
        for (AttendanceRecord att : attendance) {
            if (att.getEmpID() == Integer.parseInt(empID)) 
                if (employee.getEmpNo() == Integer.parseInt(empID)){
                accessGranted = true; 
              
                
                 //Payslip information
                payslipNumber.setText(payperiod.getPayslipNo());
                payslipEmployeNumber.setText(String.valueOf(employee.getEmpNo()));
                payslipEmployeeName.setText(employee.getFirstName() + " " + employee.getLastName());
                payslipStartDate.setText(dateFormat.format(payperiod.getStartDate()));
                payslipEndDate.setText(dateFormat.format(payperiod.getEndDate()));
                payslipPosition.setText(employee.getPosition());
                
                //Earnings
                payslipMonthlyRate.setText(String.valueOf("Php" + " " +employee.getBasicSalary()));
                payslipDailyRate.setText(String.valueOf("Php" + " " + earning.dailyRate(employee)));
                payslipOvertime.setText(String.valueOf("Php" + " " +earning.overTime(employee, payperiod,att)));
                payslipDaysWorked.setText(String.valueOf(earning.daysWorked(payperiod,att) + " " + "Days"));
                payslipGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.GrossSalary(employee, payperiod,att))));
                
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
               
               double takehomepay = earning.GrossSalary(employee, payperiod,att)+ benefit.getTotalBenefits(employee)+ deduction.totalDeduction(employee);
               
               summaryGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.GrossSalary(employee, payperiod,att))));
               summaryBenefits.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(benefit.getTotalBenefits(employee))));
               summaryTotalDeduction.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.totalDeduction(employee))));
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
                PayPeriodPanel.setVisible(false);
                OvertimePanel.setVisible(false);
               PayrollRecords_MainDashboard.setVisible(false);
           
                
                
        }
       
    } catch (ParseException e) {
        e.printStackTrace();
        // Handle ParseException (e.g., display an error message)
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_PayPeriodPanelButtonSept1to15ActionPerformed

    private void PayPeriodbtnSept16to30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayPeriodbtnSept16to30ActionPerformed
try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        PayPeriod payperiod = new PayPeriod("10002", dateFormat.parse("09/16/2022"), dateFormat.parse("09/30/2022"), "src/Files/Attendance.csv");
        String empID = MainDashboardempNo.getText();
        Benefit benefit = new Benefit();
        Earning earning = new Earning();
        Deduction deduction = new Deduction();
        
        boolean accessGranted = false;
        for (EmployeeRecords employee : employees)
        for (AttendanceRecord att : attendance) {
            if (att.getEmpID() == Integer.parseInt(empID)) 
                if (employee.getEmpNo() == Integer.parseInt(empID)){
                accessGranted = true; 
              
                
                 //Payslip information
                payslipNumber.setText(payperiod.getPayslipNo());
                payslipEmployeNumber.setText(String.valueOf(employee.getEmpNo()));
                payslipEmployeeName.setText(employee.getFirstName() + " " + employee.getLastName());
                payslipStartDate.setText(dateFormat.format(payperiod.getStartDate()));
                payslipEndDate.setText(dateFormat.format(payperiod.getEndDate()));
                payslipPosition.setText(employee.getPosition());
                
                //Earnings
                payslipMonthlyRate.setText(String.valueOf("Php" + " " +employee.getBasicSalary()));
                payslipDailyRate.setText(String.valueOf("Php" + " " + earning.dailyRate(employee)));
                payslipOvertime.setText(String.valueOf("Php" + " " +earning.overTime(employee, payperiod,att)));
                payslipDaysWorked.setText(String.valueOf(earning.daysWorked(payperiod,att) + " " + "Days"));
                payslipGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.GrossSalary(employee, payperiod,att))));
                
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
               
               double takehomepay = earning.GrossSalary(employee, payperiod,att)+ benefit.getTotalBenefits(employee)+ deduction.totalDeduction(employee);
               
               summaryGrossIncome.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(earning.GrossSalary(employee, payperiod,att))));
               summaryBenefits.setText(String.valueOf("Php" + " " + employee.getFormattedDouble(benefit.getTotalBenefits(employee))));
               summaryTotalDeduction.setText("Php" + " " + String.valueOf(employee.getFormattedDouble(deduction.totalDeduction(employee))));
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
                PayPeriodPanel.setVisible(false);
                OvertimePanel.setVisible(false);
               LeaveListPanel.setVisible(false);  
                PayrollRecords_MainDashboard.setVisible(false);
                
        }
       
    } catch (ParseException e) {
        e.printStackTrace();
        // Handle ParseException (e.g., display an error message)
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_PayPeriodbtnSept16to30ActionPerformed

    private void OvertimeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvertimeRequestActionPerformed
        // TODO add your handling code here:
        OTRequestDialog.setVisible(true);
        OTRequestDialog.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_OvertimeRequestActionPerformed

    private void OvertTimeSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvertTimeSubmitButtonActionPerformed

        Request request = new Request();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        String employeeID = MainDashboardempNo.getText(); //
        String date = datePicker1.getDateStringOrEmptyString();
        String StartTime = timePicker1.getTimeStringOrEmptyString();
        String EndTime = timePicker2.getTimeStringOrEmptyString();
        String Reason = OvertimeReason.getText();
        String status ="";
        
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Submit Request Form?", "Leave Request Confirmation", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Submitted Successfully");
        request.OvertimeRequestwriteToCSV(employeeID, date, StartTime, EndTime,Reason,status );
        
       
        datePicker1.setText("");
        timePicker1.setText("");
        timePicker2.setText("");
        OvertimeReason.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_OvertTimeSubmitButtonActionPerformed

    private void OvertimeRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvertimeRequest1ActionPerformed
 // TODO add your handling code here:
        OTRequestDialog.setVisible(true);
        OTRequestDialog.setLocationRelativeTo(this);
        // TODO add your handling code here:
    }//GEN-LAST:event_OvertimeRequest1ActionPerformed

    private void btnovertimerequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovertimerequestActionPerformed
      
          String empID = MainDashboardempNo.getText().trim();
   boolean accessGranted = false;

   
   for (AttendanceRecord att : attendance) {
     System.out.println("Employee ID from record: " + att.getEmpID());
    if (att.getEmpID() == Integer.parseInt(empID)) {
        accessGranted = true;
        break;
    }
}

// Grant or deny access based on the result
if (accessGranted) {
    DefaultTableModel model = (DefaultTableModel) overtimeListTable.getModel();
    model.setRowCount(0);

    // Populate the table with data from the CSV file
    String csvFilePath = "src/Files/OvertimeRequest.csv";
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
    AttendancePanel.setVisible(false);
    LeavePanel.setVisible(false);
    PayPeriodPanel.setVisible(false);
    OvertimePanel.setVisible(true);
     LeaveListPanel.setVisible(false);
     PayrollRecords_MainDashboard.setVisible(false);
    
} else {
    // Access denied, display an error message
    JOptionPane.showMessageDialog(this, "Access Denied. Employee ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
}





// TODO add your handling code here:
    }//GEN-LAST:event_btnovertimerequestActionPerformed

    private void LeavePanelSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeavePanelSubmitButtonActionPerformed
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
                request.LeaveRequestwriteToCSV(empID,leaveType, startdateFiled, enddateFiled, reason);

                LeavePanelStartDate.setDateFormatString("");
                LeavePanelEndDate.setDateFormatString("");
                LeavePanelLeaveSelector.setSelectedIndex(0);
                LeavePanelReason.setText("");
            }
        }

        System.out.println("EmployeeID " + empID);
        System.out.println("LeaveType " + leaveType);
        System.out.println("startDate " + startdateFiled);
        System.out.println("endDate " + enddateFiled);
        System.out.println("Reason " + reason);

    }//GEN-LAST:event_LeavePanelSubmitButtonActionPerformed

    private void btnLeaveListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveListActionPerformed
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
    DefaultTableModel model = (DefaultTableModel) LeaveListTable1.getModel();
    model.setRowCount(0);

    // Populate the table with data from the CSV file
    String csvFilePath = "src/Files/LeaveRequests.csv";
    boolean foundRecords = false;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 6 && data[0].equals(empID)) {
                model.addRow(new Object[]{data[1], data[2], data[3], data[4],data[5]});
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
    AttendancePanel.setVisible(false);
    LeavePanel.setVisible(false);
    PayPeriodPanel.setVisible(false);
    OvertimePanel.setVisible(false);
    LeaveListPanel.setVisible(true);
   PayrollRecords_MainDashboard.setVisible(false);
    
    
} else {
    // Access denied, display an error message
    JOptionPane.showMessageDialog(this, "Access Denied. Employee ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeaveListActionPerformed

    private void btnPayrollemployeeDatabase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayrollemployeeDatabase1ActionPerformed
        try {
            EmployeePayroll employeepayroll = new EmployeePayroll();
            this.setVisible(true);
            employeepayroll.setVisible(true);
            
            
        } catch (ParseException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnPayrollemployeeDatabase1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttendanceMainDashboardButtion;
    private javax.swing.JPanel AttendancePanel;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Department;
    private javax.swing.JPanel EmployeeDashboard_MainDashboard;
    private javax.swing.JPanel EmployeeRecords_MainDashboard;
    private javax.swing.JButton Home;
    private javax.swing.JPanel LeaveListPanel;
    private javax.swing.JTable LeaveListTable1;
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
    private javax.swing.JDialog OTRequestDialog;
    private javax.swing.JButton OvertTimeSubmitButton;
    private javax.swing.JPanel OvertimePanel;
    private javax.swing.JTextArea OvertimeReason;
    private javax.swing.JButton OvertimeRequest;
    private javax.swing.JButton OvertimeRequest1;
    private javax.swing.JPanel PayPeriodPanel;
    private javax.swing.JButton PayPeriodPanelButtonSept1to15;
    private javax.swing.JButton PayPeriodbtnSept16to30;
    private javax.swing.JPanel PayrollHealth_MainDashboard;
    private javax.swing.JPanel PayrollRecords_MainDashboard;
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
    private javax.swing.JButton btnHRSemployeeDatabase;
    private javax.swing.JButton btnLeaveList;
    private javax.swing.JButton btnPayrollemployeeDatabase1;
    private javax.swing.JButton btnovertimerequest;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel125;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblPending;
    private javax.swing.JTable overtimeListTable;
    private javax.swing.JLabel payslipBenefitTotal;
    private javax.swing.JLabel payslipClothingAllowance;
    private javax.swing.JLabel payslipDailyRate;
    private javax.swing.JLabel payslipDaysWorked;
    private javax.swing.JLabel payslipDeductionTotal;
    private javax.swing.JLabel payslipEmployeNumber;
    private javax.swing.JLabel payslipEmployeeName;
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
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private javax.swing.JProgressBar timeprogressbar;
    // End of variables declaration//GEN-END:variables

   
}
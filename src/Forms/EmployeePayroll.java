/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import System.Employee.Earning;
import System.Employee.PayPeriod;
import System.Employee.AttendanceRecord;
import System.Employee.Benefit;
import System.Employee.Deduction;
import System.Employee.EmployeeRecords;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Default
 */
public class EmployeePayroll extends javax.swing.JFrame {
private DefaultTableModel model;
private EmployeeRecords[] employees;
private AttendanceRecord[] attendance;
    /**
     * Creates new form EmployeePayroll
     */
    public EmployeePayroll() throws ParseException {
    
        initComponents();
        // Load employee records from CSV when the form is initialized
        String csvFileName = "src/Files/EmployeeData.csv";
        employees = EmployeeRecords.readEmployeesFromCSV(csvFileName);
        attendance = AttendanceRecord.readAttendanceFromCSV("src/Files/Attendance.csv");
//        PanelMonthlyPayrollReport.setVisible(false);
//        RunPayrollTable.setVisible(true);
         displayProcessPayrollData(csvFileName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 24), new java.awt.Dimension(0, 28), new java.awt.Dimension(32767, 24));
        managePayrollLbl = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 24), new java.awt.Dimension(0, 16), new java.awt.Dimension(32767, 24));
        payrollTabbedPane = new javax.swing.JTabbedPane();
        PanelRunPayroll = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RunPayrollTable = new javax.swing.JTable();
        PanelMonthlyPayrollReport = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PayrollReportTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1500, 700));
        setPreferredSize(new java.awt.Dimension(1490, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1490, 800));

        managePayrollLbl.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        managePayrollLbl.setForeground(new java.awt.Color(255, 255, 255));
        managePayrollLbl.setText("Manage Payroll");

        payrollTabbedPane.setBackground(new java.awt.Color(51, 51, 51));
        payrollTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        payrollTabbedPane.setOpaque(true);
        payrollTabbedPane.setPreferredSize(new java.awt.Dimension(1415, 665));

        PanelRunPayroll.setBackground(new java.awt.Color(51, 51, 51));
        PanelRunPayroll.setMaximumSize(new java.awt.Dimension(1500, 700));
        PanelRunPayroll.setPreferredSize(new java.awt.Dimension(1428, 626));

        RunPayrollTable.setBackground(new java.awt.Color(255, 255, 255));
        RunPayrollTable.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        RunPayrollTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee #", "Last Name", "First Name", "Status", "Position", "Net Pay"
            }
        ));
        jScrollPane1.setViewportView(RunPayrollTable);

        javax.swing.GroupLayout PanelRunPayrollLayout = new javax.swing.GroupLayout(PanelRunPayroll);
        PanelRunPayroll.setLayout(PanelRunPayrollLayout);
        PanelRunPayrollLayout.setHorizontalGroup(
            PanelRunPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRunPayrollLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelRunPayrollLayout.setVerticalGroup(
            PanelRunPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRunPayrollLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );

        payrollTabbedPane.addTab("Run Payroll", PanelRunPayroll);

        PanelMonthlyPayrollReport.setBackground(new java.awt.Color(51, 51, 51));
        PanelMonthlyPayrollReport.setForeground(new java.awt.Color(255, 255, 255));
        PanelMonthlyPayrollReport.setOpaque(false);
        PanelMonthlyPayrollReport.setPreferredSize(new java.awt.Dimension(1428, 618));
        PanelMonthlyPayrollReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PayrollReportTable.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        PayrollReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee #", "Full Name", "Department", "Gross Income", "SSS No.", "SSS Contribution", "Philhealth No.", "Philhealth Contribution  ", "Pag-ibig No.  ", "Pag-Ibig Contribution  ", "TIN", "Withholding  Tax  ", "Net Pay  "
            }
        ));
        PayrollReportTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(PayrollReportTable);

        PanelMonthlyPayrollReport.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1368, 574));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        PanelMonthlyPayrollReport.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 227, -1));

        payrollTabbedPane.addTab("Monthly Payroll Report", PanelMonthlyPayrollReport);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 1428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(managePayrollLbl)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 1428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(payrollTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managePayrollLbl)
                .addGap(0, 0, 0)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(payrollTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void displayProcessPayrollData(String csvFileName) throws ParseException {
        displayCSVData(csvFileName);
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    String selectedMonth = (String) jComboBox1.getSelectedItem();
    Deduction deduction = new Deduction();
    DefaultTableModel model = (DefaultTableModel) PayrollReportTable.getModel();
    model.setRowCount(0);
    
    //Iterate over each column
        for (int columnIndex = 0; columnIndex < RunPayrollTable.getColumnCount(); columnIndex++) {
            TableColumn column = RunPayrollTable.getColumnModel().getColumn(columnIndex);
            int preferredWidth = 0;
            
            // Iterate over each row in the column to find the maximum preferred width
            for (int rowIndex = 0; rowIndex < RunPayrollTable.getRowCount(); rowIndex++) {
                TableCellRenderer cellRenderer = RunPayrollTable.getCellRenderer(rowIndex, columnIndex);
                Component cellComponent = RunPayrollTable.prepareRenderer(cellRenderer, rowIndex, columnIndex);
                preferredWidth = Math.max(preferredWidth, cellComponent.getPreferredSize().width);
            }
            
        }
            
        PayrollReportTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        PayrollReportTable.setFont(new Font("SansSerif", Font.PLAIN, 12));
        PayrollReportTable.setRowHeight(25);
        
    
        model.setColumnIdentifiers(new String[]{"Employee #", "Full Name", "Position", "Gross Income", "SSS No","SSS Contributon",
            "Philheath No","Philheath Contribtion", "Pag-ibig No", "Pag-ibig Contribution", "TIN", "Withholding","NetPay"
               });
        
        for (EmployeeRecords employee : employees)
     if (selectedMonth.equals("September")) {
         String csvfile = "src/Files/EmployeeData.csv";
         try (BufferedReader br = new BufferedReader(new FileReader(csvfile))) {
             String line;
           
            //Skip the first line (header)
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                String fullName = data[1] + " " + data [2];
                
                double grossSalary = employee.getGrossSalary();
                double totalDeduction = deduction.totalDeduction(employee);
                double takehomepay = grossSalary - totalDeduction;
             
               model.addRow(new Object[]{data[0], fullName ,data[11], "Php" + " " +grossSalary*2 ,employee.getSss(),"Php" + " " +deduction.calculateSssContribution(employee)
                       ,employee.getPhilHealth(), "Php" + " " +deduction.calculatePhilhealthContribution(employee),employee.getPagIbig(),"Php" + " " + deduction.calculatePagibigContribution(employee),employee.getTin(),"Php" + " " +deduction.calculateTax(employee) , "Php" + " " +takehomepay});
            }
            
            break;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
      // Set custom cell renderer for all columns
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < PayrollReportTable.getColumnCount(); i++) {
            PayrollReportTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
         
     }
   
   
 
   
 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    
    
    
     private void displayCSVData(String csvFile) throws ParseException {
         
        DefaultTableModel model = (DefaultTableModel) RunPayrollTable.getModel();
        model.setRowCount(0);
      
        // Iterate over each column
        for (int columnIndex = 0; columnIndex < RunPayrollTable.getColumnCount(); columnIndex++) {
            TableColumn column = RunPayrollTable.getColumnModel().getColumn(columnIndex);
            int preferredWidth = 0;
            
            // Iterate over each row in the column to find the maximum preferred width
            for (int rowIndex = 0; rowIndex < RunPayrollTable.getRowCount(); rowIndex++) {
                TableCellRenderer cellRenderer = RunPayrollTable.getCellRenderer(rowIndex, columnIndex);
                Component cellComponent = RunPayrollTable.prepareRenderer(cellRenderer, rowIndex, columnIndex);
                preferredWidth = Math.max(preferredWidth, cellComponent.getPreferredSize().width);
            }
            
            // Set the preferred width for the column
            column.setPreferredWidth(preferredWidth + RunPayrollTable.getIntercellSpacing().width);
        }
        //Customize header
        RunPayrollTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        RunPayrollTable.setFont(new Font("SansSerif", Font.PLAIN, 12));
        RunPayrollTable.setRowHeight(25);
        
       
        Deduction deduction = new Deduction();
        
        
        model.setColumnIdentifiers(new String[]{"Employee #", "Last Name", "First Name", "Status", "Position","NetPay"
               });
       
        for (EmployeeRecords employee : employees)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
             String line;
           
            //Skip the first line (header)
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                
                double grossSalary = employee.getGrossSalary();
                double totalDeduction = deduction.totalDeduction(employee);
                double takehomepay = grossSalary - totalDeduction;
             
               model.addRow(new Object[]{data[0], data[1], data[2], data[10],data[11], "Php" + " " + takehomepay});
            }
            
             break;
             
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Center align cells
       
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < RunPayrollTable.getColumnCount(); i++) {
            RunPayrollTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
      // Determine which panel to add the table to based on the visibility of PanelRunPayroll
     if (PanelRunPayroll.isVisible()) {
        // PanelRunPayroll is currently visible, so the table is already added to it
    } else {
        // PanelMonthlyPayrollReport is currently visible, so the table is already added to it
    }

        // Enable row selection
        RunPayrollTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }
     
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmployeePayroll().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(EmployeePayroll.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMonthlyPayrollReport;
    private javax.swing.JPanel PanelRunPayroll;
    private javax.swing.JTable PayrollReportTable;
    private javax.swing.JTable RunPayrollTable;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel managePayrollLbl;
    private javax.swing.JTabbedPane payrollTabbedPane;
    // End of variables declaration//GEN-END:variables
}

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
        RunPayrollTable.setVisible(true);
        displayCSVData(csvFileName); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanelRunPayroll = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RunPayrollTable = new javax.swing.JTable();
        PanelMonthlyPayrollReport = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RunPayrollTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        setPreferredSize(new java.awt.Dimension(1050, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("Employee List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton1.setText("Monthly Payroll Report");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 210, 30));

        jButton2.setText("Run Payroll");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 30));

        PanelRunPayroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRunPayrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRunPayrollLayout.setVerticalGroup(
            PanelRunPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRunPayrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PanelRunPayroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 57, 970, -1));

        PanelMonthlyPayrollReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        RunPayrollTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(RunPayrollTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout PanelMonthlyPayrollReportLayout = new javax.swing.GroupLayout(PanelMonthlyPayrollReport);
        PanelMonthlyPayrollReport.setLayout(PanelMonthlyPayrollReportLayout);
        PanelMonthlyPayrollReportLayout.setHorizontalGroup(
            PanelMonthlyPayrollReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMonthlyPayrollReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMonthlyPayrollReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                    .addGroup(PanelMonthlyPayrollReportLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelMonthlyPayrollReportLayout.setVerticalGroup(
            PanelMonthlyPayrollReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMonthlyPayrollReportLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(PanelMonthlyPayrollReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 57, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


      PanelMonthlyPayrollReport.setVisible(false);
      PanelRunPayroll.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PanelMonthlyPayrollReport.setVisible(true);
      PanelRunPayroll.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        
        RunPayrollTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        RunPayrollTable.setFont(new Font("SansSerif", Font.PLAIN, 12));
        RunPayrollTable.setRowHeight(25);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Earning earning = new Earning();
         Benefit benefit = new Benefit();
         Deduction deduction = new Deduction();
         PayPeriod payperiod = new PayPeriod("10002", dateFormat.parse("09/16/2022"), dateFormat.parse("09/30/2022"), "src/Files/Attendance.csv");
        
        model.setColumnIdentifiers(new String[]{"Employee #", "Last Name", "First Name", "Status", "Position","NetPay"
               });
       
        for (EmployeeRecords employee : employees)
        for (AttendanceRecord att : attendance)
            
              
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
             String line;
             double takehomepay = earning.GrossSalary(employee, payperiod,att)+ benefit.getTotalBenefits(employee)+ deduction.totalDeduction(employee);
            //Skip the first line (header)
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
               model.addRow(new Object[]{data[0], data[1], data[2], data[10],data[11], takehomepay});
            }
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

        // Add mouse listener to handle row selection for deletion and updating
        RunPayrollTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = RunPayrollTable.getSelectedRow();
                if (selectedRow != -1 && e.getClickCount() == 2) {
                    updateSelectedEmployee();
                }
            }
        });
    }
    
    private void updateSelectedEmployee() {
        int selectedRow = RunPayrollTable.getSelectedRow();
        if (selectedRow != -1) {
            JTextField[] fields = new JTextField[19];
            JPanel panel = new JPanel(new GridLayout(19, 2, 5, 5));
            panel.setPreferredSize(new Dimension(400, 600));
            String[] labels = {"Employee #", "Last Name", "First Name", "Birthday", "Address",
                    "Phone Number", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status", "Position",
                    "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance",
                    "Gross Semi-monthly Rate", "Hourly Rate"};
            for (int i = 0; i < labels.length; i++) {
                panel.add(new JLabel(labels[i]));
                fields[i] = new JTextField(model.getValueAt(selectedRow, i).toString());
                panel.add(fields[i]);
            }
            int result = JOptionPane.showConfirmDialog(null, panel, "Update Employee", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                StringBuilder updatedEmployee = new StringBuilder();
                for (int i = 0; i < fields.length; i++) {
                    updatedEmployee.append(fields[i].getText());
                    if (i < fields.length - 1) {
                        updatedEmployee.append(";");
                    }
                }
                for (int i = 0; i < model.getColumnCount(); i++) {
                    model.setValueAt(fields[i].getText(), selectedRow, i);
                }
                updateCSVFile();
            }
        }
    }
    
      private void updateCSVFile() {
        try (FileWriter writer = new FileWriter("src/Files/EmployeeData.csv")) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) {
                        writer.write(";");
                    }
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JTable RunPayrollTable;
    private javax.swing.JTable RunPayrollTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

package Forms;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class EmployeeHSRDataBase extends javax.swing.JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField searchField;

    public EmployeeHSRDataBase() {
        super("EmployeeHSRDataBase");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1050, 580);

        JPanel mainPanel = new JPanel(null);
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(new Color(200, 230, 255));
        setContentPane(mainPanel);

        model = new DefaultTableModel();
        table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        // Iterate over each column
        for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            TableColumn column = table.getColumnModel().getColumn(columnIndex);
            int preferredWidth = 0;
            
            // Iterate over each row in the column to find the maximum preferred width
            for (int rowIndex = 0; rowIndex < table.getRowCount(); rowIndex++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(rowIndex, columnIndex);
                Component cellComponent = table.prepareRenderer(cellRenderer, rowIndex, columnIndex);
                preferredWidth = Math.max(preferredWidth, cellComponent.getPreferredSize().width);
            }
            
            // Set the preferred width for the column
            column.setPreferredWidth(preferredWidth + table.getIntercellSpacing().width);
        }
        
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        table.setFont(new Font("SansSerif", Font.PLAIN, 12));
        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(200, 50, 800, 450);
        mainPanel.add(scrollPane);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        searchField = new JTextField(60);
        JButton searchButton = new JButton("Search");
        topPanel.add(new JLabel("Search:"));
        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.setBounds(200,10, 800, 50);
        topPanel.setBackground(new Color(200, 230, 255));
        mainPanel.add(topPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1, 5, 5));
        buttonPanel.setBounds(30, 50, 150, 200);
        buttonPanel.setBackground(new Color(200, 230, 255));
        
        JButton addEmployeeButton = new JButton("Add Employee");
        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployee();
            }
        });
        buttonPanel.add(addEmployeeButton);

        JButton deleteEmployeeButton = new JButton("Delete Employee");
        deleteEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedEmployee();
            }
        });
        buttonPanel.add(deleteEmployeeButton);

        JButton updateEmployeeButton = new JButton("Update Employee");
        updateEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSelectedEmployee();
            }
        });
        buttonPanel.add(updateEmployeeButton);

        JButton viewEmployeeButton = new JButton("View Employee");
        viewEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSelectedEmployee();
            }
        });
        buttonPanel.add(viewEmployeeButton);

        JButton importCSVButton = new JButton("Import CSV");
        importCSVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                importCSV();
            }
        });
        buttonPanel.add(importCSVButton);

        mainPanel.add(buttonPanel);

        displayCSVData("src/Files/EmployeeData.csv"); // Display once run

        setVisible(true);
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchEmployee();
            }
        });
    }

    private void displayCSVData(String csvFile) {
        model.setColumnIdentifiers(new String[]{"Employee #", "Last Name", "First Name", "Birthday", "Address",
                "Phone Number", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status", "Position",
                "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance",
                "Gross Semi-monthly Rate", "Hourly Rate"});

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            
            // Skip the first line (header)
            br.readLine();
            while ((line = br.readLine()) != null) {
                model.addRow(line.split(";"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Center align cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // Enable row selection
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add mouse listener to handle row selection for deletion and updating
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1 && e.getClickCount() == 2) {
                    updateSelectedEmployee();
                }
            }
        });
    }




    private void addEmployee() {
        JTextField[] fields = new JTextField[19];
        JPanel panel = new JPanel(new GridLayout(19, 2, 5, 5));
        panel.setPreferredSize(new Dimension(400, 600));
        String[] labels = {"Employee #", "Last Name", "First Name", "Birthday", "Address",
                "Phone Number", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status", "Position",
                "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance",
                "Gross Semi-monthly Rate", "Hourly Rate"};
        for (int i = 0; i < labels.length; i++) {
            panel.add(new JLabel(labels[i]));
            fields[i] = new JTextField();
            panel.add(fields[i]);
        }
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Employee", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            StringBuilder newEmployee = new StringBuilder();
            for (int i = 0; i < fields.length; i++) {
                newEmployee.append(fields[i].getText());
                if (i < fields.length - 1) {
                    newEmployee.append(";");
                }
            }
            try (FileWriter writer = new FileWriter("src/Files/EmployeeData.csv", true)) {
                writer.write(newEmployee.toString() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            model.addRow(newEmployee.toString().split(";"));
        }
    }

    private void deleteSelectedEmployee() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this employee?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            
            model.removeRow(selectedRow);
            updateCSVFile();
        }
    }
    }

    private void updateSelectedEmployee() {
        int selectedRow = table.getSelectedRow();
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

    private void searchEmployee() {
        String searchTerm = searchField.getText().trim().toLowerCase();
        if (searchTerm.isEmpty()) {
            // If search term is empty, reset the table to display all data
            resetTable();
            return;
        }

        DefaultTableModel filteredModel = new DefaultTableModel();

        // Add column names to the filtered model
        for (int i = 0; i < model.getColumnCount(); i++) {
            filteredModel.addColumn(model.getColumnName(i));
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            boolean found = false;
            for (int j = 0; j < model.getColumnCount(); j++) {
                String cellValue = model.getValueAt(i, j).toString().toLowerCase();
                if (cellValue.contains(searchTerm)) {
                    found = true;
                    break; // Break the inner loop to move to the next row
                }
            }
            if (found) {
                filteredModel.addRow(model.getDataVector().elementAt(i));
            }
        }

        table.setModel(filteredModel);
    }



    private void viewSelectedEmployee() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            StringBuilder details = new StringBuilder();
            for (int i = 0; i < model.getColumnCount(); i++) {
                details.append(model.getColumnName(i)).append(": ").append(model.getValueAt(selectedRow, i)).append("\n");
            }
           showCustomMessage(details.toString(), "Employee Details");
        }
    }
    private void resetTable() {
        table.setModel(model);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeHSRDataBase::new);
    }

    private void importCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select CSV File to Import");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV files", "csv"));

        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToImport = fileChooser.getSelectedFile();
            String filePath = fileToImport.getAbsolutePath();
            displayCSVData(filePath);
        }
    }
    
    private void showCustomMessage(String message, String title) {
    JDialog dialog = new JDialog(this, title, true);
    JTextArea textArea = new JTextArea(message);
    textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    dialog.add(scrollPane);
    dialog.setSize(600, 400); // Set the size as per your requirement
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}

}

package System.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRecords {
    
    private int empNo;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String sss;
    private String philHealth;
    private String tin;
    private String pagIbig;
    private String status;
    private String position;
    private String supervisor;
    
    

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSss() {
        return sss;
    }

    public String getPhilHealth() {
        return philHealth;
    }

    public String getTin() {
        return tin;
    }

    public String getPagIbig() {
        return pagIbig;
    }

    public String getStatus() {
        return status;
    }

    public String getPosition() {
        return position;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public int getEmpNo() {
        return empNo;
    }
      
    public String getFullName() {
        return firstName + " " + lastName;
    }
      
    
   

    public EmployeeRecords(String[] data) {
        this.empNo = Integer.parseInt(data[0]);
        this.lastName = data[1];
        this.firstName = data[2];
        this.birthDate = data[3];
        this.address = data[4];
        this.phoneNumber = data[5];
        this.sss = data[6];
        this.philHealth = data[7];
        this.tin = data[8];
        this.pagIbig = data[9];
        this.status = data[10];
        this.position = data[11];
        this.supervisor = data[12];
    }
    
  
    public static EmployeeRecords[] readEmployeesFromCSV(String filePath) {
        String line;
        String csvSplitBy = ";";
        List<EmployeeRecords> employeeList = new ArrayList<>();
        BufferedReader br = null;

    try {
        // Open the CSV file using FileReader
        FileReader fileReader = new FileReader(filePath);
        br = new BufferedReader(fileReader);

//        // Skip the first line (column headers)
//        br.readLine();

        // Read data from CSV file
        while ((line = br.readLine()) != null) {
            
            // Skip empty lines
            if (line.trim().isEmpty()) {
                continue; // Skip empty lines
            }
            
            String[] data = line.split(csvSplitBy);
            employeeList.add(new EmployeeRecords(data));
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Convert List<EmployeeRecords> to array
    return employeeList.toArray(new EmployeeRecords[0]);
    }

    // Constructor to initialize EmployeeRecords object from data
//    public EmployeeRecords(String[] data) {
//        // Initialize EmployeeRecords object from data array
//    }
     
    
    private String formatDouble(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
   
    
    public String getFormattedDouble(double value) {
        return formatDouble(value);
    }
    
   
}

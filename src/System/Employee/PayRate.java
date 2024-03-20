package System.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PayRate {
    
    private int empNo;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSalary;
    private double hourlyRate;
    
    

        public double getBasicSalary() {
        return basicSalary;
    }

    public double getRiceSubsidy() {
        return riceSubsidy;
    }

    public double getPhoneAllowance() {
        return phoneAllowance;
    }

    public double getClothingAllowance() {
        return clothingAllowance;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
      public int getEmpNo() {
        return empNo;
    }
      
    
      
    
   

    public PayRate(String[] data) {
        this.empNo = Integer.parseInt(data[0]);
        this.basicSalary = Double.parseDouble(data[1]);
        this.riceSubsidy = Double.parseDouble(data[2]);
        this.phoneAllowance = Double.parseDouble(data[3]);
        this.clothingAllowance = Double.parseDouble(data[4]);
        this.grossSalary = Double.parseDouble(data[5]);
        this.hourlyRate = Double.parseDouble(data[6]);
    }
    
  
    public static PayRate[] readPayFromCSV(String filePath) {
        String line;
        String csvSplitBy = ";";
        List<PayRate> employeeList = new ArrayList<>();
        BufferedReader br = null;

    try {
        // Open the CSV file using FileReader
        FileReader fileReader = new FileReader(filePath);
        br = new BufferedReader(fileReader);

//        // Skip the first line (column headers)
//        br.readLine();

        // Read data from CSV file
        while ((line = br.readLine()) != null) {
            String[] data = line.split(csvSplitBy);
            employeeList.add(new PayRate(data));
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
    return employeeList.toArray(new PayRate[0]);
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
    
    
    public double Dailyrate(){
        double dailyRate = 0;
        dailyRate = hourlyRate * 8;
        return dailyRate;
    } 
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Default
 */
public class PayPeriod {
    private String payslipNo;
    private Date startDate;
    private Date endDate;

    public String getPayslipNo() {
        return payslipNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public PayPeriod getPayPeriod1() {
        return payPeriod1;
    }

    public PayPeriod getPayPeriod2() {
        return payPeriod2;
    }

    public String getCsvFile() {
        return csvFile;
    }
    
    
     public PayPeriod(String payslipNo, Date startDate, Date endDate) throws ParseException {
        this.payslipNo = payslipNo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
    }
     
     SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    // Example pay periods
            PayPeriod payPeriod1;
            PayPeriod payPeriod2;

            
            
       String csvFile = "src/Files/timekeeping.csv";    
   public int countDays(String csvFile) {
    int daysWorked = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    String line;
    String delimiter = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // Skip header line
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
            if (data.length == 5) { // Check if data has exactly five elements
                Date date = dateFormat.parse(data[1]);
                // Check if the date falls within the pay period
                if (date.compareTo(this.startDate) >= 0 && date.compareTo(this.endDate) <= 0) {
                    daysWorked++;
                }
            } else {
                // Handle cases where the data format is incorrect
                System.out.println("Incorrect data format: " + line);
            }
        }
    } catch (IOException | ParseException e) {
        e.printStackTrace();
    }
    return daysWorked;
}
            
   
}

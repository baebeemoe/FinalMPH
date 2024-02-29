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

public class PayPeriod {
    private String payslipNo;
    private Date startDate;
    private Date endDate;
    private SimpleDateFormat dateFormat;
    private String csvFile;

    public PayPeriod(String payslipNo, Date startDate, Date endDate, String csvFile) throws ParseException {
        this.payslipNo = payslipNo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        this.csvFile = csvFile;
    }

    public String getPayslipNo() {
        return payslipNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int countDays() {
        int daysWorked = 0;
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
    
    public double calculateTotalOvertime() {
    double totalOvertime = 0.0;
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
                    double overtime = Double.parseDouble(data[4]); // Assuming index 4 holds the overtime value
                    totalOvertime += overtime;
                }
            } else {
                // Handle cases where the data format is incorrect
                System.out.println("Incorrect data format: " + line);
            }
        }
    } catch (IOException | ParseException e) {
        e.printStackTrace();
    }
    return totalOvertime;
}
}

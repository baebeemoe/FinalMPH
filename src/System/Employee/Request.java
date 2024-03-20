/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Default
 */
public class Request {
    
    int empID;
    String requestType;
    Date dateFiled;
    Date requestStartDate;
    Date requestEndDate;
    Date requestDate;


    
   
    public void LeaveRequestwriteToCSV(String employeeID,String leaveType, String startDate, String endDate, String reason, String status) {
        String dataType = "leave";
        
        // Get the directory where the JAR file is located
        String jarPath = Request.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        File jarDirectory = new File(jarPath).getParentFile();

        //Create a file for overtime data
        File leaveFile = new File(jarDirectory, "leave_data.csv");
        
        try {
        FileWriter writer = new FileWriter(leaveFile, true);// Append if there is an existing file
        
              
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
             
        Date currentDate = new Date(); // Get current date
        String dateFiled = dateFormat.format(currentDate);
        writer.append(employeeID  + "," + leaveType + "," + dateFiled + "," + startDate + "," + endDate + "," + reason + "," + status +"\n");
        

        writer.close();
        System.out.println("Data written to CSV successfully.");
    } catch (IOException e) {
        e.printStackTrace();
    }
        
        // Call method to persist data to permanent storage
            DataPersistenceManager dataPersistenceManager = new DataPersistenceManager(leaveFile, dataType);
            dataPersistenceManager.persistToPermanentStorage();
    
    
    }
    
    public void OvertimeRequestwriteToCSV(String employeeID, String Date, String startTime, String endTime, String reason, String status){
        String dataType = "overtime";
        
        // Get the directory where the JAR file is located
        String jarPath = Request.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        File jarDirectory = new File(jarPath).getParentFile();

        //Create a file for overtime data
        File overtimeFile = new File(jarDirectory, "overtime_data.csv");
        
        try {
        // Read existing data if the file exists
        StringBuilder existingData = new StringBuilder();
            if (overtimeFile.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(overtimeFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    existingData.append(line).append("\n");
                }
            reader.close();
        }

        // Append new data to existing data
        StringBuilder newData = new StringBuilder();
        newData.append(employeeID).append(",").append(Date).append(",").append(startTime).append(",").append(endTime).append(",").append(reason).append(",").append(status).append("\n");

        // Write combined data back to the file
        FileWriter writer = new FileWriter(overtimeFile);
        writer.write(existingData.toString());
        writer.write(newData.toString());
        writer.close();

        System.out.println("Data written to CSV successfully.");
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        
        
        // Call method to persist data to permanent storage
            DataPersistenceManager dataPersistenceManager = new DataPersistenceManager(overtimeFile, dataType);
            dataPersistenceManager.persistToPermanentStorage();
        
    
        
    }
    
    public String formatTime(String time) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy, hh:mm a");
        SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm a");
        try {
            Date date = inputFormat.parse(time);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }
    
    
   public int countRequest(String csvFile, int employeeID) {
    int count = 0;
    String line;
    String delimiter = ",";
    try (InputStream inputStream = getClass().getResourceAsStream(csvFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
        // Skip header line
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
            if (data.length == 6) { // Check if data has exactly six elements
                int csvEmployeeID = Integer.parseInt(data[0]);
                // Check if the current row corresponds to the employeeID
                if (csvEmployeeID == employeeID) {
                    count++;
                }
            } else {
                // Handle cases where the data format is incorrect
//                System.out.println("Incorrect data format: " + line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return count;
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    
   
    public void LeaveRequestwriteToCSV(String employeeID, String startDate, String endDate, String reason) {
        try {
            File file = new File("src/Files/LeaveRequests.csv");
            boolean isNewFile = !file.exists();
            FileWriter writer = new FileWriter(file, true); // Append to existing file
        
            if (isNewFile) {
                writer.append("empID,LeaveTpe,Date Filed,StartDate,EndDate,Status\n");
            }
        
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
       

        
            Date currentDate = new Date(); // Get current date
            String dateFiled = dateFormat.format(currentDate);
            writer.append(employeeID  + "," + dateFiled + "," + startDate + "," + endDate + "," + reason + "\n");
        

            writer.close();
            System.out.println("Data written to CSV successfully.");
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
    
    public void OvertimeRequestwriteToCSV(String employeeID, String Date, String startTime, String endTime, String reason, String status){
        
        try {
            File file = new File("src/Files/OvertimeRequest.csv");
            boolean isNewFile = !file.exists();
            FileWriter  writer = new FileWriter(file, true);// Append if there is an existing file 
            
            
            if (isNewFile) {
            writer.append("EmployeeID, Date, StartTime, EndTime, Reason, Status\n");
            }
            
            
            writer.append(employeeID  + "," + Date + "," + startTime + "," + endTime + "," + reason + "," +  status + "\n");
             
            writer.close();
            System.out.println("Data written to CSV successfully.");
            
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    }

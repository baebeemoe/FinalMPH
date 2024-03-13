package System.Employee;

import Forms.Dashboard;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceRecord {
    //Variables
    private int empID;
    private String date;
    private String timeIn;
    private String timeOut;
    private String overTime;
 
    
//Set up getter
    public int getEmpID() {
        return empID;
    }

    public String getDate() {
        return date;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public String getOverTime() {
        return overTime;
    }
        
    public String punchIn() {
        return getCurrentDateTimeFormatted();
    }

    public String punchOut() {
        return getCurrentDateTimeFormatted();
    }

    private String getCurrentDateTimeFormatted() {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy, hh:mm a");
        return format.format(new Date());
    }

public long calculateOvertime(String timeIn, String timeOut) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");

    try {
        if (timeIn != null && timeOut != null) {
            // Parse time strings into Date objects
            Date timeInDate = dateFormat.parse(timeIn);
            Date timeOutDate = dateFormat.parse(timeOut);

            // Calculate time difference in milliseconds
            long timeDifference = timeOutDate.getTime() - timeInDate.getTime();

            // Convert milliseconds to hours
            long hoursWorked = timeDifference / (60 * 60 * 1000);

          // Check if hours worked exceed 9
            if (hoursWorked <= 9) {
                return 0; // No overtime
            } else {
                // Calculate overtime hours
                long overtimeHours = hoursWorked - 9;
                return overtimeHours;
            }
        } else {
            // Either timeIn or timeOut is null, so no calculation can be done
            return 0;
        }
    } catch (ParseException e) {
        e.printStackTrace();
        // Handle parsing exception
        return 0; // Return 0 in case of parsing error
    }
}


  public void writeToCSV(String timeIn, String timeOut) {
    try {
        File file = new File("src/Files/Attendance.csv");
        boolean isNewFile = !file.exists();
        FileWriter writer = new FileWriter(file, true); // Append to existing file
        
        if (isNewFile) {
            writer.append("UserID,Date,TimeIn,TimeOut,Overtime\n");
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        if (timeIn != null && !timeIn.isEmpty() && timeOut != null && !timeOut.isEmpty()) {
            Date currentDate = new Date(); // Get current date
            String formattedDate = dateFormat.format(currentDate);
            
            Date timeInDate = timeFormat.parse(timeIn);
            Date timeOutDate = timeFormat.parse(timeOut);

            String formattedTimeIn = timeFormat.format(timeInDate);
            String formattedTimeOut = timeFormat.format(timeOutDate);
            long overtime = calculateOvertime(timeIn, timeOut);

            writer.append(empID + "," + formattedDate + "," + formattedTimeIn + "," + formattedTimeOut + "," + overtime + "\n");
        } else {
            System.out.println("Error: Time in or time out is null or empty.");
        }

        writer.close();
        System.out.println("Data written to CSV successfully.");
    } catch (IOException | ParseException e) {
        e.printStackTrace();
    }
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
    
   
    //Constructor for CsV
    public AttendanceRecord(String[] data) {
     if (data.length >= 5) { // Check if data array has at least 5 elements
       this.empID = Integer.parseInt(data[0].trim()); // Parse the employee ID
    this.date = data[1].trim();
    this.timeIn = data[2].trim();
    this.timeOut = data[3].trim();
    this.overTime = data[4].trim();
    } else { System.err.println("Error: Insufficient data in the array.");
    }
    
    }
    
   /**
   ///Read Csv attendance
   public static AttendanceRecord[] readAttendanceFromCSV(String filePath) {
        String line = "";
        String csvSplitBy = ",";
        AttendanceRecord[] attendance = null;
        BufferedReader br = null;
       

        try {
            br = new BufferedReader(new FileReader(filePath));

            // Skip the first line (column headers)
            br.readLine();

            // Determine number of lines (employees) in the CSV file
            int numEmployees = (int) br.lines().count();
            attendance = new AttendanceRecord[numEmployees];

            // Reset BufferedReader to start of file
            br.close();
            br = new BufferedReader(new FileReader(filePath));

            // Skip the first line again before reading data
            br.readLine();

            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                attendance[index] = new AttendanceRecord(data);
                index++;
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
        return attendance;
    }**/
    
public static AttendanceRecord[] readAttendanceFromCSV(String filePath) {
    List<AttendanceRecord> records = new ArrayList<>();

    try (InputStream inputStream = AttendanceRecord.class.getResourceAsStream(filePath);
         BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
        //Skip the header line
        br.readLine();
        
        String line;
        // Read each line from the CSV file
        while ((line = br.readLine()) != null) {
            // Split the line into fields using the appropriate delimiter
            String[] data = line.split(",");
            // Create an AttendanceRecord object using the data
            AttendanceRecord record = new AttendanceRecord(data);
            // Add the record to the list
            records.add(record);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Convert the list to an array and return
    return records.toArray(new AttendanceRecord[0]);
}

}
   
   
      

    


package System;

import Forms.Dashboard;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AttendanceRecord {
    private int userID;
    
    
    public AttendanceRecord(int userID) {
        
        this.userID = 123;
    }

  
    
    public String timeIn() {
        return getCurrentDateTimeFormatted();
    }

    public String timeOut() {
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
        File file = new File("src/Files/timekeeping.csv");
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

            writer.append(userID + "," + formattedDate + "," + formattedTimeIn + "," + formattedTimeOut + "," + overtime + "\n");
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
}

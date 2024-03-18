/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author choi
 */
public class User {
    private int empNo;
    private String password;
    private String role;
    
     public int getEmpNo() {
        return empNo;
    }
    
    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    
    public User(String[] data) {
        this.empNo = Integer.parseInt(data[0]);
        this.password = data[1];
        this.role = data[2];
    }
    
     public static User[] readUserFromCSV(String filePath) {
        String line;
        String csvSplitBy = ";";
        List<User> userList = new ArrayList<>();
        BufferedReader br = null;

    try {
        // Open the CSV file using InputStream
        InputStream inputStream = User.class.getResourceAsStream(filePath);
        if (inputStream == null) {
            System.err.println("File not found: " + filePath);
            return new User[0]; // or throw an exception
        }
        br = new BufferedReader(new InputStreamReader(inputStream));

        

        // Read data from CSV file
        while ((line = br.readLine()) != null) {
            
            // Skip empty lines
            if (line.trim().isEmpty()) {
                continue; // Skip empty lines
            }
            
            String[] data = line.split(csvSplitBy);
            userList.add(new User(data));
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
    return userList.toArray(new User[0]);
    }
    
}

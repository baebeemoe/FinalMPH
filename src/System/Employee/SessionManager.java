/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Employee;

import System.Employee.User;

/**
 *
 * @author choi
 */
public class SessionManager {
    private static User[] users;

    // Constructor for SessionManager to initialize user array
    static {
        // Initialize users array by reading from CSV
        users = User.readUserFromCSV("permanent_storage/user/user.csv");
    }
    
     private static User getUserByEmpNo(int empNo) {
        for (User user : users) {
            if (user.getEmpNo() == empNo) {
                return user;
            }
        }
        return null; // User not found
    }

    // Method to get the role of the current user
    public static String getCurrentUserRole(int currentUserId) {
        // Retrieve the User object for the current user
        User currentUser = getUserByEmpNo(currentUserId);

        // Check if the currentUser is null (not found)
        if (currentUser == null) {
            return "User"; // Return a default role
        }

        // Return the role of the current user
        return currentUser.getRole();
    }
    
    
}

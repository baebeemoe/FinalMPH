package Forms;


import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author george
 */
public class Main {
    public static void main(String[] args) {
        // Check if the required JDK version is available
        if (!isJDKVersionAvailable("22")) {
            // Display a message indicating that the required JDK version is not available
            SwingUtilities.invokeLater(() -> {
                showErrorDialog("Required JDK version (17) is not available. Click OK to download JDK 17.");
            });
            return;
        }

        // If the required JDK version is available, proceed with your application logic
        // For demonstration, let's launch the UI
        SwingUtilities.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Method to check if the required JDK version is available
    private static boolean isJDKVersionAvailable(String requiredVersion) {
        // Get the current Java version
        String javaHome = System.getProperty("java.home");
        return javaHome.contains(requiredVersion);
    }

    // Method to display an error dialog with a recommendation to download JDK 17
    private static void showErrorDialog(String message) {
        int option = JOptionPane.showConfirmDialog(null, message, "Error", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            // Open the default browser to the JDK 17 download page
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://www.oracle.com/ph/java/technologies/downloads/#java17"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

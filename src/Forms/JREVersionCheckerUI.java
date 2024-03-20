package Forms;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author george
 */
public class JREVersionCheckerUI {
    public static void createAndShowUI(String message) {
        JFrame frame = new JFrame("JRE Version Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setSize(400, 300);
        

        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
        
    }
}

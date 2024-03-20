/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Employee;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author george
 */
public class DataPersistenceManager {
    private File dataFile;
    private String dataType;

    public DataPersistenceManager(File temporaryFile, String dataType) {
        this.dataFile = temporaryFile;
        this.dataType = dataType;
    }

    public void persistToPermanentStorage() {
        if (dataFile != null && dataFile.exists()) {
            File permanentDirectory = new File("permanent_storage/" + dataType);
            if (!permanentDirectory.exists()) {
                permanentDirectory.mkdirs();
            }
            File destinationFile = new File(permanentDirectory, dataType + ".csv");

            try {
                if (destinationFile.exists()) {
                    //Append the content of the temporary file to the existing permanent file
                    Files.write(destinationFile.toPath(), Files.readAllBytes(dataFile.toPath()), StandardOpenOption.APPEND);
                } else {
                    //If the permanent file doesn't exist, simply copy the temporary file
                    Files.copy(dataFile.toPath(), destinationFile.toPath());
                }
                
            } catch (IOException e) {
                e.printStackTrace();
                // Handle error
            }
        } else {
            System.out.println("No " + dataType + " data found to persist to permanent storage.");
        }
    }
    
}

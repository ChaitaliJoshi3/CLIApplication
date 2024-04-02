// FileReader.java
/* This class is to read the file line by line
 * 
 */
package dev.chaitaliJ.CLIApplication.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class fileReader {
//It reads file line by line and returns the all content as a single string.
    public String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    
}

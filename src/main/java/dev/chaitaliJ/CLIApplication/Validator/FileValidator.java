// FileValidator.java
/* This class validates the file to be processed.
 */
package dev.chaitaliJ.CLIApplication.Validator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;




public class FileValidator {

    //Method to check whether file exists or not
    public boolean fileExists(String filePath) {
        return new File(filePath).exists();
    }

    //Method checks whether given file is txt file or not
    public boolean isTextFile(String filePath) throws IOException {
       try
        {
            
            Path path =Paths.get(filePath);
            String mimeType = Files.probeContentType(path);
            //return false when file mimetype can not be determined.
            if(mimeType == null)
            {
                return false;
            }
            else
            {
                return mimeType.equals("text/plain");
            }
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return false; // Error occurred while detecting MIME type
        }
       
    }


    //checks whether given file's size is more than 1 MB
    public boolean isFileSizeLessThan1MB(String filePath) throws IOException {
        
         Path path = Paths.get(filePath);
        long fileSizeInBytes = Files.size(path);
        long oneMBInBytes = 1024 * 1024; // 1MB in Bytes
        return fileSizeInBytes < oneMBInBytes; 
    }

    //checks whether given file is empty
    public boolean isFileEmpty(String filePath) throws IOException
    {
    	long size = new File(filePath).length();
    	return size==0; //If the file is empty, its size going to be 0
    }
}

// WordCountService.java
/* 
 * This is a service class which counts the occurrence of the words in a file.
 * Generates Hashmap with words and its occurrences
 * returns list of words in descending order by their occurrence
 */
package dev.chaitaliJ.CLIApplication.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dev.chaitaliJ.CLIApplication.Validator.FileValidator;
import dev.chaitaliJ.CLIApplication.reader.fileReader;
import dev.chaitaliJ.CLIApplication.utility.LoggerWrapper;



public class WordCountService {

    private final FileValidator fileValidator;
    private final fileReader fileReader;
  
    private final LoggerWrapper loggerWrapper;

    public WordCountService() {
        this.fileValidator = new FileValidator();
        this.fileReader = new fileReader();
        this.loggerWrapper = new LoggerWrapper();
    }
    //with file filePath as arguments , it count the occurrences of words in file.
    public String countWordFrequency(String filePath) {
        try {
            //Perform all validations on file
            if (!fileValidator.fileExists(filePath)) {
                loggerWrapper.logWarning("File Not exists at Path: " + filePath);
                return "File Not exists at Path";
            }

            if (!fileValidator.isTextFile(filePath)) {
                loggerWrapper.logWarning("Not Valid FileType for file: " + filePath);
                return "Not Valid FileType";
            }

            if (!fileValidator.isFileSizeLessThan1MB(filePath)) {
                loggerWrapper.logWarning("File is too big to process: " + filePath);
                return "File is too big to process";
            }
            if(fileValidator.isFileEmpty(filePath)) {
            	loggerWrapper.logWarning("File is empty:"  + filePath);
            	return "File is Empty";
            }
            //reads file
            String content = fileReader.readFile(filePath);
			//Creates Hashmap with word as a key and number of occurrences as a value
			Map<String, Integer> wordFrequencyMap = new HashMap<>();
			String[] words = content.split("\\s+"); //splits conent with space
			for (String word : words) {
				wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
			}
           
            return formatWordFrequency(wordFrequencyMap);
        } 
		catch (IOException e) {
            loggerWrapper.logError("Error occurred: " + e.getMessage(), e);
            return "Error occurred: " + e.getMessage();
        }
    }
	
    //Method sort number of occurrences in descending order and returns as a string
	private String formatWordFrequency(Map<String, Integer> wordFrequencyMap) {

		StringBuilder result = new StringBuilder();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordFrequencyMap.entrySet());
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));//performs sorting on values. (descending order)

        for (Map.Entry<String, Integer> entry : entries) {
        	 result.append(entry.getKey()).append(" ").append(entry.getValue()).append(" ").append("\n");
        	 
        }
     // Remove the trailing space
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}

package dev.chaitaliJ.CLIApplication.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class WordCountServiceTest {

    @Test
    void testCountWordFrequency() {
        WordCountService wordCountService = new WordCountService();

        // Test case 1: Valid file path with text content
        String filePath1 = "src/test/resources/test_files/test1.txt";
        String expectedResult1 = "apple 2 \nbanana 1 \norange 1 ";
        assertEquals(expectedResult1, wordCountService.countWordFrequency(filePath1));

        // Test case 2: Valid file path with no content
        String filePath2 = "src/test/resources/test_files/test2.txt";
        String expectedResult2 = "File is Empty";
        assertEquals(expectedResult2, wordCountService.countWordFrequency(filePath2));

        // Test case 3: Invalid file path
        String filePath3 = "invalid_path";
        String expectedError3 = "File Not exists at Path";
        assertEquals(expectedError3, wordCountService.countWordFrequency(filePath3));

        // Test case 4: Invalid file type
        String filePath4 = "src/test/resources/test_files/test3.xlsx";
        String expectedError4 = "Not Valid FileType";
        assertEquals(expectedError4, wordCountService.countWordFrequency(filePath4));

        // Test case 5: File too big to process
        String filePath5 = "src/test/resources/test_files/test2_Large.txt";
        String expectedError5 = "File is too big to process";
        assertEquals(expectedError5, wordCountService.countWordFrequency(filePath5));

        // Test case 6: IOException
        String filePath6 = "src/test/resources/test_files/invalid.txt";
        String expectedError6 = "File Not exists at Path";
        assertEquals(expectedError6, wordCountService.countWordFrequency(filePath6));
    }
}


package dev.chaitaliJ.CLIApplication.Validator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import java.io.File;

class FileValidatorTest {
	
	

    @Test
    void testFileExists() {
        FileValidator validator = new FileValidator();
        

        // Test case 1: Valid file pathß
        String filePath1 = "src/test/resources/test_files/test1.txt";
        boolean filePath = new File(filePath1).exists();
        System.out.println(filePath);
        
        assertTrue(validator.fileExists(filePath1));

        // Test case 2: Invalid file path
        String filePath2 = "invalid_path";
        assertFalse(validator.fileExists(filePath2));
    }

    @Test
    void testIsTextFile() {
        FileValidator validator = new FileValidator();

        // Test case 1: Valid text file
        String filePath1 = "src/test/resources/test_files/test1.txt";
        try {
            assertTrue(validator.isTextFile(filePath1));
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

        // Test case 2: Invalid file type
        String filePath2 = "src/test/resources/test_files/test2.pdf";
        try {
            assertFalse(validator.isTextFile(filePath2));
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

    }

    @Test
    void testIsFileSizeLessThan1MB() {
        FileValidator validator = new FileValidator();

        // Test case 1: File size less than 1 MB
        String filePath1 = "src/test/resources/test_files/test1.txt";
        try {
            assertTrue(validator.isFileSizeLessThan1MB(filePath1));
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

        // Test case 2: File size greater than 1 MB
        String filePath2 = "src/test/resources/test_files/test2_large.txt";
        try {
            assertFalse(validator.isFileSizeLessThan1MB(filePath2));
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

        // Test case 3: Invalid file path
        String filePath3 = "invalid_path";
        assertThrows(IOException.class, () -> validator.isFileSizeLessThan1MB(filePath3));
    }
}

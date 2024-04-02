package dev.chaitaliJ.CLIApplication.reader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;

class fileReaderTest {
	
	InputStream inputStream = getClass().getResourceAsStream("/test_files/test1.txt");

    @Test
    void testReadFile() {
        fileReader reader = new fileReader();

        // Test case 1: Valid file path with content
        String filePath1 = "src/test/resources/test_files/test1.txt";
        String expectedContent1 = "apple banana apple orange\n";
        try {
            String actualContent1 = reader.readFile(filePath1);
            assertEquals(expectedContent1, actualContent1);
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

        // Test case 2: Valid file path with no content 
        String filePath2 = "src/test/resources/test_files/test2.txt";
        String expectedContent2 = "";
        try {
            String actualContent2 = reader.readFile(filePath2);
            assertEquals(expectedContent2, actualContent2);
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

        // Test case 3: Invalid file path
        String filePath3 = "invalid_path";
        assertThrows(IOException.class, () -> reader.readFile(filePath3));
    }
}

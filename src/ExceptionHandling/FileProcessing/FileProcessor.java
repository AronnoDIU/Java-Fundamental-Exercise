package ExceptionHandling.FileProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public void processFile(String filePath) throws FileProcessingException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            if (e instanceof java.io.FileNotFoundException) {
                throw new FileNotFoundException("File not found: " + filePath);
            } else {
                throw new FileReadException("Error reading file: " + filePath);
            }
        }
    }
}

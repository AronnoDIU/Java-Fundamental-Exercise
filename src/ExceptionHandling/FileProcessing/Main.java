package ExceptionHandling.FileProcessing;

public class Main {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        String filePath = "example.txt";

        try {
            fileProcessor.processFile(filePath);
            System.out.println("File processed successfully");
        } catch (FileProcessingException e) {
            System.err.println(e.getMessage());
        }
    }
}

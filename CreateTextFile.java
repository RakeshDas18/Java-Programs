import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "example.txt";

        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter(fileName);

            // Write content to the file
            writer.write("Hello, this is an example text file created using Java.\n");
            writer.write("Java makes it easy to handle file operations.\n");

            // Close the FileWriter to save the file
            writer.close();

            System.out.println("File created successfully: " + fileName);
        } catch (IOException e) {
            // Handle potential I/O errors
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}

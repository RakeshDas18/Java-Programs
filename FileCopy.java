import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\source\\example.txt";
        String destinationFilePath = "D:\\destination\\example_copy.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFilePath);
            outputStream = new FileOutputStream(destinationFilePath);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully to: " + destinationFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the streams.");
                e.printStackTrace();
            }
        }
    }
}

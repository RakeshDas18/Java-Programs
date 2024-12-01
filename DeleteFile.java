import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String filePath = "C:\\example\\fileToDelete.txt"; // Change to your file path

        File file = new File(filePath);

        if (file.delete()) {
            System.out.println("File deleted successfully: " + filePath);
        } else {
            System.out.println("Failed to delete the file. It may not exist or be in use.");
        }
    }
}

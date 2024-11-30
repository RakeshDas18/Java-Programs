import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        String oldFilePath = "C:\\example\\oldfile.txt"; // Change to your old file path
        String newFilePath = "C:\\example\\newfile.txt"; // Change to your new file path

        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFilePath);
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}

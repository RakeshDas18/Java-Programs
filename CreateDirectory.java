import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        // Define the directory path (change to your desired drive and folder name)
        String directoryPath = "D:\\MyNewDirectory";

        // Create a File object
        File directory = new File(directoryPath);

        // Check if the directory already exists
        if (!directory.exists()) {
            // Try to create the directory
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully at: " + directoryPath);
            } else {
                System.out.println("Failed to create the directory.");
            }
        } else {
            System.out.println("Directory already exists at: " + directoryPath);
        }
    }
}

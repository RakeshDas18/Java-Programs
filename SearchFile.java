import java.io.File;

public class SearchFile {
    public static void main(String[] args) {
        String directoryPath = "C:\\example"; // Change to your directory path
        String fileNameToSearch = "targetFile.txt"; // Change to the file name you want to search for

        File directory = new File(directoryPath);
        boolean found = searchFile(directory, fileNameToSearch);

        if (found) {
            System.out.println("File found!");
        } else {
            System.out.println("File not found.");
        }
    }

    public static boolean searchFile(File directory, String fileNameToSearch) {
        if (!directory.exists()) {
            System.out.println("The directory does not exist: " + directory.getAbsolutePath());
            return false;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    boolean found = searchFile(file, fileNameToSearch);
                    if (found) {
                        return true;
                    }
                } else {
                    if (file.getName().equals(fileNameToSearch)) {
                        System.out.println("File found at: " + file.getAbsolutePath());
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

package FileHadling;

import java.io.File;
import java.io.IOException;

public class CreateGetdetails {
    public static void main(String[] args) {
        File file = new File("/Users/preethianil/Downloads/untitled folder/testfile.txt");

        try {
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                if (file.createNewFile()) {  // Creates a new file
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }

            // Display file details
            System.out.println("File name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("File zize is "+file.length());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

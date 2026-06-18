import java.io.*;
import java.util.Scanner;

public class CreateDirAndFile {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        try {
            System.out.print("Enter directory name: ");
            String dirName = ob.nextLine();

            System.out.print("Enter file name: ");
            String fileName = ob.nextLine();

            File directory = new File(dirName);

            if (!directory.exists()) {
                if (directory.mkdir()) {
                    System.out.println("Directory created successfully: " + dirName);
                } else {
                    System.out.println("Failed to create directory");
                }
            } else {
                System.out.println("Directory already exists");
            }

            File file = new File(dirName + File.separator + fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            ob.close();
        }
    }
}

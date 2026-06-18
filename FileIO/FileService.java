import java.io.*;

public class FileService {
    public void readConfigFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            throw new RuntimeException("File not found at: " + file.getAbsolutePath());
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((path = br.readLine()) != null) {
                System.out.println(path);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileService fs = new FileService();
        try {
            fs.readConfigFile("data.txt");
        } catch (RuntimeException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}

import java.io.*;

public class FileInputStreamExample4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");

            fis.skip(3); // Skips first 3 bytes
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

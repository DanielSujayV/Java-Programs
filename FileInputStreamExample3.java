import java.io.*;

public class FileInputStreamExample3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");

            System.out.println("Bytes available: " + fis.available());

            fis.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

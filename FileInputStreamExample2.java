import java.io.*;

public class FileInputStreamExample2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] b = new byte[10];

            int bytesRead = fis.read(b);  // Reads bytes into buffer
            System.out.println("Bytes read: " + bytesRead);
            System.out.println(new String(b, 0, bytesRead));

            fis.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}


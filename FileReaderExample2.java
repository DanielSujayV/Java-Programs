import java.io.*;

public class FileReaderExample2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            char[] b = new char[20];

            int charsRead = fr.read(b);  // Reads characters into buffer
            System.out.println(new String(b, 0, charsRead));

            fr.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

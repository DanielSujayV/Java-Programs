import java.io.*;

public class FileReaderExample4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");

            fr.skip(6); // Skips "Hello " (6 characters)

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

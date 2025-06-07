import java.io.*;

public class FileReaderExample1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            int ch;

            while ((ch = fr.read()) != -1) {  // Reads one character at a time
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}


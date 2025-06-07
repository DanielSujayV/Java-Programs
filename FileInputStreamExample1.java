import java.io.*;

public class FileInputStreamExample1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");                                  //open(file.getPath()) 
            int ch;

            while ((ch = fis.read()) != -1) {  // Reads one byte at a time
                System.out.print((char)ch);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

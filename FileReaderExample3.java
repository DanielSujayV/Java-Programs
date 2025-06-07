import java.io.*;

public class FileReaderExample3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");

            if (fr.ready()) {
                System.out.println("File is ready to be read!");
            }
            else{
                System.out.println("File is not ready to be read!");
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

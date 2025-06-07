import java.io.*;

public class FileOutputStreamExample3 {
    public static void main(String[] args) {
        try {
          FileOutputStream fos = new FileOutputStream("flushExample.txt");
            fos.write("Flush Example!".getBytes());
            fos.flush(); // Ensures data is written before closing
            fos.close();
            System.out.println( "Data written and flushed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

import java.io.*;

public class FileOutputStreamExample1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output_stream.txt");

            // Writing a string as bytes
            String data = "Hello DP!";
            fos.write(data.getBytes()); // Convert string to byte array

            fos.close(); // Close stream
            System.out.println("Data written successfully using FileOutputStream.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

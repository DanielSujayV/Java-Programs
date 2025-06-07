import java.io.*;

public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("partialByteOutput.txt");
            String data = "Welcome to Java!";
            byte[] bytes = data.getBytes();
            fos.write(bytes, 8, 4); // Writes "Java"
            fos.close();
            System.out.println("Partial byte array written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

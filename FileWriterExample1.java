import java.io.*;

public class FileWriterExample1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output_writer.txt");

            // Writing data using FileWriter
            String str="Hello DP,\n welcome to FileWriter!";
            fw.write(str);

            fw.close(); // Close writer
            System.out.println("Data written successfully using FileWriter.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

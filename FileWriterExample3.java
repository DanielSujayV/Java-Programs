import java.io.*;

public class FileWriterExample3{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("flushExampleWriter.txt");
            
            
            fw.flush(); // The flush() method in Java is used to forcefully 
            fw.close();  // write any buffered data to the output stream.
            
            fw.write("Flush method in FileWriter!");
            System.out.println("Data written and flushed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

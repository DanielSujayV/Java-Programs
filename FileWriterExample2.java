import java.io.*;

public class FileWriterExample2{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("charArrayOutput.txt");
            char[] charArray = {'H', 'e', 'l', 'l', 'o', '!'};
            fw.write(charArray);
            fw.close();
            System.out.println("Character array written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

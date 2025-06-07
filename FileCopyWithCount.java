import java.io.*;

public class FileCopyWithCount {
    public static void main(String[] args) {
        String inputFile = "Farrago.txt";
        String outputFile = "Copy.txt";
        char targetChar = 'e';
        int readCount = 0, writeCount = 0;

        try (Reader reader = new FileReader(inputFile);
             Writer writer = new FileWriter(outputFile)) {

            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch == targetChar) readCount++;
                writer.write(ch);
                if (ch == targetChar) writeCount++;
            }

            System.out.println("Character '" + targetChar + "' read count: " + readCount);
            System.out.println("Character '" + targetChar + "' written count: " + writeCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q10_Read_File {
    public static void main(String[] args) {
        String fileName = "Day14ReadSample.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Welcome to Java File Handling!");
            writer.write(System.lineSeparator());
            writer.write("Reading files using BufferedReader.");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }

        try (BufferedReader reader =
                 new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("File contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
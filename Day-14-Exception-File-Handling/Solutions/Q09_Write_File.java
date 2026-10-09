import java.io.FileWriter;
import java.io.IOException;

public class Q09_Write_File {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Day14Sample.txt")) {
            writer.write("Welcome to Java File Handling!");
            writer.write(System.lineSeparator());
            writer.write("This file was created using FileWriter.");

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a test file.\n");
            writer.write("Java File I/O demo.");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

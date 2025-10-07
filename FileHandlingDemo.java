import java.io.FileWriter;
public class FileHandlingDemo {
    public static void main(String[] args) {
        // Writing text into a file
        String fileName = "myFile.txt";
        String text = "Once upon a time, in a land far, far away there  lived a friendly dragon.";
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
            System.out.println("Stroy written to " + fileName + " successfully...!!!");
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

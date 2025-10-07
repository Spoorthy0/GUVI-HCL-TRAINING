
import java.io.BufferedReader;
import java.io.FileReader;

public class Files {
    public static void main(String[] args) {
        String fileName="myfile.txt";
        try( FileReader fileReader=new FileReader(fileName);
             BufferedReader reader=new BufferedReader(fileReader)) {
                String line;
                System.out.println("Contents of the file:");
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            
        } catch (Exception e) {
            System.out.println("AN error occured");
        }
    }
}

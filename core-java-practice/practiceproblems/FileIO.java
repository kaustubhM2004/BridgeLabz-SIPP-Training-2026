import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Demo1.txt")) {
            fw.write("hii i am kaustubh how are you");
            System.out.println("file edited");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
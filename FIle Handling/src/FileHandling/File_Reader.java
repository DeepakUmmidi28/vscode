package FileHandling;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("demo.txt")) {
            int data=fr.read();
            while(fr.ready()){
                System.out.println((char)data);
                data=fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

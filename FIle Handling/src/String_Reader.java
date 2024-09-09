import java.io.IOException;
import java.io.StringReader;

public class String_Reader {
    public static void main(String[] args) {
        try (StringReader sr=new StringReader("Hello")){
            int data=sr.read();
            while(data!=-1){
                System.out.println((char)data);
                data=sr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

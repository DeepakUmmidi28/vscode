package FileHandling;
import java.io.InputStreamReader;

public class Input_Stream_Reader {
    public static void main(String[] args) {
        try (InputStreamReader isr=new InputStreamReader(System.in);){
            int data=isr.read();
            while(isr.ready()){
                System.out.println((char)data);
                data=isr.read();
            }
            isr.close();
        } catch (Exception e) {
            e.getMessage();
    }
}
}

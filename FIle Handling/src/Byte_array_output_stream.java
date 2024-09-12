import java.io.ByteArrayOutputStream;

public class Byte_array_output_stream {
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        String str="Deepak";
        byte arr[]=str.getBytes();
        baos.write(arr);
        
    }
}

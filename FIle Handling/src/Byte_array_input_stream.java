import java.io.ByteArrayInputStream;

public class Byte_array_input_stream {
    public static void main(String[] args) throws Exception{
        String str="Deepak";
        byte arr[]=str.getBytes();
        ByteArrayInputStream bais=new ByteArrayInputStream(arr);
        // int data=bais.read();
        // System.out.println((char)data);
        
        // int data;
        // while((data=bais.read())!=-1){
        //     System.out.print((char)data);
        // }

        String s=new String(bais.readAllBytes());
        System.out.println(s);
        bais.close();
    }
}

import java.io.FileInputStream;

public class File_Iput_Stream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("Test.txt");
        // int data=fis.read();
        // while(data!=-1){
        //     System.out.print((char)data+" ");
        //     data=fis.read();
        // }
        
        byte arr[]=new byte[fis.available()];
        fis.read(arr);
        // for(byte x:arr)
        // System.out.print((char)x+" ");
        String str=new String(arr);
        System.out.println(str);
        fis.close();
    }
}

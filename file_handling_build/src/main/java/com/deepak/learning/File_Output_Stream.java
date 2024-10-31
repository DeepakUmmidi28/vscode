package com.deepak.learning;
import java.io.FileOutputStream;

public class File_Output_Stream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("Test.txt");
        // String str=new String("Deepak");
        // byte b[]=str.getBytes();
        // for(byte x:b)
        // fos.write(x);
        // fos.close();
        
        String str=new String("Deepak Ummidi");
        byte b[]=str.getBytes();
        fos.write(b, 7, str.length()-8);
        fos.close();
    }
}

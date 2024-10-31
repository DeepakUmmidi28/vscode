package com.deepak.learning;
import java.io.FileWriter;

public class File_writer {
    public static void main(String[] args) throws Exception{
        FileWriter fr=new FileWriter("Test.txt");
        String str="Deepak Ummidi";
        // char arr[]=str.toCharArray();
        // fr.write(arr);
        // fr.close();
        
        fr.write(str);
        fr.close();
    }
}

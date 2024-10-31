package com.deepak.learning;
import java.io.*;

public class Object_streams
{
   public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:\\vscode\\File Handling\\src\\FileHandling\\Demo.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }
    
    // public static void main(String[] args) throws Exception
    // {
    //     FileInputStream fis=new FileInputStream("C:\\MyJava\\Student3.txt");
    //     ObjectInputStream ois=new ObjectInputStream(fis);
        
    //     Student s=(Student)ois.readObject();
        
    //     System.out.println(s);
        
    //     fis.close();
    //     ois.close();
        
    // }
}




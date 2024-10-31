package com.deepak.learning;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Data_Streams {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("D:\\vscode\\File Handling\\src\\FileHandling\\Demo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student s=new Student();
        s.rollno=20;
        s.name="Deepak";
        s.dept="ECE";
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.close();
        fos.close();
    }
}

class Student{
    int rollno;
    String name;
    String dept;
}


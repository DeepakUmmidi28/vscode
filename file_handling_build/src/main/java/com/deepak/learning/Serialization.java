package com.deepak.learning;
import java.io.FileOutputStream;
import java.io.PrintStream;

// import java.io.BufferedReader;
// import java.io.FileInputStream;
// import java.io.FileReader;
// import java.io.InputStreamReader;

public class Serialization {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("D:\\\\vscode\\\\File Handling\\\\src\\\\FileHandling\\\\Demo.txt");
        Student s=new Student();
        s.rollno=10;
        s.name="Deepak";
        s.dept="ECE";
        PrintStream ps=new PrintStream(fos);
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        ps.close();

        // FileInputStream fis=new FileInputStream("Test.txt");
        // BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        // Student s=new Student();
        // s.rollno=Integer.parseInt(br.readLine());
        // s.name=br.readLine();
        // s.dept=br.readLine();

        // System.out.println("Rollno "+s.rollno+" name "+s.name+" dept "+s.dept);
    }
}





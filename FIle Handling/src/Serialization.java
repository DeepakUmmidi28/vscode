import java.io.FileOutputStream;
import java.io.PrintStream;

public class Serialization {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("Test.txt");
        Student s=new Student();
        s.rollno=10;
        s.name="Deepak";
        s.dept="ECE";
        PrintStream ps=new PrintStream(fos);
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
    }
}

class Student{
    int rollno;
    String name;
    String dept;
}

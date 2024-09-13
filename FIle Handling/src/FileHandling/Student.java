package FileHandling;
import java.io.*;
public class Student implements  Serializable
{
     int rollno;
     String name;
     float avg;
     String dept;
    public static int Data=10;
    public transient int t;
    
    public Student()
    {
        
    }
    public Student(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

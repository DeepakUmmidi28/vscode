package Collections_;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
   
   public static void main(String[] args) {
    List<Integer> alist=new ArrayList<>(); 
    alist.add(1);
    alist.add(2);
    System.out.println(alist);

   //  List<Student> l2=new ArrayList<>();
   //  l2.add(new Student("Deepak",20));
   // l2.add(new Student("Ramya",21));
   // System.out.println(l2);
   }

}

// class Student
// {
//    String name;
//    int age;

//    Student(String name,int age)
//    {
//       this.name=name;
//       this.age=age;
//    }
//    @Override
//    public String toString()
//    {
//       return "Name : "+name+"\nAge : "+age;
//    }
// }
package Lambda;
import java.util.List;
import Lambda.MarksEnum.Marks;
public class Main {
    public static void main(String[] args) {
        Demo d=new Demo();
    //    List<Student> list= d.meth1(new isStudentMinMarks());
    //    System.out.println(list);

        List<Student> list =d.meth1(new FilterStudents() {
            public boolean test(Student s)
            {
                return s.getMarks()==Marks.MAX_MARKS;
            }
        });


        //List<Student> l1=d.meth1((Student s)-> s.getMarks()==Marks.MAX_MARKS);

        for(Student x:list)
        {
            System.out.print(x.getName() +" ");
        }

    }
}

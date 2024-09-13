package Lambda;

import java.util.ArrayList;
import java.util.List;

import Lambda.MarksEnum.Marks;

//import Lambda.MarksEnum.Marks;

public class Demo
{
    List<Student> list=new ArrayList<>();
    Demo()
    {
        list.add(new Student("Deepak", Marks.MAX_MARKS));
        list.add(new Student("Ramya", Marks.MAX_MARKS));
        list.add(new Student("hemanth", Marks.MIN_MARKS));
    }

    public boolean isMax(Student obj)
    {
        return obj.getMarks()==Marks.MAX_MARKS;
    }

    public List<Student> meth1(FilterStudents filter)
    {
        List<Student> filteredStudent=new ArrayList<>();
        for(Student s:list)
        {
            if(filter.test(s))
            filteredStudent.add(s);
        }
        
        return filteredStudent;
    }
} 
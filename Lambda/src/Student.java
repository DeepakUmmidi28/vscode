import Lambda.MarksEnum.Marks;

public class Student {
    String name;
    Marks marks;
    public Student(String name,Marks marks)
        {
            this.marks=marks;
            this.name=name;
        }
    public Marks getMarks()
    {
        return marks;
    }   
    
    public String getName()
    {
        return name;
    }
}

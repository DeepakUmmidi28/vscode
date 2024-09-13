package Lambda;

public class isStudentName implements FilterStudents{

    @Override
    public boolean test(Student student) {
       return student.getName()=="Deepak";
    }
    
}

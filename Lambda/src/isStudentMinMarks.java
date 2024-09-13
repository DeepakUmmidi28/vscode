import Lambda.MarksEnum.Marks;

public class isStudentMinMarks implements FilterStudents {

    @Override
    public boolean test(Student s) {
        return s.getMarks()==Marks.MAX_MARKS;
    }
    
}

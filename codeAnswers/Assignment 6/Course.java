import java.util.ArrayList;
import java.util.List;

public class Course<C, S extends Student<?>> {
    private C courseCode;
    private List<S> students;

    public Course(C courseCode){
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }
    public void addStudent(S student){
        students.add(student);
    }
    public C getCourseCode(){
        return courseCode;
    }
    public List<S> getStudents(){
        return students;
    }

    public void displayInfo(){
        System.out.println("Course code: " + getCourseCode());
        for(S s: getStudents()){
            s.displayInfo();
        }
    }
}

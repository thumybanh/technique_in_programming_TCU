import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Student<Integer> student1 = new Student<>(4531, "John", 9.8);
        GraduateStudent gradStudent1 = new GraduateStudent("GS2235", "Amber", 9.3, "Thesis");

        Course<String, GraduateStudent> course = new Course<>("G9BBG");

        course.addStudent(gradStudent1);
        course.displayInfo();

        ArrayList<Student<?>> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(gradStudent1);

        ArrayList<GraduateStudent> graduateStudentArrayList = new ArrayList<>();
        graduateStudentArrayList.add(gradStudent1);

        String[] nameStudent = new String[]{"mia", "marcus","andy","elmo"};

        System.out.println("This is printAll method:");
        UniversityUtils.printAll(arrayList);
        System.out.println("");
        System.out.println("This is addGraduateStudent method");
        UniversityUtils.addGraduateStudent(graduateStudentArrayList);
        System.out.println("");
        System.out.println("this is print id method");
        UniversityUtils.printIds(arrayList);
        System.out.println("");
        System.out.println("This is print person method");
        UniversityUtils.printPerson(gradStudent1);
        System.out.println("");
        System.out.println("This is print array method");
        UniversityUtils.printArray(nameStudent);
        System.out.println("");
        System.out.println("This is print students method");
        UniversityUtils.printStudents(arrayList);






    }
}

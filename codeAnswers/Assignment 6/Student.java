public class Student<ID> extends Personn<ID> {
    protected double gpa;

    public Student(ID id, String name, double gpa){
        super(id, name);
        this.gpa = gpa;
    }

    public double getGPa(){
        return gpa;
    }
    @Override
    public void displayInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n" + name +"'s GPA: " + gpa);
    }
}

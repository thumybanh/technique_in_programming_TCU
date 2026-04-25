public class GraduateStudent extends Student<String>{
    private String thesisTitle;

    public GraduateStudent(String id, String name, double gpa, String thesisTitle){
        super(id,name,gpa);
        this.thesisTitle = thesisTitle;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Thesis title: " + thesisTitle);
    }
}

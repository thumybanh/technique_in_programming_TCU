public class Person {
    private String name;
    private String address;
    private String phone;
    // constructor with no args (set up a default value for each components)
    public Person(){
        name = "Unknown";
        address = "Unknown";
        phone = "000-000-0000";
    }
    //constructor with args
    public Person(String n, String a, String p){
        name = n;
        address = a;
        phone = p;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setPhone(String p){
        phone = p;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }
}

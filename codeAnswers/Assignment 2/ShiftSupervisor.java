public class ShiftSupervisor extends Employee {
    private double salary;
    private double bonus;

    public ShiftSupervisor(String n, String num, String date, double sal, double b){
        super(n, num, date);
        salary = sal;
        bonus = b;
    }
    public ShiftSupervisor(){

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "\nSalary: " + salary + "\nBonus: " + bonus;
    }
}

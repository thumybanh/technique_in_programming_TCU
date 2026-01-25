/**
 * The ShiftSupervisor class represents a salaried employee
 * who earns an annual salary and may receive a bonus.
 *
 * This class extends the Employee class.
 */
public class ShiftSupervisor extends Employee {
    /** The supervisor's annual salary. */
    private double salary;
    /** The supervisor's annual bonus. */
    private double bonus;

    /**
     * Constructs a ShiftSupervisor object with the specified values.
     *
     * @param n    The employee's name
     * @param num  The employee's employee number
     * @param date The employee's hire date
     * @param sal  The supervisor's annual salary
     * @param b    The supervisor's annual bonus
     */
    public ShiftSupervisor(String n, String num, String date, double sal, double b){
        super(n, num, date);
        salary = sal;
        bonus = b;
    }

    /**
     * Default constructor that creates a ShiftSupervisor with no initial values.
     */
    public ShiftSupervisor(){
    }

    /**
     * Returns the supervisor's bonus.
     *
     * @return The bonus amount
     */
    public double getBonus() {
        return bonus;
    }
    /**
     * Sets the supervisor's bonus.
     *
     * @param bonus The bonus amount
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    /**
     * Returns the supervisor's salary.
     *
     * @return The annual salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Sets the supervisor's salary.
     *
     * @param salary The annual salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    /**
     * Returns a string representation of the ShiftSupervisor object,
     * including employee information, salary, and bonus.
     *
     * @return A formatted string describing the ShiftSupervisor
     */
    public String toString(){
        return super.toString() + "\nSalary: " + salary + "\nBonus: " + bonus;
    }
}

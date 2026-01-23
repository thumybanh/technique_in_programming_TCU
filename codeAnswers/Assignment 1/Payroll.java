import java.util.*;

/**
 * Represents a payroll system for a fixed number of employees.
 *
 * This program stores employee IDs, hours worked, pay rates, and wages.
 * It allows the user to input hours and pay rates, then calculates and
 * displays each employee's gross wage.
 *
 * @author mybanh
 * @version 1.0
 * @since 2026-01-15
 */
public class Payroll {
    /** Total number of employees in the payroll system. */
    private static final int NUM_EMPLOYEES = 7;

    /** Stores the employee ID numbers. */
    private int[] employeeId;

    /** Stores the number of hours worked by each employee. */
    private int[] hours;

    /** Stores the hourly pay rate for each employee. */
    private double[] payRate;

    /** Stores the calculated gross wages for each employee. */
    private double[] wages;

    /**
     * Constructs a Payroll object and initializes arrays.
     * Employee IDs are preset, while hours, pay rates, and wages are initialized to default values.
     */
    public Payroll(){
        employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        hours = new int[NUM_EMPLOYEES];
        payRate = new double[NUM_EMPLOYEES];
        wages = new double[NUM_EMPLOYEES];
    }

    /**
     * Sets the number of hours worked for an employee.
     * @param i the index of the employee
     * @param h the number of hours worked
     */
    public void setHoursAt(int i, int h){
        hours[i] = h;
    }

    /**
     * Sets the pay rate for an employee.
     *
     * @param i the index of the employee
     * @param p the hourly pay rate
     */
    public void setPayRateAt(int i, double p){
        payRate[i] = p;
    }

    /**
     * Sets the wage for an employee.
     *
     * @param i the index of the employee
     * @param w the calculated wage
     */
    public void setWagesAt(int i, double w){
        wages[i] = w;
    }

    /**
     * Returns the employee ID at a given index.
     *
     * @param i the index of the employee
     * @return the employee ID
     */
    public int getEmployeeIdAt(int i){
        return employeeId[i];
    }

    /**
     * Returns the hours worked for an employee.
     *
     * @param i the index of the employee
     * @return hours worked
     */
    public int getHoursAt(int i){
        return hours[i];
    }

    /**
     * Returns the pay rate for an employee.
     *
     * @param i the index of the employee
     * @return pay rate
     */
    public double getPayRateAt(int i){
        return payRate[i];
    }

    /**
     * Returns the calculated wage for an employee.
     *
     * @param i the index of the employee
     * @return wage
     */
    public double getWagesAt(int i){
        return wages[i];
    }

    /**
     * Calculates and returns the gross wage for a given employee ID.
     * The wage is calculated as hours worked multiplied by pay rate.
     *
     * @param Id the employee ID
     * @return the gross wage of the employee
     */
    public double grossWage(int Id){
        int found_index = -1;
        // Search for the employee ID to find its index
        for (int i = 0; i < employeeId.length; i++) {
            if (Id == employeeId[i]){
                found_index = i;
            }
        }
        if(found_index == -1){
            return -1;
        }
        // Calculate and store the wage
        wages[found_index] =  hours[found_index] * payRate[found_index];
        return wages[found_index];
    }

    /**
     * The main body of the program.
     * Prompts the user to enter hours worked and pay rate for each employee, then displays each employee's ID and gross wage.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Payroll p = new Payroll();

        // Input hours worked and pay rate for each employee
        for (int n = 0; n < p.employeeId.length; n++) {
            System.out.print("Please input the work hours for employee " + p.employeeId[n] + ": ");
            int h = scan.nextInt();

            // Validate hours worked
            while (h < 0) {
                System.out.print("Invalid hours. Please try again: ");
                h = scan.nextInt();
            }
            p.setHoursAt(n, h);

            System.out.print("Please input the pay rate for employee " + p.employeeId[n] + ": ");
            double rate = scan.nextDouble();

            // Validate pay rate
            while (rate < 6.00) {
                System.out.print("Invalid pay rate. Please try again: ");
                rate = scan.nextDouble();
            }
            p.setPayRateAt(n, rate);

        }

        // Display employee IDs and their gross wages
        for (int a = 0; a < p.employeeId.length; a++) {
            System.out.println(p.employeeId[a] + " " + p.grossWage(p.employeeId[a]));
        }
    }
}

/**
 * The ProductionWorker class represents an employee who works
 * a production shift and is paid an hourly rate.
 *
 * This class extends the Employee class and adds information
 * about shift type and pay rate.
 */

public class ProductionWorker extends Employee {
    /** Indicates the employee's shift (1 = day, 2 = night). */
    private int shift;
    /** The employee's hourly pay rate. */
    private double payRate;
    /** Constant representing the day shift. */
    final int DAY_SHIFT = 1;
    /** Constant representing the night shift. */
    final int NIGHT_SHIFT = 2;

    /**
     * Constructs a ProductionWorker object with the specified values.
     * @param n  The employee's name
     * @param num The employee's employee number
     * @param date The employee's hire date
     * @param sh The employee's shift (1 for day, 2 for night)
     * @param rate The employee's hourly pay rate
     */
    public ProductionWorker(String n, String num, String date, int sh, double rate){
        super(n, num, date);
        payRate = rate;
        if(sh <= 2 && sh > 0){
            shift = sh;
        }
    }

    /**
     * Default constructor that creates a ProductionWorker
     * with no initial values.
     */
    public ProductionWorker(){}

    /**
     * Sets the employee's shift.
     *
     * @param s The shift to assign (1 for day, 2 for night)
     */
    public void setShift(int s){
       if(s <= 2 && s > 0){
           shift = s;
       }
    }

    /**
     * Sets the employee's hourly pay rate.
     *
     * @param p The hourly pay rate
     */
    public void setPayRate(double p){
        payRate = p;
    }

    /**
     * Returns the employee's shift.
     *
     * @return The shift value (1 for day, 2 for night)
     */
    public int getShift(){
        return shift;
    }

    /**
     * Returns the employee's hourly pay rate.
     *
     * @return The hourly pay rate
     */
    public double getPayRate(){
        return payRate;
    }


    /**
     * Returns a string representation of the ProductionWorker object,
     * including employee information, shift, and pay rate.
     *
     * @return A formatted string describing the ProductionWorker
     */
    public String toString(){
        int shiftName = 0;
        if (shiftName == DAY_SHIFT){
            shiftName = Integer.parseInt("Day");
        }else if(shiftName == NIGHT_SHIFT){
            shiftName = Integer.parseInt("Night");
        }
        return super.toString() + "\nShift: " + shiftName + "\nHourly pay rate: " + payRate;
    }
}

/**
 * The ProductionWorker class represents an employee who works a production shift and is paid an hourly rate.
 * This class extends the Employee class and adds information about shift type and pay rate.
 *
 * @author mybanh
 * @since 04-21-2026
 * @version 1.0
 *
 */

public class ProductionWorker1 extends Employee3 {
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
    public ProductionWorker1(String n, String num, String date, int sh, double rate){
        super(n, num, date);
        payRate = rate;
        if(sh <= 2 && sh > 0){
            shift = sh;
        }
    }

    /**
     * Default constructor that creates a ProductionWorker
     */
    public ProductionWorker1(){
        super("Unknown", "0000", "No Date");
        shift = 0;
        payRate = 0.0;
    }

    /**
     * Sets the employee's shift.
     *
     * @param s The shift to assign (1 for day, 2 for night)
     */
    public void setShift(int s) throws InvalidShift{
        if( s != 1 && s != 2){
            throw new InvalidShift(s);
        }
        else if(s == 1){
            shift = DAY_SHIFT;
        } else
            shift = NIGHT_SHIFT;

    }

    /**
     * Sets the employee's hourly pay rate.
     *
     * @param p The hourly pay rate
     */
    public void setPayRate(double p) throws InvalidPayrate{
        if (p < 0){
            throw new InvalidPayrate(p);
        }
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
        return super.toString() + "\nShift: " + shift + "\nHourly pay rate: " + payRate;
    }
}

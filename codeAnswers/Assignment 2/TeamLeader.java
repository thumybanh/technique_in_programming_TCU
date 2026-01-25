/**
 * The TeamLeader class represents a production worker who has additional responsibilities, including training requirements
 * and a monthly bonus.
 *
 * This class extends the ProductionWorker class.
 */

public class TeamLeader extends ProductionWorker{
    /** The team leader's monthly bonus. */
    private double monthlyBonus;
    /** The required number of training hours for the team leader. */
    private double requiredTrainingHours;
    /** The number of training hours the team leader has attended. */
    public double trainingHoursAttended;

    /**
     * Constructs a TeamLeader object with the specified values.
     *
     * @param n    The employee's name
     * @param num  The employee's employee number
     * @param date The employee's hire date
     * @param sh   The employee's shift (1 for day, 2 for night)
     * @param rate The employee's hourly pay rate
     * @param mb   The team leader's monthly bonus
     * @param rth  The required number of training hours
     * @param tha  The number of training hours attended
     */
    public TeamLeader(String n, String num, String date, int sh, double rate, double mb, double rth, double tha){
        super(n, num, date, sh, rate);

        if( rth > 0){
            requiredTrainingHours = rth;
        }
        if(tha >= 0){
            trainingHoursAttended = tha;
        }
        if(mb >= 0) {
            monthlyBonus = mb;
        }
    }

    /**
     * Default constructor that creates a TeamLeader with no initial values.
     */
    public TeamLeader(){
    }

    /**
     * Sets the team leader's monthly bonus.
     *
     * @param b The monthly bonus amount
     */
    public void setMonthlyBonus(double b){
        if(b >= 0) {
            monthlyBonus = b;
        }
    }

    /**
     * Sets the required number of training hours.
     *
     * @param p The required training hours
     */
    public void setRequiredTrainingHours(double p){
        if(p > 0){
            requiredTrainingHours = p;
        }
    }

    /**
     * Sets the number of training hours attended.
     *
     * @param t The training hours attended
     */
    public void setTrainingHoursAttended(double t){
        if(t >= 0){
            trainingHoursAttended = t;
        }
    }

    /**
     * Returns the team leader's monthly bonus.
     *
     * @return The monthly bonus
     */
    public double getMonthlyBonus(){
        return monthlyBonus;
    }

    /**
     * Returns the required number of training hours.
     *
     * @return The required training hours
     */
    public double getRequiredTrainingHours(){
        return requiredTrainingHours;
    }

    /**
     * Returns the number of training hours attended.
     *
     * @return The training hours attended
     */
    public double getTrainingHoursAttended(){
        return trainingHoursAttended;
    }

    /**
     * Returns a string representation of the TeamLeader object, including production worker and team leader information.
     *
     * @return A formatted string describing the TeamLeader
     */
    public String toString(){
        return super.toString() + "\nMonthly bonus: " + monthlyBonus + "\n Required training hours: " + requiredTrainingHours + "\nAttended hours: " + trainingHoursAttended;
    }

}

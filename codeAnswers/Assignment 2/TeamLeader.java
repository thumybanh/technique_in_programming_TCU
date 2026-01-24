public class TeamLeader extends ProductionWorker{
    private double monthlyBonus;
    private double requiredTrainingHours;
    public double trainingHoursAttended;

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

    public TeamLeader(){

    }

    public void setMonthlyBonus(double b){
        if(b >= 0) {
            monthlyBonus = b;
        }
    }
    public void setRequiredTrainingHours(double p){
        if(p > 0){
            requiredTrainingHours = p;
        }
    }
    public void setTrainingHoursAttended(double t){
        if(t >= 0){
            trainingHoursAttended = t;
        }
    }
    public double getMonthlyBonus(){
        return monthlyBonus;
    }
    public double getRequiredTrainingHours(){
        return requiredTrainingHours;
    }
    public double getTrainingHoursAttended(){
        return trainingHoursAttended;
    }

    public String toString(){
        return super.toString() + "\nMonthly bonus: " + monthlyBonus + "\n Required training hours: " + requiredTrainingHours + "\nAttended hours: " + trainingHoursAttended;
    }

}

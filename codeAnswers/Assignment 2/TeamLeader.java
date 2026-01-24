public class TeamLeader extends ProductionWorker{
    private double monthlyBonus;
    private int trainingHours;
    private int attendedHours;

    public TeamLeader(String n, String num, String d, int s, double r, double b, int t, int h){
        super(n, num, d, s, r);

        if(t > 0){
            trainingHours = t;
        }
        if(h <= trainingHours){
            attendedHours = h;
        }
        if(b >= 0) {
            monthlyBonus = b;
        }
    }

    public void setBonus(double b){
        if(b >= 0) {
            monthlyBonus = b;
        }
    }
    public void setTrainingHours(int t){
        if(t > 0){
            trainingHours = t;
        }
    }
    public void setAttendedHours(int h){
        if(h <= trainingHours){
            attendedHours = h;
        }
    }
    public double getBonus(){
        return monthlyBonus;
    }
    public int getTrainingHours(){
        return trainingHours;
    }
    public int getAttendedHours(){
        return attendedHours;
    }

}

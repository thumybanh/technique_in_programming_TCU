public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;
    final int DAY_SHIFT = 1;
    final int NIGHT_SHIFT = 2;

    public ProductionWorker(String n, String num, String date, int sh, double rate){
        super(n, num, date);
        payRate = rate;
        if(sh <= 2 && sh > 0){
            shift = sh;
        }
    }

    public ProductionWorker(){

    }

    public void setShift(int s){
       if(s <= 2 && s > 0){
           shift = s;
       }
    }
    public void setPayRate(double p){
        payRate = p;
    }
    public int getShift(){
        return shift;
    }
    public double getPayRate(){
        return payRate;
    }

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

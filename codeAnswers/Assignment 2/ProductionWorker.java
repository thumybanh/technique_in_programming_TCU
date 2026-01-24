public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String n, String num, String d, int s, double r){
        super(n, num, d);
        hourlyPayRate = r;
        if(s <= 2 && s > 0){
            shift = s;
        }
    }

    public void setShift(int s){
       if(s <= 2 && s > 0){
           shift = s;
       }
    }
    public void setHourlyPayRate(double r){
        hourlyPayRate = r;
    }
    public int getShift(){
        return shift;
    }
    public double getHourlyPayRate(){
        return hourlyPayRate;
    }
}

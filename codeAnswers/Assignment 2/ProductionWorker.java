public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(int s, double r){
        super("John Cena", "013-A", "01/05/2026");
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

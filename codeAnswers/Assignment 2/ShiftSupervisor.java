public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double productionBonus;

    public ShiftSupervisor(String n, String num, String d, double s, double b){
        super(n, num, d);
        annualSalary = s;
        productionBonus = b;
    }

    public double getProductionBonus() {
        return productionBonus;
    }

    public void setProductionBonus(double productionBonus) {
        this.productionBonus = productionBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}

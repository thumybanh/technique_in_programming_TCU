public class PreferredCustomer extends Customer{
    private double purchases;
    private double discountLevel;

    // no arg constructor to set up a default value for each components
    public PreferredCustomer(){
        purchases = 0.0;
        discountLevel = 0.0;
    }

    // constructor with args
    public PreferredCustomer(String n, String a, String p, String c, boolean m, double pur){
        super(n,a,p,c,m);
        purchases = pur;
        discountLevel = getDiscountLevel();
    }
    public void setPurchases(double p){
        purchases = p;
    }
    public double getPurchases(){
        return purchases;
    }

    //to validate the discount
    public double getDiscountLevel(){
        if(purchases >= 500 && purchases < 1000){
            return discountLevel = 5.0;
        } else if (purchases >= 1000 && purchases < 1500) {
            return discountLevel = 6.0;
        } else if (purchases >= 1500 && purchases < 2000){
            return discountLevel = 7.0;
        } else if(purchases >= 2000) {
            return discountLevel = 10.0;
        }
        return discountLevel;
    }
    public String toString(){
        return super.toString() + "\nCumulative purchases amount: " + purchases + "\nDiscount base on purchases: " + discountLevel;
    }
}

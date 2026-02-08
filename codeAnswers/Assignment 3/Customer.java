public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;
    // customer class with no args
    public Customer(){
        customerNumber = "unknown";
        mailingList = false;
    }
    // constructor with args
    public Customer(String n, String a, String p, String c, boolean m){
        super(n,a,p);
        customerNumber = c;
        mailingList = m;
    }
    public void setCustomerNumber(String c){
        customerNumber = c;
    }
    public void setMailingList(boolean m){
        mailingList = m;
    }
    public String getCustomerNumber(){
        return customerNumber;
    }
    public boolean getMailingList(){
        return mailingList;
    }
    public String toString(){
        return super.toString() + "\nCustomer Number: " + customerNumber + "\nMailing List: " + mailingList;
    }
}

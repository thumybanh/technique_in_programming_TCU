public class InvalidPayrate extends Exception{
    public InvalidPayrate(double rate){
        super("Pay rate: " + rate + " is invalid. Must be non-negative.");
    }
}

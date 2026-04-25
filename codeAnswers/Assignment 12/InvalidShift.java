public class InvalidShift extends Exception{
    public InvalidShift(int sh){
        super(sh + " is an invalid shift");
    }
}

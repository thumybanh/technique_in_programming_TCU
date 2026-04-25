public class InvalidTestScoreException extends Exception{
    public InvalidTestScoreException(int n, double s){
        super("Element: " + n + " Invalid score: " + s);
    }
}

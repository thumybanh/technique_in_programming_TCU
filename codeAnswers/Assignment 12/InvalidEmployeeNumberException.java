public class InvalidEmployeeNumberException extends Exception{
    public InvalidEmployeeNumberException(String num){
        super("Employee Number: " + num+ " is invalid");
    }
}

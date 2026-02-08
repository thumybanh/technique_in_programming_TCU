import java.util.*;
public class BackwardString {
    public static void backWard(String s) {
        char[] charArray = s.toCharArray();
        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is a string?");
        String s = scan.next();
        BackwardString.backWard(s);
    }
}
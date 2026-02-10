import java.util.*;

/**
 * This program will print out the word chosen by the user in a reverse order.
 * The BackWardString class provides a backWard method to display a string in a reverse order.
 *
 * @author mybanh
 * @since 02-09-2026
 * @Version 1.0
 */
public class BackwardString {
    /**
     * Prints the given string in a reverse order.
     *
     * This method takes a string parameter and converts it into a char array.
     * the loop will iterate the char array to print out the reverse order of the word.
     * @param s the string to be printed backward
     */
    public static void backWard(String s) {
        char[] charArray = s.toCharArray();
        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

    // this is the main program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is a string?");
        String s = scan.next();
        // call the method to take the argument s as a parameter for the method.
        BackwardString.backWard(s);
    }
}
import java.util.*;

/**
 * This program will display two shapes (inverse triangle and diagonal ladder) base on how many lines a user wished.
 *
 * @author mybanh
 * @version 1.0
 * @since 2026-01-14
 */

public class PrintShape {
    /**
     * Prints an inverse triangle using '*' characters.
     * Row 1 contains n stars, and each subsequent row contains one fewer star.
     *
     * @param n the number of lines to print
     */
    public static void printShape1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = n; stars >= row; stars--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * Prints a ladder pattern using '#' characters.
     * The spaces between the two '#' characters increase on each line.
     *
     * @param n the number of lines to print
     */
    public static void printShape2(int n){
        for(int row = 1; row <= n; row++){
            System.out.print("#");
            for(int space = 1; space <= (row-1); space++){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println("");
        }
    }

    /**
     * The main body of the program.
     * Prompts the user to enter the number of lines to print, then displays an inverse triangle shape and a diagonal ladder shape using that value.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many lines do you want to print?: ");
        int numOfLines = scan.nextInt();
        printShape1(numOfLines);
        printShape2(numOfLines);
    }

}

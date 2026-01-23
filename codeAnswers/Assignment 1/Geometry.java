import java.util.*;

/**
 * Calculates the area of three different shapes (circle, rectangle, triangle)
 * This class provides three methods to compute the area of each shape.
 *
 * @author mybanh
 * @version 1.0
 * @since 2026-01-16
 */
public class Geometry {

    /**
     * Calculates the area of a circle given its radius.
     *
     * @param r the radius of the circle
     * @return the area of the circle, or -1 to signal as an error if the radius is negative
     */
    public static double circleArea(double r){
        if(r < 0){
            System.out.println("Error: Cannot input negative number for radius");
            return -1;
        }
        return Math.PI * (Math.pow(r, 2));
    }

    /**
     * Calculates the area of a rectangle given its length and width
     * @param len the length of the rectangle
     * @param w the width of the rectangle
     * @return the area of a rectangle, or -1 to signal as an error if either the length or width is negative
     */

    public static double rectangleArea(double len, double w){
        if(len < 0 || w < 0){
            System.out.println("Error: Cannot input negative number for length or width");
            return -1;
        }
        return len * w;
    }

    /**
     * Calculates the area of a triangle given its base and height
     * @param base the base of a triangle
     * @param h the height of a triangle
     * @return the area of a triangle, or -1 to signal an error if either the base or height is negative
     */

    public static double triangleArea(double base, double h){
        if(base < 0 || h < 0){
            System.out.println("Error: Cannot input negative number for base or height");
            return -1;
        }
        return base * h * 0.5;
    }

    /**
     * Main body for the Geometry Calculator program.
     * Displays a menu that allows the user to calculate the area of a circle, rectangle, or triangle.
     * The program continues to run until the user chooses the Quit option.
     *
     * User input is validated to ensure menu choices are within range.
     * Area calculation methods display error messages when negative values are entered.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //  Displays the menu for user to choose.
        System.out.println("Geometry Calculator");

        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit");
        System.out.println("Enter your choice (1-4)");

        int choice = scan.nextInt();

        // Ensure that user pick number from the range of 1-4
        while(choice < 1 || choice > 4){
            System.out.println("Error: out of range (pick your choice from 1-4).");
            choice = scan.nextInt();
        }
        // The menu will continue to display until the user chooses option 4 to quit.
        while(choice!=4){
            switch(choice){
                case 1:
                    System.out.print("Enter the radius: ");
                    double radius = scan.nextDouble();
                    double areaCircle = circleArea(radius);
                    if (areaCircle != -1) {
                        System.out.printf("Area of the circle is " + "%.3f%n", areaCircle);
                    }
                    break;

                case 2:
                    System.out.print("Enter length number: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width number: ");
                    double width = scan.nextDouble();
                    double areaRec = rectangleArea(length, width);
                    if(areaRec != -1) {
                        System.out.println("Area of the rectangle is " + areaRec);
                    }
                    break;

                case 3:
                    System.out.print("Enter the base number: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter the height number: ");
                    double height = scan.nextDouble();
                    double areaTri = triangleArea(base, height);
                    if(areaTri != -1) {
                        System.out.println("Area of the triangle is " + areaTri);
                    }
                    break;

                case 4:
                    break;
            }
            System.out.println("");
            System.out.println("Geometry Calculator");

            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            System.out.println("Enter your choice (1-4)");

            choice = scan.nextInt();
        }

    }
}

import java.util.*;
public class EssayProgram {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        // ask user for the input scores for each component. The program also validate the
        // score from each component as well.
        System.out.println("grammar: ");
        double g = scan.nextDouble();
        while(g>30 || g<0){
            System.out.println("Invalid input, try again.");
            g = scan.nextDouble();
        }
        System.out.println("spelling: ");
        double s = scan.nextDouble();
        while(s>20 || s<0){
            System.out.println("Invalid input, try again.");
            s = scan.nextDouble();
        }
        System.out.println("correct length: ");
        double l = scan.nextDouble();
        while(l>20 || l<0){
            System.out.println("Invalid input, try again.");
            l = scan.nextDouble();
        }
        System.out.println("content: ");
        double c = scan.nextDouble();
        while(c>30 || c<0){
            System.out.println("Invalid input, try again.");
            c = scan.nextDouble();
        }

        // call the essay class
        Essay essay = new Essay(g,s,l,c);
        System.out.println("total score out of hundred: " + essay.getScore());
        System.out.println("Letter grade for this assignment: " + essay.getGrade());

    }
}

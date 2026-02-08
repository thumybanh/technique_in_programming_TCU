import java.util.*;
public class mainTest_4to6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        CourseGrades grade = new CourseGrades();

        System.out.println("How many missed questions in the final exam out of 50: ");
        int missed = scan.nextInt();
        FinalExam finalExam = new FinalExam(50, missed);
        grade.setFinalExam(finalExam);

        System.out.println("Grammar point for the essay: ");
        double grammarScore = scan.nextDouble();
        while(grammarScore>30 || grammarScore < 0){
            System.out.println("Invalid input, try again.");
            grammarScore = scan.nextDouble();
        }
        System.out.println("spelling point for the essay: ");
        double spellingScore = scan.nextDouble();
        while(spellingScore>20 || spellingScore < 0){
            System.out.println("Invalid input, try again.");
            spellingScore = scan.nextDouble();
        }
        System.out.println("Correct length point for the essay: ");
        double lengthScore = scan.nextDouble();
        while(lengthScore>20 || lengthScore < 0){
            System.out.println("Invalid input, try again.");
            lengthScore = scan.nextDouble();
        }
        System.out.println("Content point for the essay: ");
        double contentScore = scan.nextDouble();
        while(contentScore>30 || contentScore < 0){
            System.out.println("Invalid input, try again.");
            contentScore = scan.nextDouble();
        }

        Essay essay = new Essay(grammarScore, spellingScore, lengthScore,contentScore);
        grade.setEssay(essay);


        System.out.println("what is the numeric score for lab? ");
        double labScore = scan.nextDouble();
        LabActivity lab = new LabActivity("Teacher", labScore);
        grade.setLab(lab);


        System.out.println("How many missed questions out of 10?: ");
        int passFailMissed = scan.nextInt();
        PassFailExam passFailExam = new PassFailExam(10, passFailMissed, 70);
        grade.setPassFailExam(passFailExam);

        System.out.println(grade.toString());
    }
}

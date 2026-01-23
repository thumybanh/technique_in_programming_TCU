import java.util.*;
public class question1_test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scan.next();
        System.out.println("Employee Number: ");
        String employeeNumber = scan.next();
        System.out.println("Hired date: ");
        String hiredDate = scan.next();

        System.out.println("Which shift? (1 for day, 2 for night): ");
        int shift = scan.nextInt();
        System.out.println("Hourly pay rate : ");
        double payRate = scan.nextDouble();

        ProductionWorker worker = new ProductionWorker(shift, payRate);
        System.out.println(worker.getEmployeeName());
        System.out.println(worker.getFullEmployeeNumber());
        System.out.println(worker.getHireDate());
        System.out.println(worker.getShift());
        System.out.println(worker.getHourlyPayRate());

    }
}
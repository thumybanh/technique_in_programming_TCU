import java.util.*;
public class question1_test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Employee Number: ");
        String employeeNumber = scan.next();


        System.out.println("Please enter the hire date in MM/DD/YYYY format: ");
        String hiredDate = scan.next();

        boolean validDate = false;
        while(!validDate) {
            String month = hiredDate.substring(0, 2);
            int monthNum = Integer.parseInt(month);
            String day = hiredDate.substring(3, 5);
            int dayNum = Integer.parseInt(day);

            if (monthNum < 1 || monthNum > 12
                    || dayNum < 1 || dayNum > 31) {
                System.out.println("Invalid date, try again:");
                System.out.println("Please enter the hire date in MM/DD/YYYY format: ");
                hiredDate = scan.next();

            } else validDate = true;
        }

        System.out.println("Which shift? (1 for day, 2 for night): ");
        int shift = scan.nextInt();
        System.out.println("Hourly pay rate : ");
        double payRate = scan.nextDouble();

        ProductionWorker worker = new ProductionWorker(name, employeeNumber, hiredDate, shift, payRate);


        System.out.println("Search for an employee: ");
        System.out.println("Enter employee number: ");
        String searchEmployee = scan.next();
        if(searchEmployee.equals(worker.getEmployeeNumber())){
           System.out.println(worker.toString());
        }
        else System.out.println("Invalid employee number or employee number does not exist.");



    }
}
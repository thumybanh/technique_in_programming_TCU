import java.util.*;
public class question2_test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //basic info of a supervisor
        System.out.println("Name of the supervisor: ");
        String name = scan.nextLine();
        System.out.println("Employee number: ");
        String num = scan.next();
        System.out.println("Please enter the hire date in MM/DD/YYYY format: ");
        String hiredDate = scan.next();

        // validate the date in the format of MM/DD/YYYY
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

        // specifically for supervisor
        System.out.println("Supervisor's salary: ");
        double salary = scan.nextDouble();
        System.out.println("Supervisor's bonus: ");
        double bonus = scan.nextDouble();

        ShiftSupervisor supervisor1 = new ShiftSupervisor(name, num, hiredDate, salary, bonus);

        System.out.println("Search for supervisor: ");
        System.out.println("Enter employee number: ");
        String searchEmployee = scan.next();
        if(searchEmployee.equals(supervisor1.getEmployeeNumber())){
            System.out.println(supervisor1.toString());
        }
        else System.out.println("Invalid employee number or employee number");
    }
}

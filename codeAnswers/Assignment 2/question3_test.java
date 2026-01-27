import java.util.*;
public class question3_test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // basic info of the team leader
        System.out.println("Name of the team leader: ");
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
        System.out.println("Which shift? (1 for day, 2 for night): ");
        int shift = scan.nextInt();
        System.out.println("Hourly pay rate : ");
        double payRate = scan.nextDouble();

        // specifically made for team leader
        System.out.println("Team leader's monthly bonus: ");
        double bonus = scan.nextDouble();
        System.out.println("Required training hours: ");
        double th = scan.nextDouble();
        System.out.println("Attended training hours: ");
        double ath = scan.nextDouble();


        TeamLeader teamleader = new TeamLeader(name,num,hiredDate,shift,payRate,bonus,th,ath);
        System.out.println("Search for team leader: ");
        System.out.println("Enter employee number: ");
        String searchEmployee = scan.next();
        if(searchEmployee.equals(teamleader.getEmployeeNumber())){
            System.out.println(teamleader.toString());
        }
        else System.out.println("Invalid employee number or employee number");
    }
}

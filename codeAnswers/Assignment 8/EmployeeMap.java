import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Map<String, employeee> employeeInfo = new HashMap<>();

        employeeInfo.put("CVM123", new employeee("CVM123", "Jay"));
        employeeInfo.put("CCGTHE123", new employeee("CCGTHE123", "kim"));
        employeeInfo.put("TADA526", new employeee("TADA526", "kim"));


        System.out.println("Employee Lookup by ID: ");
        String person = scan.next();

        System.out.println(employeeInfo.get(person));


    }



}

import java.util.*;
public class mainTest_7to8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the customer's name: ");
        String name = scan.nextLine();
        System.out.println("What is " + name + "'s address: ");
        String address = scan.nextLine();
        System.out.println("What is " + name + "'s phone number: ");
        String phone = scan.nextLine();
        System.out.println("What is " + name + "'s customer number: ");
        String customerNumber = scan.nextLine();
        System.out.println("Does " + name + " want to join the mailing list? (yes or no): ");
        String answer = scan.next();
        boolean m;
        if (answer.equalsIgnoreCase("yes")) {
            m = true;
        } else m = false;

        Customer customer = new Customer(name, address, phone, customerNumber, m);


        System.out.println("What is your cumulative purchases amount: ");
        double cumulativePurchase = scan.nextDouble();

        PreferredCustomer customer1 = new PreferredCustomer(name, address, phone, customerNumber, m, cumulativePurchase);
        System.out.println(customer1.toString());
    }
}

import java.util.*;
public class ExceptionProjectProblemDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ProductionWorker1 em = new ProductionWorker1();
        System.out.println("Name of the employee: ");
        String name = scan.next();
        em.setName(name);

        try{
            System.out.println("Employee number: ");
            String num = scan.next();
            em.setEmployeeNumber(num);
        } catch (InvalidEmployeeNumberException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Employee shift: ");
            String shift = scan.next();
            em.setShift(Integer.parseInt(shift));
        } catch(NumberFormatException e){
            System.out.println("Shift should be a number. Invalid shift");
        } catch (InvalidShift e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Employee pay rate: ");
            String payrate = scan.next();
            em.setPayRate(Double.parseDouble(payrate));
        } catch(NumberFormatException e){
            System.out.println("Pay rate should be a number. Invalid input.");
        } catch (InvalidPayrate e){
            System.out.println(e.getMessage());
        }

        System.out.println(em.toString());

    }
}

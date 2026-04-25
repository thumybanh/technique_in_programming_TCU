import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> primeNum = new ArrayList<>();
        for(int i = 2; i <= 100; i++){
            boolean prime = true;

            for(int j = i-1; j >= 2 ; j--) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                primeNum.add(i);
            }
        }
        ListIterator<Integer> divisor = primeNum.listIterator();

        while (divisor.hasNext()) {
            System.out.println(divisor.next());
        }
    }
}

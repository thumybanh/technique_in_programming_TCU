import java.util.*;
import java.util.function.*;

public class Exercise4Demo {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4,3,2,6,4));
        UnaryOperator<Integer> DoubleInt = num -> num * 2;
        BinaryOperator<Integer> sumInt = (a,b) -> a + b;
        System.out.println(MathUtility.processAndReduce(numbers,DoubleInt, sumInt));
    }
}

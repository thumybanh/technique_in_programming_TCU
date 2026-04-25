import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class MathUtility {
    public static <T> T processAndReduce(List<T> items, UnaryOperator<T> transformer, BinaryOperator<T> reducer){
        return items.stream().map(transformer).reduce(reducer).orElse(null);
    }
}

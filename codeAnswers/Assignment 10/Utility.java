import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class Utility {
    public static <T,K> Map<K, List<T>> groupListBy(List<T> items, Function<T,K> classifier){
        return items.stream().collect(Collectors.groupingBy(classifier));
    }
}

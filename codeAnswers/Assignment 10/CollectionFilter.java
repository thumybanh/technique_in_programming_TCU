import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * A utility class that provides generic collection filtering.
 *
 * @author mybanh
 * @since 04-07-2026
 * @version 1.0
 */
public class CollectionFilter{
    /**
     * Filters a list based on a given predicate condition.
     * @param items
     * @param condition
     * @return a new list containing only elements that match the condition
     * @param <T>
     */
    public static <T> List<T> filterList(List<T> items, Predicate<T> condition){
        return items.stream().filter(condition).collect(Collectors.toList());
    }

}

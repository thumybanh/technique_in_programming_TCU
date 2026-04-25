import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.*;

public class DataProcessor<T>{
    public double calculateAverage(List<T> data, Function<T, Double> valueExtractor){
        return data.stream().mapToDouble(valueExtractor::apply).average().orElse(0.0);
    }
}

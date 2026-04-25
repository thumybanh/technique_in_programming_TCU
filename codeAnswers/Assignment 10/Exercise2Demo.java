import java.util.*;
import java.util.stream.*;

public class Exercise2Demo {
    public static void main(String[] args){
        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product("Laptop", 1999.9));
        product.add(new Product("Ipad", 567.9));
        product.add(new Product("Macbook", 3000.5));

        DataProcessor<Product> dp = new DataProcessor<>();

        double average = dp.calculateAverage(product, p -> p.getPrice());

        System.out.println("products: " + product);
        System.out.printf("Average price: " + "%.2f",average);
    }
}

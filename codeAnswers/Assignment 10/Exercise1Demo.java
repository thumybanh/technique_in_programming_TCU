import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1Demo {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Lucy");
        names.add("Miffy");
        names.add("Andrew");

        Predicate<String> legit = n -> n.startsWith("A");

        System.out.print("Filtered List: " + CollectionFilter.filterList(names, legit));
        System.out.println("");
        System.out.print("Original List: " + names);

    }

}

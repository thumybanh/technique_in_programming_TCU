import java.util.*;
import java.util.stream.Collectors;

public class Exercise3Demo {
    public static void main(String[] args){
        List<Employee2> e = new ArrayList<>();
        e.add(new Employee2("John", "HR", 4093));
        e.add(new Employee2("Alice", "HR", 5000));
        e.add(new Employee2("Dave", "IT", 6394));

        var m = Utility.groupListBy(e, p -> p.getDepartment());
        for(Map.Entry<String, List<Employee2>> m1 : m.entrySet() ){
            List<String> names = m1.getValue().stream().map(person -> person.getName()).collect(Collectors.toList());
            System.out.println(m1.getKey() + " - " + names);
        }




    }
}

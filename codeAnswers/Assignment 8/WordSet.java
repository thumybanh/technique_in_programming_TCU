import java.util.*;
public class WordSet {
    public static void main(String[] args){
        Set<String> Sorted = new TreeSet<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("give me a sentence: ");
        String line = scan.nextLine();
        Sorted.addAll(Arrays.asList(line.split(" ")));
        System.out.println(Sorted);

    }
}

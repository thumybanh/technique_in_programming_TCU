import java.sql.Array;
import java.util.*;

import static java.util.stream.Collectors.*;

public class JavaStreamAPI {
    public static void main(String[] args) {
        /// 1. Create custom collector
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//        ListIterator<String> wordsIterator = words.listIterator();
//
//        while(wordsIterator.hasNext()){
//            String word = wordsIterator.next();
//            System.out.print(word);
//            if(wordsIterator.hasNext()){
//                System.out.print(", ");
//            }
//        }

        /// 2. Remove null values
//        List<String> words1 = Arrays.asList("Java", null, "Stream", null, "API");
//        ListIterator<String> w = words1.listIterator();
//
//        System.out.print("[");
//        boolean first = true;
//        while(w.hasNext()){
//            String word1 = w.next();
//
//            if(word1 != null) {
//                if(!first){
//                    System.out.print(", ");
//                }
//                System.out.print(word1);
//                first = false;
//            }
//
//        }
//        System.out.print("]");

        /// 3. Calculate Average of Numbers
//        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
//        int sum = 0;
//        for(int i = 0; i<numbers.size(); i++){
//            sum += numbers.get(i);
//        }
//        double average = (double) sum / numbers.size();
//        System.out.println(average);

        /// 4. Collect map from list
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//        Map<String, Integer> word_num = new HashMap<>();
//        for(int i = 0 ; i < words.size(); i++) {
//            word_num.put(words.get(i), words.get(i).length());
//        }
//        System.out.println(word_num);

        /// 5. Find Nth largest element in a list | sort and then take the thirdth digit
//        List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 30);
//        Collections.sort(numbers);
//        System.out.println(numbers.get(2));

        /// 6. Find all palindromic strings
//        List<String> words = Arrays.asList("radar", "level", "world", "java");
//        List<String> palindrome = new ArrayList<>();
//        for(String word : words){
//            StringBuilder s = new StringBuilder(word).reverse();
//            if(s.toString().equals(word)){
//               palindrome.add(word);
//            }
//        }
//        System.out.print(palindrome);


        /// 7. Reverse each string in a list
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//        List<String> reverseWord = new ArrayList<>();
//        for(String word : words){
//            StringBuilder reverseEach = new StringBuilder(word).reverse();
//            reverseWord.add(reverseEach.toString());
//        }
//        System.out.print(reverseWord);

        /// 8. Filter and Convert Map to List
//        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
//        List<String> keys = new ArrayList<>();
//
//        Set<Map.Entry<String, Integer>> values = map.entrySet();
//        for(Map.Entry<String, Integer> value : values){
//            if(value.getValue() > 10){
//                keys.add(value.getKey());}
//        }
//        System.out.print(keys);

        /// 9. Remove Duplicates Without Collectors
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
//        List<Integer> numberSorted = new ArrayList<>();
//        numbers.stream()
//                .distinct()
//                .forEach(numberSorted::add);
//        System.out.print(numberSorted);


        /// 10. Find Common Elements Between Two Lists
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
//
//        List<Integer> sameNum = new ArrayList<>();
//
//        for(int i =0; i < list1.size(); i++) {
//            for (int j = 0; j < i; j++) {
//                if (list2.get(j) == list1.get(i)) {
//                    sameNum.add(list2.get(j));
//                }
//            }
//        }
//        System.out.print(sameNum);

        /// 11. Find the Sum of Squares of Even Numbers
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> evenNum = new ArrayList<>();
//        int sum = 0;
//        for(int i = 0 ; i < numbers.size(); i++){
//            if(numbers.get(i) % 2 == 0){
//                evenNum.add((int) Math.pow(numbers.get(i),2));
//            }
//        }
//        for(int n : evenNum){
//            sum += n;
//        }
//        System.out.print(sum);

        /// 12. Find the Longest Word from a Sentence
//        String sentence = "Java Stream API is very powerful";
//        String[] c = sentence.split(" ");
//        Stream<String> wordStream = Arrays.stream(c);
//        System.out.print(wordStream.max(Comparator.comparingInt(String::length)).orElse(""));

        /// 13.  Find Top N Highest Scoring Students
//        class Student {
//            String name;
//            int score;
//            Student(String name, int score) {
//                this.name = name; this.score = score;
//            }
//        }
//        List<Student> students = Arrays.asList(
//                new Student("Alice", 85),
//                new Student("Bob", 92),
//                new Student("Charlie", 88),
//                new Student("Dave", 78),
//                new Student("Eve", 91)
//        );
//
//        List<String> top3Names = students.stream()
//                .sorted(Comparator.comparingInt((Student student) -> student.score).reversed())
//                .limit(3)
//                .map(student-> student.name)
//                .toList();
//        System.out.print(top3Names);

        ///14. Group by First Character
//        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
//        Map<Character, List<String>> group = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
//        System.out.print(group);

        /// 15. Custom Reduce to Concatenate Strings
//        List<String> words = Arrays.asList("Stream", "API", "is", "awesome");
//        Collections.reverse(words);
//        System.out.print(words.stream().reduce((x, y) -> x + " " + y).get());

        /// 16. Calculate the Product of All Numbers
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.print(numbers.stream().reduce((x,y)-> x * y).get());

        /// 17. Find Non-Repeating Characters in a String
//        String input = "swiss";
//        List<Character> character = new ArrayList<>();
//        Map<Character, Long> charCount = input.chars().mapToObj(ch -> (char) ch).collect(groupingBy(ch -> ch, LinkedHashMap::new, counting()));
//
//       Set<Map.Entry<Character, Long>> K= charCount.entrySet();
//        for(Map.Entry<Character, Long> k : K){
//            if(k.getValue() == 1) {
//                character.add(k.getKey());
//            }
//        }
//        System.out.print(character);

        ///18. Find Duplicate Elements in a List
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
//
//        List<Integer> num = new ArrayList<>();
//        Map<Integer, Long> FindDupeNum = numbers.stream().collect(groupingBy(n -> n, counting()));
//        for(Map.Entry<Integer, Long> N : new TreeMap<>(FindDupeNum).entrySet()){
//            if(N.getValue() > 1) {
//                num.add(N.getKey());
//            }
//        }
//        System.out.print(num);

        /// 19.Convert Map to List of Key-Value Pairs
//        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
//        List<String> list = new ArrayList<>();
//
//        for(Map.Entry<String, Integer> sortit : new TreeMap<>(map).entrySet()){
//            list.add(sortit.getKey() + "=" + sortit.getValue());
//        }
//        System.out.print(list);















    }
}

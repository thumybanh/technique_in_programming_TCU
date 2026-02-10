import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MiscellaneousString {
    public static int WordCount(String s){
        String[] str = s.split(" ");
        int count = 0;
        for(String j : str){
            count++;
        }
        return count;
    }
    public static String arrayToString(char[] c){
        return String.valueOf(c).replace(" ", "")
                                .replace(",","");
    }
    public static ArrayList<Character> mostFrequent(String s) {
        char[] toCharArr = s.toLowerCase().toCharArray();
        int[] counter = new int[26]; //a = 0 b = 2 .... z = 25 | the current slot are all 0
        int largestCount = 0;
        char largestCharr = toCharArr[0];
        ArrayList<Character> frequentLetters = new ArrayList<>();

        int current = 0;
        for (int i = 0; i < toCharArr.length; i++) {
            current = toCharArr[i] - 'a'; // 'a' is 97 in ascii, to get index from 0-26, we need to minus
            counter[current]++;
            if (counter[current] > largestCount) {
                largestCount = counter[current];
                largestCharr = toCharArr[i];
                frequentLetters.clear(); // to get rid of the previous "biggest" letters to appear
                frequentLetters.add(largestCharr);
            } else if (counter[current] == largestCount && !frequentLetters.contains(toCharArr[i])) {
                largestCount = counter[current];
                largestCharr = toCharArr[i];
                frequentLetters.add(largestCharr);
            }
        }
        return frequentLetters;
    }

    public static String replaceSubstring(String string1, String string2, String string3){
        String[] strSplit = string1.split(" ");
        strSplit[0] = string2;
        return String.join(" ", strSplit).replace(string2, string3);
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("String for word count?");
        String s = scan.nextLine();

        System.out.println(WordCount(s));

        System.out.println("Array of character?");
        char[] character = scan.nextLine().toCharArray();
        System.out.println(arrayToString(character));




        System.out.println("Sentence?");
        String a = scan.nextLine();
        System.out.println("to replace the first word?");
        String word = scan.next();

        String[] component = a.split(" ");
        String firstWord = String.valueOf(component[0]);
        System.out.println(replaceSubstring(a, firstWord, word));


        System.out.println("Give me a string to check for the most frequent letter in the string/word:");
        String string = scan.next();
        System.out.print(mostFrequent(string));

    }
}

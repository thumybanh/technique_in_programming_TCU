import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MiscellaneousString {
//    public static int WordCount(String s){
//        String[] str = s.split(" ");
//        int count = 0;
//        for(String j : str){
//            count++;
//        }
//        return count;
//    }
//    public static String arrayToString(char[] c){
//        return String.valueOf(c).replace(" ", "")
//                                .replace(",","");
//    }
    public static char mostFrequent(String s){
//        char[] toChar = s.toCharArray();
//        ArrayList<Character> charArr = new ArrayList<>();
//        for(int i = 0; i < toChar.length-1 ; i++){
//            for(int j = 0; j <= i; j++){
//                if(toChar[j] == toChar[i]) {
//                    charArr.add(toChar[j]);
//                }
//            }
//        }

//        for(int j = 0; j < charArr.size(); j++){
//
//        }

        HashMap<Integer, Character> keyToValue = new HashMap<>();
        char[] toArr = s.toCharArray();
        char start = toArr[0];
        int num = 1;
        for(int i = 0; i < toArr.length-1; i++){
            if (keyToValue.containsValue(start)) {
                keyToValue.put(num+=1, toArr[i]);
                start = toArr[i];
            }
            else keyToValue.put(1, toArr[i]);
            
        }
        int maxN = keyToValue.get(0);
        for(int j : keyToValue.keySet()){
            if(keyToValue.get(j) > maxN){
                maxN = keyToValue.get(j);
            }
        }
        return keyToValue.get(maxN);
    }
//    public static String replaceSubstring(String string1, String string2, String string3){
//        String[] strSplit = string1.split(" ");
//        strSplit[0] = string2;
////        return (Arrays.toString(strSplit).replace(string2, string3)).replace("[","")
////                                                                    .replace("]","")
////                                                                    .replace(",","");
//        return String.join(" ", strSplit).replace(string2, string3);
//    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        System.out.println("String?");
//        String s = scan.nextLine();
//
//        System.out.println(WordCount(s));
//
//        System.out.println("Array of character?");
//        char[] character = scan.nextLine().toCharArray();
//        System.out.println(arrayToString(character));
//
//
//
//
//        System.out.println("Sentence?");
//        String a = scan.nextLine();
//        System.out.println("to replace the first word?");
//        String word = scan.next();
//
//        String[] component = a.split(" ");
//        String firstWord = String.valueOf(component[0]);
//        System.out.println(replaceSubstring(a, firstWord, word));


        System.out.println("Give me a string:");
        String word = scan.next();
        System.out.print(mostFrequent(word));

    }
}

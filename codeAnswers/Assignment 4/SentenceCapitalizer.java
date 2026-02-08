import java.util.*;
public class SentenceCapitalizer {
    public static String capitalizer(String s) {
        char[] charArr = s.toCharArray();

        if (Character.isLowerCase(charArr[0])){
            charArr[0]=Character.toUpperCase(charArr[0]);
        }
        for(int i = 0; i < charArr.length-1; i++){
            if(charArr[i] == '.') {
                charArr[i+2]=Character.toUpperCase(charArr[i+2]);
            }
        }
        return String.valueOf(charArr);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a string with a period in the middle of the sentence.");
        String sentence = scan.nextLine();

        System.out.print(capitalizer(sentence));
    }
}

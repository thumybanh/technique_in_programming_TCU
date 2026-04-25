public class StringReverse {
    public static String reverser(String s, int index){
        if(index >= s.length()){
            return "";
        } else return reverser(s,index+1)+ s.charAt(index);

    }
    public static void main(String[] args) {
        System.out.println(reverser("Texas Christian University", 0));
    }
}

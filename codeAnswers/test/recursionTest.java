public class recursionTest {
    public static void recursive(String w){
        if(w.isEmpty()){
            return;
        }
        System.out.println(w.charAt(w.length()-1));
        recursive(w.substring(0, w.length()-1 ));

    }
    public static void main(String[] args){
        recursive("Zena");
    }
}

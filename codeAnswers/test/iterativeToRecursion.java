
public class iterativeToRecursion {
    public static void sign(int n){
        if(n == 0){
            return;
        }
        System.out.println("No parking");
        sign(n-1);
    }
    public static void main(String[] args){
        sign(4);


    }
}

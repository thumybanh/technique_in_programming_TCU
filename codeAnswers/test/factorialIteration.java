public class factorialIteration {
    public static void iterativeFac(int n){
        int sum = 1;
        while(n > 0){
            sum *= n;
            n--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        iterativeFac(5);
    }
}

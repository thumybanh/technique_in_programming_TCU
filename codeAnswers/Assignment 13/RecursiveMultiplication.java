public class RecursiveMultiplication {
    public static int recursiveMultiplication(int x, int y){
        if(x == 0){
            return 0;
        }

        return y + recursiveMultiplication(x-1, y);
    }

    public static void main(String[] args){
        System.out.println(recursiveMultiplication(7,4));
    }
}

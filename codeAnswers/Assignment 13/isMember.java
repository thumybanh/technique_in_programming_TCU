public class isMember {
    public static boolean isMember(int[] arr, int num, int index){
        if(index < arr.length){
            if(num!=arr[index]){
                return isMember(arr, num, index+1);
            }
        } else return false;

        if(num == arr[index]){
            return true;
        } else return false;

    }

    public static void main(String[] args){
        int[] array = {3,5,4,8,6};
        System.out.println(isMember(array, 5, 0));
    }
}

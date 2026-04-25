public class MaxElement {
    public static int maxElement(int[] nums, int StartIndex){
        if(StartIndex >= nums.length){
            return 0;
        }

        return Math.max(nums[StartIndex], maxElement(nums,StartIndex+1));
    }

    public static void main(String[] args){
        int[] arr = {3,5,6,2,8};
        System.out.println(maxElement(arr, 0));
    }
}

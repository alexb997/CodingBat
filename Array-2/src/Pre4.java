//Given a non-empty array of ints, return a new array containing the
// elements from the original array that come before the first 4 in the
// original array. The original array will contain at least one 4. Note that
// it is valid in java to create an array of length 0.



public class Pre4 {
    public static int[] pre4(int[] nums) {
        int i = 0;
        while (nums[i] != 4)
            i++;
        int[] arr = new int[i];
        System.arraycopy(nums, 0, arr, 0, i);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1};
        for(int num: nums){
            System.out.println(num);
        };
    }
}
//Given an array of ints, is it possible to divide the ints into two groups,
// so that the sums of the two groups are the same. Every int must be in one group or the other.
// Write a recursive helper method that takes whatever arguments you like,
// and make the initial call to your recursive helper from splitArray(). (No loops needed.)

public class SplitArray {
    public static boolean splitArray(int[] nums) {
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        return helper(nums, index, sum1, sum2);
    }
    private static boolean helper ( int[] nums, int index, int sum1, int sum2 ) {
        if ( index >= nums.length ) {
            return sum1 == sum2;
        }
        int value = nums[index];
        return (helper(nums, index + 1, sum1 + value, sum2) ||
                helper(nums, index + 1, sum1, sum2 + value));
    }

    public static void main(String[] args) {
        int[] nums={5,2,3};
        System.out.println(splitArray(nums));
    }
}

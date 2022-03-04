public class Split53 {
    public static boolean split53(int[] nums) {
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        return helper(nums, index, sum1, sum2);
    }
    private static boolean helper(int[] nums, int index, int sum1, int sum2) {
        if ( index >= nums.length ) {
            return sum1 == sum2;
        }
        int value = nums[index];
        if (value%5 == 0)
            return helper(nums, index + 1, sum1 + value, sum2);
        else if (value%3 == 0)
            return helper(nums, index + 1, sum1, sum2 + value);
        else
            return (helper(nums, index + 1, sum1 + value, sum2) ||
                    helper(nums, index + 1, sum1, sum2 + value));
    }

    public static void main(String[] args) {
        int[] nums={2, 4, 2};
        System.out.println(split53(nums));
    }
}

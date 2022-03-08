// Given an int array length 2, return true if it does not contain a 2 or 3.

public class No23 {
    public static boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3};
        System.out.println(no23(nums));
    }
}
//Given an array of ints length 3, figure out which is larger, the first or last element in the array,
// and set all the other elements to be that value. Return the changed array.

import java.util.Arrays;

public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={11, 5, 9};
        System.out.println(Arrays.toString(maxEnd3(nums)));
    }
}
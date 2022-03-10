//Return an array that contains exactly the same numbers as the given array,
// but rearranged so that every 4 is immediately followed by a 5.
// Do not move the 4's, but every other number may move.
// The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
// In this version, 5's may appear anywhere in the original array.

import java.util.Arrays;

public class Fix45 {
    public static int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length && nums[j] != 5)
            j++;
        while (i < nums.length) {
            if (nums[i] == 4) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while ((j < nums.length && nums[j] != 5) || j == i + 1)
                    j++;
            }
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 9, 4, 9, 5};
        System.out.println(Arrays.toString(fix45(nums)));
    }
}
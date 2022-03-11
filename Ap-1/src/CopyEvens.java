//Given an array of positive ints, return a new array of length "count"
// containing the first even numbers from the original array. The original
// array will contain at least "count" even numbers.

import java.util.Arrays;

public class CopyEvens {
    public static int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;
        for (int i = 0; index < count; i++) {
            if (nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 5, 8};
        System.out.println(Arrays.toString(copyEvens(nums, 2)));
    }
}
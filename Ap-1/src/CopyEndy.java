//We'll say that a positive int n is "endy" if it is in the range
// 0..10 or 90..100 (inclusive). Given an array of positive ints,
//  return a new array of length "count" containing the first endy numbers from the original array.
//  Decompose out a separate isEndy(int n) method to test if a number is endy.
//  The original array will contain at least "count" endy numbers.

import java.util.Arrays;

public class CopyEndy {
    public static int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;
        for (int i = 0; index < count; i++) {
            if (isEndy(nums[i])) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }

    private static boolean isEndy(int n) {
        return 0 <= n && n <= 10 || 90 <= n && n <= 100;
    }

    public static void main(String[] args) {
        int[] nums = {9, 11, 90, 22, 6};
        System.out.println(Arrays.toString(copyEndy(nums, 3)));
    }
}
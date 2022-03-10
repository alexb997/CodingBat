//Given an array of ints length 3, return a new array with the elements in reverse order,
// so {1, 2, 3} becomes {3, 2, 1}.

import java.util.Arrays;

public class Reverse3 {
    public static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static void main(String[] args) {
        int[] nums = {5, 11, 2};
        System.out.println(Arrays.toString(reverse3(nums)));
    }
}
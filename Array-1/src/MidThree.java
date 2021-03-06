//Given an array of ints of odd length, return a new array length 3
// containing the elements from the middle of the array. The array length will be at least 3.

import java.util.Arrays;

public class MidThree {
    public static int[] midThree(int[] nums) {
        int[] arr = new int[3];
        arr[0] = nums[nums.length / 2 - 1];
        arr[1] = nums[nums.length / 2];
        arr[2] = nums[nums.length / 2 + 1];
        return arr;
    }

    public static void main(String[] args) {
        int[] nums ={8, 6, 7, 5, 3, 0, 9};
        System.out.println(Arrays.toString(midThree(nums)));
    }
}
//Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


import java.util.Arrays;

public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 3};
        System.out.println(Arrays.toString(plusTwo(nums1, nums2)));
    }
}
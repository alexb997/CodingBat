//Given 2 int arrays, a and b, of any length, return a new array with the
// first element of each array. If either array is length 0, ignore that array.

import java.util.Arrays;

public class Front11 {
    public static int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums1= {1, 2, 3};
        int[] nums2= {1, 8, 2};
        System.out.println(Arrays.toString(front11(nums1, nums2)));
    }
}
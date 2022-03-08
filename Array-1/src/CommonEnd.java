//Given 2 arrays of ints, a and b, return true if they have the same first element or
// they have the same last element. Both arrays will be length 1 or more.

public class CommonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3};
        System.out.println(commonEnd(nums1, nums2));
    }
}
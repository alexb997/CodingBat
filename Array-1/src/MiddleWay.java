//Given 2 int arrays, a and b, each length 3,
// return a new array length 2 containing their middle elements.

public class MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 4, 5};
        System.out.println(middleWay(nums1, nums2));
    }
}
// Given two arrays, A and B, of non-negative int scores. A "special" score
// is one which is a multiple of 10, such as 40 or 90. Return the sum of
// largest special score in A and the largest special score in B. To practice
// decomposition, write a separate helper method which finds the largest
// special score in an array.

public class ScoresSpecial {
    public static int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public static int largestSpecial(int[] a) {
        int largest = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 10 == 0 && a[i] > largest)
                largest = a[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums1 = {12, 10, 4};
        int[] nums2 = {2, 20, 30};
        System.out.println(scoresSpecial(nums1,nums2));
    }
}
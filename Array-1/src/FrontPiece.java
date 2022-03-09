//Given an int array of any length, return a new array of its first 2 elements.
// If the array is smaller than length 2, use whatever elements are present.

public class FrontPiece {
    public static int[] frontPiece(int[] nums) {
        if (nums.length == 1)
            return new int[]{nums[0]};
        else if (nums.length == 0)
            return new int[]{};
        else
            return new int[]{nums[0], nums[1]};
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 0};
        System.out.println(frontPiece(nums));
    }
}

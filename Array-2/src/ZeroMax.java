//Return a version of the given array where each zero value in the array is
// replaced by the largest odd value to the right of the zero in the array. If
// there is no odd value to the right of the zero, leave the zero as a zero.

public class ZeroMax {
    public static int[] zeroMax(int[] nums) {
        int i = nums.length - 1;
        while (i >= 0 && nums[i] % 2 == 0)
            i--;
        for (int j = i - 1; j >= 0; j--) {
            if (nums[j] == 0)
                nums[j] = nums[i];
            if (nums[j] % 2 == 1 && nums[j] > nums[i])
                i = j;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 0, 3};
        for(int num: zeroMax(nums)){
            System.out.println(num);
        }
    }
}
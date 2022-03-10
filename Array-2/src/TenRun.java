//For each multiple of 10 in the given array, change all the values
// following it to be that multiple of 10, until encountering another
// multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


public class TenRun {
    public static int[] tenRun(int[] nums) {
        int current;
        int i = 0;
        while (i < nums.length && nums[i] % 10 != 0)
            i++;
        if (i >= nums.length)
            return nums;
        current = nums[i];
        i++;
        while (i < nums.length) {
            if (nums[i] % 10 == 0)
                current = nums[i];
            else
                nums[i] = current;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {10, 1, 20, 2};
        for(int num: tenRun(nums)){
            System.out.println(num);
        }
    }
}
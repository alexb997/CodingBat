//Given an array of ints, return true if every element is a 1 or a 4.

public class Only14 {
    public static boolean only14(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 1 && nums[i] != 4)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 4};
        System.out.println(only14(nums));
    }
}

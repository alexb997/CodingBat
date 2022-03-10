//Given an int array length 3, if there is a 2 in the array immediately
// followed by a 3, set the 3 element to 0. Return the changed array.

public class Fix23 {
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3};
        for(int num: fix23(nums)){
            System.out.println(num);
        }
    }
}
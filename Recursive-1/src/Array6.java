//Given an array of ints, compute recursively if the array contains a 6.
// We'll use the convention of considering only the part of the array that begins at the given index.
// In this way, a recursive call can pass index+1 to move down the array.
// The initial call will pass in index as 0.

public class Array6 {
    public static boolean array6(int[] nums, int index) {
        if(index==nums.length)
            return false;
        if(nums[index]==6){
            return true;
        }
        return array6(nums,index+1);
    }

    public static void main(String[] args) {
        int[] nums= {23,1,6,2};
        System.out.println(array6(nums,3));
    }
}

//Given an array of ints,
// is it possible to choose a group of some of the ints,
// such that the group sums to the given target, with this additional constraint:
// if there are numbers in the array that are adjacent and the identical value,
// they must either all be chosen, or none of them chosen.
// For example, with the array {1, 2, 2, 2, 5, 2},
// either all three 2's in the middle must be chosen or not,
// all as a group. (one loop can be used to find the extent of the identical values).

public class GroupSumClump {
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length ) {
            return (target == 0);
        }
        if(start+1 < nums.length && nums[start+1]==nums[start] ){
            if(groupSumClump(start + 1, nums, target - nums[start])) {
                return groupSumClump(start + 1, nums, target - nums[start]);
            }
            if (groupSumClump(start + 1, nums, target)) {
                return groupSumClump(start + 1, nums, target);
            }
        }
        if (groupSumClump(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (groupSumClump(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums ={2, 4, 8};
        System.out.println(groupSumClump(0, nums, 10));
    }
}

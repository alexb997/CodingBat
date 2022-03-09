//Return the number of even ints in the given array.

public class CountEvens {
    public static int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums= {2, 1, 2, 3, 4};
        System.out.println(countEvens(nums));
    }
}

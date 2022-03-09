public class Sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean inRange = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 6)
                inRange = true;
            if(!inRange)
                sum += nums[i];
            if(inRange && nums[i] == 7)
                inRange = false;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(nums));
    }
}

//Given a list of non-negative integers,
// return a list of those numbers except omitting any that end with 9. (Note: % by 10)

import java.util.ArrayList;
import java.util.List;

public class No9 {
    public static List<Integer> No9(List<Integer> nums) {
        nums.removeIf(n->(n%10==9));
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(59);
            add(31);
            add(78);
        }};
        System.out.println(No9(nums));
    }
}

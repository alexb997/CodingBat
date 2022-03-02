//Given a list of integers, return a list of the integers, omitting any that are less than 0.

import java.util.ArrayList;
import java.util.List;

public class NoNeg {
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n->n<0);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(-5);
            add(3);
            add(-7);
        }};
        System.out.println(noNeg(nums));
    }
}

//Given a list of integers,
// return a list of those numbers, omitting any that are between 13 and 19 inclusive.

import java.util.ArrayList;
import java.util.List;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n-> n >= 13 && n <= 19);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(15);
            add(3);
            add(27);
        }};
        System.out.println(noTeen(nums));
    }
}

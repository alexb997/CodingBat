//Given a list of non-negative integers,
// return a list of those numbers multiplied by 2,
// omitting any of the resulting numbers that end in 2.

import java.util.ArrayList;
import java.util.List;

public class No2 {
    public static List<Integer> no2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(41);
            add(225);
            add(17);
        }};
        System.out.println(no2(nums));
    }
}

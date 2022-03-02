//Given a list of integers, return a list where each integer is multiplied by 2.

import java.util.ArrayList;
import java.util.List;

public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println(doubling(nums));
    }
}

//Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

import java.util.ArrayList;
import java.util.List;

public class Math1 {
    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n+1)*10);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(5);
            add(3);
            add(7);
        }};
        System.out.println(math1(nums));
    }
}

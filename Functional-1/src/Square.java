//Given a list of integers, return a list where each integer is multiplied with itself.

import java.util.ArrayList;
import java.util.List;

public class Square {
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println(square(nums));
    }
}

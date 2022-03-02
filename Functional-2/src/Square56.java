//Given a list of integers,
// return a list of those numbers squared and the product added to 10,
// omitting any of the resulting numbers that end in 5 or 6.

import java.util.ArrayList;
import java.util.List;

public class Square56 {
    public static List<Integer> square56(List<Integer> nums) {
        nums.removeIf(n -> (n * n) % 10 == 5 || (n * n) % 10 == 6);
        nums.replaceAll(n-> (n*n)+10);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(3);
            add(1);
            add(4);
        }};
        System.out.println(square56(nums));
        //Sa verific de se poate mai eficient!
    }
}

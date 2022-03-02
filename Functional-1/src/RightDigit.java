//Given a list of non-negative integers,
// return an integer list of the rightmost digits. (Note: use %)

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n%10);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() {{
            add(531);
            add(35);
            add(7132);
        }};
        System.out.println(rightDigit(nums));
    }
}

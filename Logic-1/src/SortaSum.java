//Given 2 ints, a and b, return their sum.
// However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

public class SortaSum {
    public static int sortaSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 19)
            return 20;
        else
            return sum;
    }

    public static void main(String[] args) {
        System.out.println(sortaSum(14,2));
    }
}
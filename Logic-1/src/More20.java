//Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

public class More20 {
    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public static void main(String[] args) {
        System.out.println(more20(21));
    }
}

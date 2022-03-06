//Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
// while the other is "far", differing from both other values by 2 or more.
// Note: Math.abs(num) computes the absolute value of a number.

public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
        return (isClose(a, b) && isFar(a, b, c)) ||
                (isClose(a, c) && isFar(a, c, b));
    }

    private static boolean isClose(int a, int b) {
        return Math.abs(a - b) <= 1;
    }

    private static boolean isFar(int a, int b, int c) {
        return Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
    }

    public static void main(String[] args) {
        System.out.println(closeFar(4, 1, 3));
    }
}

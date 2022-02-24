//Given three int values, a b c, return the largest.

public class IntMax {
    public static int intMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        } else {
            if (b > c) {
                return b;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(intMax(202, 13, 24));
    }
}

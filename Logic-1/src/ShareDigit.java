//Given two ints, each in the range 10..99,
// return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.

public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
        int aL = a / 10;
        int aR = a % 10;
        int bL = b / 10;
        int bR = b % 10;

        if (aL == bL || aL == bR || aR == bL || aR == bR)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(shareDigit(12, 44));
    }
}
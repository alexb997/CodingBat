//Given three ints, a b c, return true if two or more of them have the same rightmost digit.
// The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        int modA = a % 10;
        int modB = b % 10;
        int modC = c % 10;

        if (modA == modB || modA == modC || modB == modC)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 3));
    }
}
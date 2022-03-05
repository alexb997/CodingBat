//Given 2 non-negative ints, a and b, return their sum,
// so long as the sum has the same number of digits as a.
// If the sum has more digits than a, just return a without b.
// (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string
// with String.valueOf(n) and then check the length of the string.)

public class SumLimit {
    public static int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
        int aLen = aString.length();
        String sumString = String.valueOf(a + b);
        int sumLen = sumString.length();

        if (sumLen == aLen)
            return a + b;
        else
            return a;

    }

    public static void main(String[] args) {
        System.out.println(sumLimit(8, 1));
    }
}
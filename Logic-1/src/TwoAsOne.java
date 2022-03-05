//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || c + b == a || c + a == b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(twoAsOne(2,4,6));
    }
}
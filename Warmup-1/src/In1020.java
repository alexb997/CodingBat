//Given 2 int values, return true if either of them is in the range 10..20 inclusive.

public class In1020 {
    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
    public static void main(String[] args) {
        System.out.println(in1020(10,130));
    }
}

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
// Use the % "mod" operator

public class Or35 {
    private static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
    public static void main(String[] args) {
        System.out.println(or35(3));
    }
}

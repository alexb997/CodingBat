//Return true if the given non-negative number is a multiple of 3 or 5, but not both.

public class Old35 {
    public static boolean old35(int n) {
        return (n % 3 == 0) != (n % 5 == 0);
    }

    public static void main(String[] args) {
        System.out.println(old35(30));
    }
}
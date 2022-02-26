//Given 2 positive int values,
// return the larger value that is in the range 10..20 inclusive,
// or return 0 if neither is in that range.

public class Max1020 {
    public static int max1020(int a, int b) {
        if (a >= b) {
            if (a >= 10 && a <= 20) {
                return a;
            }
            else{
                if (b <= 20 && b >= 10) {
                    return b;
                }
            }
        } else {
            if (b <= 20 && b >= 10) {
                return b;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(max1020(42, 15));
    }
}

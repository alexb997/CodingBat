//Given a string, return true if the number of appearances of "is" anywhere
// in the string is equal to the number of appearances of "not" anywhere in
// the string (case sensitive).

public class EqualIsNot {
    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.startsWith("is", i)) {
                is++;
            } else if (str.startsWith("not", i)) {
                not++;
            }
        }
        if (str.endsWith("is"))
            is++;
        return is == not;
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
}
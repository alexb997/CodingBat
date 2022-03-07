//Given a string, consider the prefix string made of the first N chars of
// the string. Does that prefix string appear somewhere else in the string?
// Assume that the string is not empty and that N is in the range
// 1..str.length().

public class PrefixAgain {
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));
    }
}
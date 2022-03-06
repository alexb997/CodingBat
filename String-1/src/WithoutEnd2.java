//Given a string, return a version without both the first and last char of
// the string. The string may be any length, including 0.

public class WithoutEnd2 {
    public static String withouEnd2(String str) {
        if (str.length() <= 2)
            return "";

        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(withouEnd2("abc"));
    }
}
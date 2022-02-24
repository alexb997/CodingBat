//Return true if the given string begins with "mix", except the 'm' can be anything,
// so "pix", "9ix" .. all count.

public class MixStart {
    public static boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String subStr = str.substring(1, 3);
        if (subStr.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(mixStart("fixer"));
        System.out.println(mixStart("risks"));
        System.out.println(mixStart("mixers"));
    }
}

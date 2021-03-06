//Given a string,
// return true if the first instance of "x" in the string is immediately followed by another "x".

public class DoubleXX {
    static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");
    }

    public static void main(String[] args) {
        System.out.println(doubleX("xwellxx"));
    }
}

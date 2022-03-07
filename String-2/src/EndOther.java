//Given two strings, return true if either of the strings appears at the
// very end of the other string, ignoring upper/lower case differences

public class EndOther {
    public static boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }

        return a.substring(a.length() - b.length()).equals(b);
    }

    public static void main(String[] args) {
        System.out.println(endOther("AbC", "HiaBc"));
    }
}
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

public class FirstHalf {
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
    public static void main(String[] args) {
        System.out.println(firstHalf("HelloThere"));
    }
}

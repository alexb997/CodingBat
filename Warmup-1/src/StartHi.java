//Given a string, return true if the string starts with "hi" and false otherwise.

public class StartHi {
    public static boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there!"));
    }
}

//Given a string, return the longest substring that appears at both the
// beginning and end of the string without overlapping. For example,
// sameEnds("abXab") is "ab".

public class SameEnds {
    public static String sameEnds(String string) {
        int start = (int) Math.ceil((double) string.length() / 2);
        int end = string.length() / 2;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, end).equals(string.substring(start))) {
                return string.substring(0, end);
            } else {
                start++;
                end--;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
    }
}
//Given two strings, word and a separator, return a big string made of count
// occurences of the word, separated by the separator string.

public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        if (count == 0)
            return "";
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < count - 1; i++) {
            result.append(word);
            result.append(sep);
        }
        return result.append(word).toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatSeparator("This", "And", 2));
    }
}
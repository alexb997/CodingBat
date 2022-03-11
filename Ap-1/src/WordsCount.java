//Given an array of strings, return the count of the number of strings with
// the given length.

public class WordsCount {
    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"a", "bb", "b", "ccc"};
        System.out.println(wordsCount(words, 1));
    }
}
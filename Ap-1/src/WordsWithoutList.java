//Given an array of strings, return a new List (e.g. an ArrayList) where all
// the strings of the given length are omitted.
// See wordsWithout() below which is more difficult because it uses arrays.

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public static List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len)
                list.add(words[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"a", "bb", "b", "ccc"};
        System.out.println(wordsWithoutList(words,4));
    }
}
//Given an array of strings, return a new array containing the first N strings.
// N will be in the range 1..length.

import java.util.Arrays;

public class WordsFront {
    public static String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = words[i];
        return arr;
    }

    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(wordsFront(str, 1)));
    }
}
//Given an array of strings,
// return a Map<String, Integer> containing a key for every different string in the array,
// and the value is that string's length.

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public static void main(String[] args) {
        String[] myStr={"a","ab","bca","acaf","ab"};
        System.out.println(wordLen(myStr));
    }
}

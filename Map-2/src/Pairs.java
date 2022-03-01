//Given an array of non-empty strings, create and return a Map<String, String> as follows:
// for each string add its first character as a key with its last character as the value.

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static Map<Character, Character> pairs(String[] strings) {
        Map<Character, Character> map = new HashMap();
        for (String s:strings) {
            map.put(s.charAt(0), s.charAt(s.length()-1));
        }
        return map;
    }

    public static void main(String[] args) {
        String[] myStr={"dark","ab","bca","acaf","ab"};
        System.out.println(pairs(myStr));
    }
}

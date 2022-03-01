//The classic word-count algorithm:
// given an array of strings, return a Map<String, Integer> with a key for each different string,
// with the value the number of times that string appears in the array.

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] myStr={"a","a","b","a"};
        System.out.println(wordCount(myStr));
    }
}

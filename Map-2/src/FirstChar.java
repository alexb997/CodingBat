//Given an array of non-empty strings,
// return a Map<String, String> with a key for every different first character seen,
// with the value of all the strings starting with that character appended together
// in the order they appear in the array.

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s:strings) {
            if(map.containsKey(s.substring(0,1))){
                map.put(String.valueOf(s.charAt(0)),
                        map.get(s.substring(0,1)+s.substring(1,s.length())));
            }else{
                map.put(s.substring(0,1),s.substring(1,s.length()));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] myStr={"dark","ab","bca","acaf","ab"};
        System.out.println(firstChar(myStr));
        //Gonna come back to this later
    }
}

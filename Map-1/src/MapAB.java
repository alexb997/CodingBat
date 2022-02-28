//Modify and return the given map as follows:
// for this problem the map may or may not contain the "a" and "b" keys.
// If both keys are present, append their 2 string values together and store the result under the key "ab".

import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap(){
            {
                put("a", "candy");
                put("b", "meh");
            }
        };
        System.out.println(mapAB(myMap));
    }
}

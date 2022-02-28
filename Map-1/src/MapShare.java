//Modify and return the given map as follows:
// if the key "a" has a value, set the key "b" to have that same value.
// In all cases remove the key "c", leaving the rest of the map unchanged.

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap(){
            {
                put("a", "candy");
                put("b", "meh");
                put("c","test");
            }
        };
        System.out.println(mapBully(myMap));
    }
}

//Modify and return the given map as follows:
// if the keys "a" and "b" are both in the map and have equal values, remove them both.

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap(){
            {
                put("a", "aaa");
                put("b", "aaa");
                put("c", "test");
            }
        };
        System.out.println(mapAB2(myMap));
    }
}

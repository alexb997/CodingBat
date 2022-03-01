//Modify and return the given map as follows:
// if exactly one of the keys "a" or "b" has a value in the map (but not both),
// set the other to have that same value in the map.

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b") || !map.containsKey("a") && map.containsKey("b") ) {
            if(map.containsKey("a")){
                map.put("b",map.get("a"));
            }else{
                map.put("a",map.get("b"));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap(){
            {
                put("b", "aaa");
                put("c", "test");
            }
        };
        System.out.println(mapAB3(myMap));
    }
}

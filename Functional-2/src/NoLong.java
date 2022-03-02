//Given a list of strings, return a list of the strings, omitting any string length 4 or more.

import java.util.ArrayList;
import java.util.List;

public class NoLong {
    public static List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("zzz");
            add("will");
            add("sleep");
            add("zoon");
        }};
        System.out.println(noLong(strings));
    }
}

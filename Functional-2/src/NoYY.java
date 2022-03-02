//Given a list of strings, return a list where each string has "y" added at its end,
// omitting any resulting strings that contain "yy" as a substring anywhere.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s->s+"y");
        strings.removeIf(s->s.contains("yy"));
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("yestarda");
            add("yellow");
            add("Synergy");
            add("Weirdyyin");
        }};
        System.out.println(addStar(strings));
    }
}

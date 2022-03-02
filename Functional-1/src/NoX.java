//Given a list of strings, return a list where each string has all its "x" removed.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static List<String> noX(List<String> strings) {
        strings= strings.stream().
                map(s -> s.replace("x","")).
                collect(Collectors.toList());
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("xwhat");
            add("wixll");
            add("happxenx");
        }};
        System.out.println(noX(strings));
    }
}

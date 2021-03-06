//Given a list of strings, return a list where each string has "y" added at its start and end.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static List<String> moreY(List<String> strings) {
        strings= strings.stream().
                map(s -> "y"+s+"y").
                collect(Collectors.toList());
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("e");
            add("will");
            add("happen");
        }};
        System.out.println(moreY(strings));
    }
}

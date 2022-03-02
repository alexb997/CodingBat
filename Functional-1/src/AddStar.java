//Given a list of strings, return a list where each string has "*" added at its end.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static List<String> addStar(List<String> strings) {
        strings= strings.stream().
                map(s -> s+"*").
                collect(Collectors.toList());
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("what");
            add("will");
            add("happen");
        }};
        System.out.println(addStar(strings));
    }
}

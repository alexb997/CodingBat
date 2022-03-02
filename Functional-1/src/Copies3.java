//Given a list of strings,
// return a list where each string is replaced by 3 copies of the string concatenated together.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static List<String> copies3(List<String> strings) {
        strings= strings.stream().
                map(s -> s+s+s).
                collect(Collectors.toList());
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("what");
            add("will");
            add("happen");
        }};
        System.out.println(copies3(strings));
    }
}

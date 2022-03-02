//Given a list of strings,
// return a list where each string is converted to lower case (Note: String toLowerCase() method).

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public static List<String> lower(List<String> strings) {
        strings= strings.stream().
                map(s -> s.toLowerCase()).
                collect(Collectors.toList());
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("WHAT");
            add("WiLL");
            add("hapPen");
        }};
        System.out.println(lower(strings));
    }
}

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

import java.util.ArrayList;
import java.util.List;

public class No34 {
    public static List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("zzz");
            add("hopefully");
            add("nap");
            add("tonight");
        }};
        System.out.println(no34(strings));
    }
}

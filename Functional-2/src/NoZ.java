import java.util.ArrayList;
import java.util.List;

public class NoZ {
    public static List<String> noZ(List<String> strings) {
        strings.removeIf(s->s.contains("z"));
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("zzz");
            add("will");
            add("sleep");
            add("zoon");
        }};
        System.out.println(noZ(strings));
    }
}

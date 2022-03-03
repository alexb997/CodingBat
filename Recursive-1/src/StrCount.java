//Given a string and a non-empty substring sub,
// compute recursively the number of times that sub appears in the string,
// without the sub strings overlapping.

public class StrCount {
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length() || str.equals("") || sub.equals("")) {
            return 0;
        }
        if(str.startsWith(sub)){
            return 1+ strCount(str.substring(sub.length()),sub);
        }else{
            return strCount(str.substring(1),sub);
        }
    }

    public static void main(String[] args) {
        System.out.println(strCount("ooosuspicioususooo", "sus"));
    }
}

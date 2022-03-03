//Given a string and a non-empty substring sub,
// compute recursively the largest substring which starts and ends with sub and return its length.

public class StrDist {
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length() || str.equals("") || sub.equals("")) {
            return 0;
        }
        if(str.startsWith(sub)){
            if(str.endsWith(sub)){
                return str.length();
            }
            return strDist(str.substring(0,str.length()-1),sub);
        }
        return strDist(str.substring(1),sub);
    }

    public static void main(String[] args) {
        System.out.println(strDist("carcasmastermindcascade","cas"));
    }
}

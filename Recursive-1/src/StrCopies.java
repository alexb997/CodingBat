//Given a string and a non-empty substring sub,
// compute recursively if at least n copies of sub appear in the string somewhere,
// possibly with overlapping. N will be non-negative.

public class StrCopies {
    public static boolean strCopies(String str, String sub, int n) {
        if(str.length()<sub.length() && n==0){
            return true;
        }
        if (str.length() < sub.length() || str.equals("") || sub.equals("") || n<0) {
            return false;
        }
        if(str.startsWith(sub)){
            return strCopies(str.substring(1),sub,n-1);
        }else{
            return strCopies(str.substring(1),sub,n);
        }
    }

    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
    }
}

//Given a string,
// compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

public class EndX {
    public static String endX(String str) {
        if(str.length()<=1)
            return str;
        if(str.startsWith("x"))
            return endX(str.substring(1)) + "x";
        return str.substring(0,1) + endX(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(endX("xHolyxxMoly"));
    }
}

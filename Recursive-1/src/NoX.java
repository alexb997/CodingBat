//Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class NoX {
    public static String noX(String str) {
        if(str.length()<=1){
            if(str.equals("x")){
                return "";
            }
            return str;
        }
        if(str.startsWith("x")){
            return noX(str.substring(1));
        }
        return str.substring(0,1) + noX(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(noX("xxHolyxMolyPeperonyx"));
    }
}

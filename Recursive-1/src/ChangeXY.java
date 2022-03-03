//Given a string, compute recursively (no loops) a new string
// where all the lowercase 'x' chars have been changed to 'y' chars.

public class ChangeXY {
    public static String changeXY(String str) {
        if(str.length()==1){
            if(str.equals("x")){
                return "y";
            }
            return str;
        }
        if(str.startsWith("x")){
            return "y" + changeXY(str.substring(1));
        }
        return str.substring(0,1) + changeXY(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(changeXY("xes_wonderfullx"));
    }
}

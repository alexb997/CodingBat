//Given a string,
// compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14"

public class ChangePi {
    public static String changePi(String str) {
        if(str.length()<=2){
            if(str.equals("pi"))
                return "3.14";
            return str;
        }
        if(str.startsWith("pi")){
            return "3.14" + changePi(str.substring(2));
        }
        return str.substring(0,1) + changePi(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(changePi("xpixxpix"));
    }
}

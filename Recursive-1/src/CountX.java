//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

public class CountX {
    public static int countX(String str) {
        if(str.length()==1){
            if(str == "x"){
                return 1;
            }
            return 0;
        }
        if(str.substring(0,1)=="x"){
            return 1 + countX(str.substring(1,str.length()));
        }
        return 0 + countX(str.substring(1,str.length()));
    }
    public static void main(String[] args) {
        System.out.println(countX("xwordsxmagicx"));
    }
}

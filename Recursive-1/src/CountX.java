//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

public class CountX {
    public static int countX(String str) {
        if(str.length()==1){
            if(str.equals("x")){
                return 1;
            }
            return 0;
        }
        if(str.substring(0, 1).equals("x")){
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(countX("xwordsxmagicx"));
    }
}

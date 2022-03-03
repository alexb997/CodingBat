//Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
// Suggestion: check the first and last chars, and then recur on what's inside them.

public class NestParen {
    public static boolean nestParen(String str){
        if(str.length()==1){
            return false;
        }
        if(str.equals("")){
            return true;
        }
        if(str.startsWith("(") && str.endsWith(")")){
            return nestParen(str.substring(1,str.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
    }
}

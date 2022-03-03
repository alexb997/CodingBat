//Given a string that contains a single pair of parenthesis,
// compute recursively a new string made of only of the parenthesis and their contents,
// so "xyz(abc)123" yields "(abc)".

public class ParenBit {
    public static String parenBit(String str) {
        if(str.length()<2){
            return "";
        }
        if(str.startsWith("(")){
            if(str.endsWith(")")){
                return str;
            }else{
                return parenBit(str.substring(0,str.length()-1));
            }
        }else{
            return parenBit(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(parenBit("wfaif(abab)wdan"));
    }
}

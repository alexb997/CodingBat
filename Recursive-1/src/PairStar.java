//Given a string,
// compute recursively a new string where identical chars that are adjacent in
// the original string are separated from each other by a "*".

public class PairStar {
    public static String pairStar(String str) {
        if(str.length()<=1)
            return str;
        if(str.startsWith(str.substring(1,2))) {
            return str.substring(0, 1) + "*" + pairStar(str.substring(1));
        }else{
            return str.substring(0, 1) + pairStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(pairStar("WhaaatThe"));
    }
}

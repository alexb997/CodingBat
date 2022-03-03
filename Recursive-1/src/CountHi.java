//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

public class CountHi {
    public static int countHi(String str) {
        if(str.length()<=2){
            if(str.equals("hi")){
                return 1;
            }
            return 0;
        }
        if(str.startsWith("hi")){
            return 1 + countHi(str.substring(1));
        }
        return countHi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countHi("hiTherehillsandvalleysHistory"));
    }
}

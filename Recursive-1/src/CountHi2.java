//Given a string, compute recursively the number of times lowercase "hi" appears in the string,
// however do not count "hi" that have an 'x' immedately before them.

public class CountHi2 {
    public static int countHi2(String str) {
        if(str.length()<=3){
            if(!str.startsWith("x") && str.contains("hi")){
                return 1;
            }
            return 0;
        }
        if(str.startsWith("xhi")){
            return countHi2(str.substring(3));
        }else{
            if(str.startsWith("hi")){
                return 1+ countHi2(str.substring(2));
            }
            return countHi2(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi2("hixhihixahi"));
    }
}

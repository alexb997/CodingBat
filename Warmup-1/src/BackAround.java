//Given a string, take the last char and return a new string with the last char added
//at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
public class BackAround {
    public static String backAround(String str) {
        String end = str.substring(str.length() - 1);
        return end + str + end;
    }

    public static void main(String[] args) {
        System.out.println(backAround("sos"));
    }
}

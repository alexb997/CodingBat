//Given a string, if the string "del" appears starting at index 1,
// return a string where that "del" has been deleted.
//Otherwise, return the string unchanged.

public class DelDel {
    public static String delDel(String str) {
        if (str.length()>=4 && str.startsWith("del", 1)) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("definition"));
        System.out.println(delDel("adelrctic"));
    }
}

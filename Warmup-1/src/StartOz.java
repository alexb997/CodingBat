//Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only if it is 'z',
// so "ozymandias" yields "oz".

public class StartOz {
    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(startOz("orientation"));
        System.out.println(startOz("ozero"));
        System.out.println(startOz("bread"));
    }
}

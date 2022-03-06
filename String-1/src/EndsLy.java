//Given a string, return true if it ends in "ly".

public class EndsLy {
    public static boolean endsLy(String str) {
        if (str.length() < 2)
            return false;

        return str.substring(str.length() - 2).equals("ly");
    }

    public static void main(String[] args) {
        System.out.println(endsLy("wonderfully"));
    }
}
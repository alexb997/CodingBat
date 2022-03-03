//Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

public class CountAbc {
    public static int countAbc(String str) {
        if(str.length()<=3){
            if(str.length()==3 && (str.equals("aba") || str.equals("abc"))){
                return 1;
            }
            return 0;
        }
        if(str.startsWith("aba") || str.startsWith("abc"))
            return 1 + countAbc(str.substring(1));
        return countAbc(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countAbc("abacabacaba"));
    }
}

//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

public class AllStar {
    public static String allStar(String str) {
        if(str.length()<=1)
            return str;
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(allStar("WhatThe"));
    }
}

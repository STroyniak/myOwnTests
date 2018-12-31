package com.troyniak.codewars;

public class RemoveChar {
    public static String remove(String str) {

        int dlCiagu = str.length();
        String result  = str.substring(1,(dlCiagu-1));
        System.out.println(result);
        return result;
    }
}

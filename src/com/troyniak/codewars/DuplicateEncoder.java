package com.troyniak.codewars;

import org.apache.commons.lang3.StringUtils;

public class DuplicateEncoder {

    static String encode(String word) {

        int wordLength = word.length();
        StringBuilder skladacz = new StringBuilder();

//        pierwsza petla pobiera indeks
        for (int i=0; i < wordLength; i++) {
            int licznik = StringUtils.countMatches(word.toLowerCase(),(word.toLowerCase()).charAt(i));
            if (licznik > 1){
                skladacz.append(")");
            } else
                skladacz.append("(");
        }
        System.out.println(word.toLowerCase());
        System.out.println(skladacz.toString());
        return skladacz.toString();
    }
}
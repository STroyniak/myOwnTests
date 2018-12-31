package com.troyniak.codewars;

public class ExesAndOhs {

    public static boolean XO(String str) {
        int iloscX = 0;
        int iloscO = 0;
        for (int i = 0; i < str.length(); i++) {
            String compareChar = str.substring(i);
            if (compareChar.equalsIgnoreCase("x")) {
                iloscX++;
            } else if (compareChar.equalsIgnoreCase("o")) {
                iloscO++;
            }
        }
        System.out.println("X jest " + iloscX + " a O " + iloscO);
        return iloscO == iloscX;
    }
}

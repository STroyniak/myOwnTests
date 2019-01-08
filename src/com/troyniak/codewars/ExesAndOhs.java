package com.troyniak.codewars;

public class ExesAndOhs {

    public static boolean XO(String str) {
        int iloscX = 0;
        int iloscO = 0;
        for (int i = 0; i < str.length(); i++) {
            String compareChar = str.substring(i,i+1);
//            System.out.println(compareChar);
            if (compareChar.equalsIgnoreCase("x")) {
                iloscX++;
            } else if (compareChar.equalsIgnoreCase("o")) {
                iloscO++;
            }
        }
//        System.out.println("Dlugosci ciagu to: " + str.length());
//        System.out.println("X jest " + iloscX + " a O " + iloscO);
        return iloscO == iloscX;
    }
}

/*
Konkurencyjne rozwiazania
    int x = 0, o = 0;
    for(int i = 0; i < str.length(); i++){
//        chary mozna porownywac == !!!!!!!!!!!!!!
        if(str.toUpperCase().charAt(i) == 'O') o++;
        if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;

//to jest moj faworyt - 30 min. myslenia - 3 sek. roboty
    str = str.toLowerCase();
    return str.replace("o","").length() == str.replace("x","").length();
*/

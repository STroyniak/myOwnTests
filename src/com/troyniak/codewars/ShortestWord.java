package com.troyniak.codewars;

public class ShortestWord {
    public static int findShort(String s) {

        String[] macierz = s.split(" ");
//
        int dlugoscStr = 0,result = 1000;
        System.out.println("Wielkosc macierzy: " + macierz.length);

        for (int i=0; i<=macierz.length-1; i++) {
            dlugoscStr = macierz[i].length();
            System.out.println(macierz[i] + " " + macierz[i].length());
            if(dlugoscStr < result) {
                result = dlugoscStr;
            }
            System.out.println("Min value: " + result);
        }

        for (String element : macierz) {
            System.out.println(element);
        }
        System.out.println("Min value: " + result);
        return result;
    }
}

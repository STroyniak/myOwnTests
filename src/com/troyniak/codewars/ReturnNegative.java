package com.troyniak.codewars;

public class ReturnNegative {

    public static int makeNegative(int x) {
        int wynik;

        if (x < 0 || x == 0) {
            wynik = x;
        } else {
            wynik = -x;
        }
        System.out.println("Wynik: " + wynik);
        return wynik;
    }

}
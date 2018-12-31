package com.troyniak.codewars;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String wynik;
        //Place code here
        if (number % 2 == 0) {
            wynik = "Even";
        } else wynik = "Odd";
        System.out.println("Liczba: " + wynik);
        return  wynik;
    }
}

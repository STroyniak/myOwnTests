package com.troyniak.codewars;

public class BasicOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        int wynik;

        if (op.equals("+")) {
            wynik = v1 + v2;
            System.out.println("Wynik to: " + wynik);
        } else if (op.equals("-")) {
            wynik = v1 - v2;
            System.out.println("Wynik to: " + wynik);
        } else if (op.equals("*")) {
            wynik = v1 * v2;
            System.out.println("Wynik to: " + wynik);
        } else if (op.equals("/")) {
            wynik = v1 / v2;
            System.out.println("Wynik to: " + wynik);
//        bez tego kompilator uznaje ze zmienna wynik moze nie byc zainicjalizowana
        } else wynik = 0;
        return wynik;
    }
}
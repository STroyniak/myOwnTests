package com.troyniak.kubiak.zadania;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {
        Scanner czytacz = new Scanner(System.in);
        double a, b, pole;

        System.out.println("Podaj dlugosc pierwszego boku prostokata; ");
        a = czytacz.nextDouble();

        System.out.println("Podaj dlugosc drugiego boku prostokata; ");
        b = czytacz.nextDouble();

/*      Wyrzucam obliczanie pola do oddzielnej klasy
        pole = a * b;

        System.out.println("Pole prostokata o wprowadzonych dlugosciach bokow wynosi: "+ '\n' + pole);*/
        pole = Zadanie11a.obliczPole(a,b);
        System.out.println("Pole prostokata wynosi:" + pole + " jednostek.");
    }
}

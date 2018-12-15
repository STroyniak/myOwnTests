package com.troyniak.trojkatFloyda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Dla podanej liczby
         * wyswietl trojkat Floyda
         * */

        Scanner sc = new Scanner(System.in);
        int liczba;
        int liczbaKoncowa = 1;

        System.out.println("Podaj liczbe calkowita:");
        //zalozyc obsluge bledu
        try {
            liczba = sc.nextInt();
            System.out.println("podana liczba to: " + liczba);
            System.out.println("*******************************");

            //pierwsza petla rysuje wiersze

            for (int i = 1; i <= liczba; i++) {
                int c = i;
            //druga petla wypisuje wartosci
                for (int j = 1; j <= i; j++) {
                    System.out.print(liczbaKoncowa + " ");
                    liczbaKoncowa++;
                }
                System.out.println();

            }
        } catch (InputMismatchException e) {
            System.out.println("Podana wartosc nie jest liczba calkowita !!!");
        }

    }
}

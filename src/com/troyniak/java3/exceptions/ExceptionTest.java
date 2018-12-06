package com.troyniak.java3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {



    public static void main(String[] args) {

//        zadanie 10
        ifInteger();

//        zaadanie 11
        beyondArrayIndex();
    }

    public static void ifInteger() {
//      Scanner czytnik = new Scanner(System.in);
//        jesli definicja czytnika jest w tym miejscu to petla nieskonczona
        boolean czyLiczba;


        do {
            Scanner czytnik = new Scanner(System.in);
//            a jesli tu - idealnie - dlaczego ? 1 godzina w plecy

            System.out.println("Podaj liczbe calkowita: ");

//        ExceptionTest lub InputMismatchException
            try {
                int liczba = czytnik.nextInt();
                czyLiczba = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono cos co nie jest liczba calkowita.");
                czyLiczba = false;
            }
        } while (czyLiczba == false);

        System.out.println("Podano liczbe calkowita. Program konczy dzialanie.");

    }

    public static void beyondArrayIndex() {
        String[] tablica = {"a","b","c","d","e","f","g","h", "i","j"};

        //System.out.println("Dlugosc tablicy wynosi: " + tablica.length);

        try {
            System.out.println("Wartosc dla wskazanego pola tablicy  wynosi: " + tablica[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wskazana tablica nie zawiera pola o takim indeksie. Tablica zawiera: " + tablica.length + " pozycji.") ;
        }
    }
}

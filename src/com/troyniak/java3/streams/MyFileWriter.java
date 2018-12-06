package com.troyniak.java3.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileWriter {

    public static void main(String[] args) throws IOException {
        /*1. W pakiecie streams stwórz klasę MyFileWriter z metodą główną.
        2. Wczytaj od użytkownika dwa Stringi, a następnie zapisz je do
        pliku.*/

        FileWriter pisaczDoPliku = new FileWriter("/home/sly/myOwnTests/wynik.txt");
        PrintWriter pisaczZeKonsoli = new PrintWriter(pisaczDoPliku);
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj pierwsza linie tekstu:");
        String liniaPierwsza = czytnik.nextLine();
        pisaczZeKonsoli.print(liniaPierwsza);
        pisaczZeKonsoli.print("\n");
        System.out.println("Podaj druga linie tekstu:");
        String liniaDruga = czytnik.nextLine();
        pisaczZeKonsoli.print(liniaDruga);
        pisaczZeKonsoli.print("\n");
        pisaczDoPliku.close();
    }
}

package com.troyniak.kubiak.zadania;

import java.util.Scanner;

public class Zadanie14 {
//    zadanie oblicza objetosc kuli o podanym z klawiatury promieniu z dokladnoscia do 2 miejsc po przecinku
    public static void main(String[] args) {

        Scanner czytacz = new Scanner(System.in);
        System.out.println("Wprowadz dlugosc promienia kuli:");

        double r, objetosc;
        r = czytacz.nextDouble();

//        objetosc = 4/3 * Math.PI * Math.pow(r,3);

        objetosc = 4 * Math.PI * r * r * r / 3;
//        nie wiem dlaczego float bo jak double to dla 1 4.19+e00
        System.out.printf("Objetosc kuli o podanym promieniu wynosi: " + "%2.2f1\n",objetosc);
}

}

package com.troyniak.kubiak.zadania;

public class Zadanie12 {
    public static void main(String[] args) {
        System.out.println("Wyswietlenie watosci liczby Pi do zadanej precyzji:");
//        nie zadziala dla println !!
//        zapis %7.6f oznacza 7 cyfr z czego 6 na czesc ulamkowa dla liczby float
//        nie rozumiem zapisu %2.2
        System.out.printf("Liczba PI: " + "%7.6f\n",Math.PI);
        System.out.printf("Liczba PI: " + "%10.9f\n",Math.PI);
        System.out.printf("Liczba PI: " + "%2.2f\n",Math.PI);
        System.out.printf("Liczba PI: " + "%3.3f\n",Math.PI);
    }
}

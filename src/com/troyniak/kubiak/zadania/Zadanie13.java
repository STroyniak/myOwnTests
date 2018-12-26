package com.troyniak.kubiak.zadania;

public class Zadanie13 {
//    Obliczenie pierwiastka kwadratowego z liczby PI z dokladnoscia do 2 miejsc po przecinku
public static void main(String[] args) {
    System.out.printf("Pierwiastek kwadratory z PI to: " + "%2.2f\n",Math.sqrt(Math.PI));
//    i inaczej
    double pi = Math.PI;
    System.out.printf("2 - Pierwiastek kwadratory z PI to: " + "%2.2f\n",Math.sqrt(pi));

    double pi2 = Math.sqrt(Math.PI);
    System.out.printf("3 - Pierwiastek kwadratory z PI to: " + "%2.2f\n",pi2);

}
}

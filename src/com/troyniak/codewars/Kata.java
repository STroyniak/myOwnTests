package com.troyniak.codewars;

public class Kata {

    public static int dontGiveMeFive(int start, int end) {

        int result = 0;

        for (int i = start; i <= end; i++) {
            if (Integer.toString(i).contains("5") == true) continue;
            result++;

        }
        System.out.println("Wynik wynosi: " + result);
        return result;
    }
}
package com.troyniak.codewars;

public class Square {
    public static boolean isSquare(int n) {
        if (Math.floor(Math.sqrt(n)) == Math.sqrt(n)) {
            System.out.println("Prawda");
            return true;
        } else
            System.out.println("Falsz");
            return false;
    }
}

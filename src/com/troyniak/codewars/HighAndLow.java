package com.troyniak.codewars;

public class HighAndLow {
    public static String highLow(String numbers) {

        String[] numbersList = numbers.split(" ");
        int numbersLength = numbersList.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, liczba;

        for (int i = 0; i < numbersLength; i++) {
            liczba = Integer.parseInt(numbersList[i]);
            min = Math.min(min, liczba);
            max = Math.max(max, liczba);
        }
        return new StringBuilder().append(max).append(" ").append(min).toString();
        //return String.format("%d %d", max, min);
    }
}

package com.troyniak.codewars;

public class App {

    public static void main(String[] args) {
        /*String str = "Skippy";
        int dlugStr = str.length();
        int inxMiddle = dlugStr - 4;
        int inxEnd = dlugStr;

        if (inxMiddle > 0) {
            System.out.println("Dlugosc stringu wynosi: " + dlugStr);
            System.out.println("Dlugosc zamienianego stringu wynosi: " + inxMiddle);

            String dozmianyStr = str.substring(0, inxMiddle);
            String bezzmianyStr = str.substring(inxMiddle, inxEnd);

            dozmianyStr = dozmianyStr.replaceAll("[a-zA-Z0-9 ]", "#");

            String wynik = dozmianyStr + bezzmianyStr;
            System.out.println("Wynik operacji to: " + wynik);
        } else {
            System.out.println("Wynik operacji to: " + str);
        }*/

        System.out.println("EvenOrOdd");
        EvenOrOdd test = new EvenOrOdd();
        test.even_or_odd(3);
        System.out.println("**************************");
        System.out.println();

        System.out.println("BasicOperations");
        BasicOperations basicOperations = new BasicOperations();
        basicOperations.basicMath("-",15,18);
        System.out.println("**************************");

        System.out.println("Kata");
        Kata kata = new Kata();
        kata.dontGiveMeFive(4,17);
        System.out.println("**************************");

        System.out.println("RemoveChars");
        RemoveChar removeChar = new RemoveChar();
        removeChar.remove("place");
        System.out.println("**************************");

        System.out.println("Square");
        Square square = new Square();
        square.isSquare(26);
        System.out.println("**************************");

        System.out.println("ExesAndOhs");
        ExesAndOhs exesandOhs = new ExesAndOhs();
        exesandOhs.XO("xxoo");
        System.out.println("**************************");



    }
}
/*

Maskify.Maskify("4556364607935616"); // should return "############5616"
        Maskify.Maskify("64607935616");      // should return "#######5616"
        Maskify.Maskify("1");                // should return "1"
        Maskify.Maskify("");                 // should return ""

// "What was the name of your first pet?"
        Maskify.Maskify("Skippy");                                   // should return "##ippy"
        Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"*/

package com.troyniak.codewars;

public class Maskify {

    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");

        int dlugStr = str.length();
        int inxMiddle = dlugStr - 4;
        int inxEnd = dlugStr;

        if (inxMiddle > 0) {
            String dozmianyStr = str.substring(0, inxMiddle);
            String bezzmianyStr = str.substring(inxMiddle, inxEnd);

            dozmianyStr = dozmianyStr.replaceAll("[a-zA-Z0-9 ]", "#");

//            String wynik = dozmianyStr + bezzmianyStr;
            return dozmianyStr + bezzmianyStr;
        } else {
            return str;
        }
    }
}

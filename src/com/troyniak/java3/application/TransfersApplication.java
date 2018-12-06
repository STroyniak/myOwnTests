package com.troyniak.java3.application;

import com.troyniak.java3.model.loans.Loan;

import java.math.BigDecimal;

public class TransfersApplication {

    public static void main(String[] args) {

//        definiujemy obiekt w oparciu o klase Loan i zadanymi wartosciami i wyswietlamy jego parametry
        Loan mBank = new Loan("01",new BigDecimal(1000));

        Loan Raiffeisen = new Loan("02", new BigDecimal(12000));

        mBank.print();
        Raiffeisen.print();

    }
}

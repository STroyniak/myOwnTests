package com.troyniak.java3.model.transfers;

import com.troyniak.java3.model.loans.Loan;

import java.math.BigDecimal;

public class Splata {

//    w tym momencie korzystamy z innego obiektu jako pola w biezacym
//    dlaczego ?

    private Loan kredyt;
    private BigDecimal kwotaSplaty;

    public Splata(Loan kredyt, BigDecimal kwotaSplaty) {
        this.kredyt = kredyt;
        this.kwotaSplaty = kwotaSplaty;
    }

    public BigDecimal getKwotaSplaty() {
        return kwotaSplaty;
    }

    public Loan getKredyt() {
        return kredyt;
    }
    public void print(){
        kredyt.print();
        System.out.println("Splata kredytu w wysokosci: " + kwotaSplaty);
        System.out.println();
    }
}

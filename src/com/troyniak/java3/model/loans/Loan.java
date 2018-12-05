package com.troyniak.java3.model.loans;

import java.math.BigDecimal;

public class Loan {
    private String id;
    private BigDecimal kwotaKredytu;

    public Loan  (String id, BigDecimal kwotaKredytu) {
        this.id = id;
        this.kwotaKredytu = kwotaKredytu;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getKwotaKredytu() {
        return kwotaKredytu;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setKwotaKredytu(BigDecimal kwotaKredytu) {
        this.kwotaKredytu = kwotaKredytu;
    }

    public void print() {
        //System.out.println("Kredyt o id: " + id + ", wysokosc kredytu wynosi: " + kwotaKredytu);
        //inaczej - tak jak na zajeciach
        String aktualnyStan = String.format("Kredyt o id %s, aktualna kwota kredytu: %s PLN", id, kwotaKredytu);
        System.out.println(aktualnyStan);
    }
}

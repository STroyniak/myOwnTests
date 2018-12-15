package com.troyniak.library;

//package java.com.infoshareacademy.library;

public class Book {
    private int idBook ;                           // numer id książki - unikatowy
    private String titleBook;                          // tytuł książki
    private String autor;                          // autor lub autorzy książki
    private int dateRelease;                       // data wydania książki - tylko rok
    private String isbn;                              // numer ISBN książki
    private Boolean statusLoan = false;            // status wypożyczenia - true/false wypożyczona/nie wypożyczona
    private Boolean statusReservation = false;     // status rezerwacji - true/false zarezerwowana/nie zarezerwowana

// konstruktor

//    wykomentoowany z uwagi na settery
    public Book(int idBook) {
        this.idBook = idBook;
    }

//gettery

    public int getIdBook() {
        return idBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return autor;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean getStatusLoan() {
        return statusLoan;
    }

    public Boolean getStatusReservation() {
        return statusReservation;
    }

// brak settera dla id - raz ustawione juz niezmienne

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public void setAuthor(String autor) {
        this.autor = autor;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setStatusLoan(Boolean statusLoan) {
        this.statusLoan = statusLoan;
    }

    public void setStatusReservation(Boolean statusReservation) {
        this.statusReservation = statusReservation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", titleBook='" + titleBook + '\'' +
                ", autor='" + autor + '\'' +
                ", dateRelease=" + dateRelease +
                ", isbn=" + isbn +
                ", statusLoan=" + statusLoan +
                ", statusReservation=" + statusReservation +
                '}';
    }

    // wyświetla info o książce
    public void printBook(int idBook, String titleBook, String autor, int dateRelease, int isbn, Boolean statusLoan, Boolean statusReservation){
        System.out.println("Informacje o książce:");
        System.out.println("Numer w systemie: "+idBook);
        System.out.println("Tytuł : " +titleBook);
        System.out.println("Autor: "+autor);
        System.out.println("Rok wydania: "+dateRelease);
        System.out.println("Numer ISBN: "+isbn);
        System.out.println("Czy wypożyczona: "+statusLoan);
        System.out.println("Czy zarezerwowana: "+statusReservation);
    }
// być może jeszcze inne metody tu się pojawią jak dodawanie książki, wyszukiwanie itd ..
}
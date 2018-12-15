package com.troyniak.library;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVImport {

    // klasa wykonawcza ?
//id;tytuł;autor;rok_wydania;isbn;status_wyp;status_rez
    private static final String filePath = "/home/sly/myOwnTests/lista.csv";


    public static void main(String[] args) throws IOException {

        List<Book> ksiazki = new ArrayList<>();

        try (CSVReader czytnikCSV = new CSVReader(new FileReader(filePath))) {
//        CSVReader czytnikCSV = new CSVReaderBuilder(new FileReader(filePath)).build();

            String[] tablicaCSV;

            while ((tablicaCSV = czytnikCSV.readNext()) != null) {
                String idKsiazki = tablicaCSV[0]; //w zasadzie linia zbedna
                Book ksiazka = new Book(Integer.parseInt(idKsiazki)); //i teraz wszystko przez settery


//                ksiazka.setIdBook(Integer.parseInt(tablicaCSV[0]));
                ksiazka.setTitleBook(tablicaCSV[1]);
                ksiazka.setAuthor(tablicaCSV[2]);
                ksiazka.setDateRelease(Integer.parseInt(tablicaCSV[3]));
                ksiazka.setIsbn(tablicaCSV[4]);
                ksiazka.setStatusLoan(false);
                ksiazka.setStatusReservation(true);

//                i dodanie obiektu do listy
                ksiazki.add(ksiazka);
                ksiazka.toString();


                System.out.println(ksiazka);

            }

/*            I TERAZ CO DALEJ Z LISTA ???
            MOZNA PRZESZUKIWAC
            for (Book ks: ksiazki){
                ks.toString();
            }   */
        }

        System.out.println();
        System.out.println("**********************************");
        for (Book ks : ksiazki) {
            ks.toString();
        }
//        powyzej el doopa

        System.out.println("**********************************");
        Book element0 = ksiazki.get(0);
        System.out.println(element0);
        Book element1 = ksiazki.get(1);
        System.out.println(element1);
    }


/* todo: obsluzyc separator pol dowolny
*       zastanowic sie nad dostepnoscia
* */
}


package com.troyniak.library;

import com.opencsv.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVImport2 {

    //    moze sciezke do pliku przekazywac w menu ?
//    wtedy nie trzeba jej tu inicjalizowac ??
    private static final String filePath = "/home/sly/IdeaProjects/library/jjdzl1-biblioteka/src/resoures/books.csv";



    //@Override
    public static void main(String[] args) throws IOException {

        List<Book> ksiazki = new ArrayList<>();

        //parametry dla pliku csv
        CSVParser csvParser = new CSVParserBuilder()
                                    .withSeparator(';')
                                    .withIgnoreLeadingWhiteSpace(true)
                                    .withIgnoreQuotations(true)
                                    .build();

//        try (CSVReader czytnikCSV = new CSVReaderHeaderAware(new FileReader(filePath))) {
        try (CSVReader czytnikCSV = new CSVReaderBuilder(new FileReader(filePath)).withSkipLines(1).withCSVParser(csvParser).build()) {

            String[] tablicaCSV;    //


            while ((tablicaCSV = czytnikCSV.readNext()) != null) {  //dopoki czytnikCSV odczytuje kolejne linie
                Book ksiazka = new Book(Integer.parseInt(tablicaCSV[0])); //i teraz wszystko przez settery

                //ksiazka.setIdBook(Integer.parseInt(tablicaCSV[0])); //ta linia nie potrzebna z uwagi na kontruktor
                ksiazka.setTitleBook(tablicaCSV[1]);
                ksiazka.setAuthor(tablicaCSV[2]);
                ksiazka.setDateRelease(Integer.parseInt(tablicaCSV[3]));
                ksiazka.setIsbn(tablicaCSV[4]);
                ksiazka.setStatusLoan(false);
                ksiazka.setStatusReservation(true);

//                i teraz to listy
                ksiazki.add(ksiazka);

//                check out
                System.out.println(ksiazka);

            }
            System.out.println("*******************************************");
            Book element0 = ksiazki.get(0);
            System.out.println(element0);
        }
    }
}
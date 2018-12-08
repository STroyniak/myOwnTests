package com.troyniak.library;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVImport2 {

    public static void main(String[] args) throws IOException {
        Reader czytaczPliku = new FileReader("/home/sly/myOwnTest/lista.csv");
        CSVParser csvImporter = new CSVParser(czytaczPliku, CSVFormat.DEFAULT);

//        List<CSVRecord> list = csvImporter.getRecords();

    }
}

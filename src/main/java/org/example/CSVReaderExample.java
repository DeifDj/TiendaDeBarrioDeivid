package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;

public class CSVReaderExample {
    public static void main(String[] args) throws Exception {
        // Ruta al archivo CSV
        String csvFilePath = "C:\\Users\\clikb\\.m2\\repository\\org\\apache\\commons\\commons-csv\\1.8\\MiTiendaDeBarrio";

        // Crear un lector para el archivo CSV
        Reader reader = new FileReader(csvFilePath);

        // Crear un analizador CSV
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        // Iterar a través de los registros y columnas del archivo CSV
        for (CSVRecord csvRecord : csvParser) {
            String columna1 = csvRecord.get(0); // Obtener el valor de la primera columna
            String columna2 = csvRecord.get(1); // Obtener el valor de la segunda columna

            // Realiza las operaciones que necesites con los datos
            System.out.println("Columna 1: " + columna1);
            System.out.println("Columna 2: " + columna2);
        }

        // Cerrar el lector y el analizador cuando hayas terminado
        reader.close();
        csvParser.close();
    }
}


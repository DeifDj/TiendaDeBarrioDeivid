package org.example;

import entity.Product;
import entity.productService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    Product product = new Product();

    public static void main(String[] args) throws Exception {
        productService productService= new productService();
        Product product = new Product();
        List<Product>List = productService.getProductList();
        // Ruta al archivo CSV
        String csvFilePath = "C:\\Users\\clikb\\IdeaProjects\\TiendaDeBarrioDeivid\\src\\main\\Recursos\\inventory.csv";

        // Crear un lector para el archivo CSV
        Reader reader = new FileReader(csvFilePath);

        // Crear un analizador CSV
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        // Iterar a través de los registros y columnas del archivo CSV
        for (CSVRecord csvRecord : csvParser) {
            String id = csvRecord.get(0); // Obtener el valor de la segunda columna
            String name = csvRecord.get(1); // Obtener el valor de la segunda columna
            String price = csvRecord.get(2); // Obtener el valor de la segunda columna
            String url = csvRecord.get(3); // Obtener el valor de la segunda columna
            String category = csvRecord.get(4); // Obtener el valor de la segunda columna
            String description = csvRecord.get(5); // Obtener el valor de la segunda columna
            String labels = csvRecord.get(6); // Obtener el valor de la segunda columna

         Product product1  = new Product(id,name,price,url,category,description,labels);
         List.add(product1);
            System.out.println(product1);

        }

        // Cerrar el lector y el analizador cuando hayas terminado
        reader.close();
        csvParser.close();
    }
}


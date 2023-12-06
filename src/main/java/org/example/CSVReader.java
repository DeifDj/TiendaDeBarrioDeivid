package org.example;

import entity.Product;
import entity.productService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class CSVReader {


    public static void main(String[] args) throws Exception {
        productService productService= new productService() {

        };

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
            int quantity = Integer.parseInt(csvRecord.get(7));
            Product product  = new Product(id, name, price, quantity, url, category, description, labels);






         List.add(product);
            System.out.println(product);

        }

        // Cerrar el lector y el analizador cuando hayas terminado
        reader.close();
        csvParser.close();
    }

    
}


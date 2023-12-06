package entity;

import java.util.List; // Importa la clase List si no está importada


public class ProductList {

    public ProductList(List<Product> productos) {
        System.out.println("\n±----------------------------------------±" +
                "\nListar productos del inventario" +
                "\n±----------------------------------------±");
        for (Product product : productos) {
            System.out.println(product);
        }
    }


}

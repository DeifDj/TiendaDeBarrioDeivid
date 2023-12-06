package entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FacturaPrinter {
    public void imprimirFactura(User user, List<Product> productList, double total) {
        // Imprimir encabezado de la factura
        System.out.println("***********************************");
        System.out.println("          TIENDA DE BARRIO          ");
        System.out.println("***********************************");
        System.out.println("Fecha: " + obtenerFechaActual());
        System.out.println("Cliente: " + user.getName());
        System.out.println("-----------------------------------");

        // Imprimir lista de productos
        System.out.println("Products:");
        for (Product product : productList) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("-----------------------------------");

        // Imprimir total
        System.out.println("Total a pagar: $" + total);
        System.out.println("***********************************");
    }

    // Método para obtener la fecha actual en formato legible
    private String obtenerFechaActual() {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.format(fechaActual);
    }
}
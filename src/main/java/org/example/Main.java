package org.example;

import ArraysList.ProductArray;
import entity.Product;
import entity.User;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.spi.CalendarDataProvider;

public class Main {

    public static void main(String[] args) {
        Date fechaHoraActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = formato.format(fechaHoraActual);

        System.out.println("Fecha y hora actual: " + fechaHoraFormateada);


        Product ProductServiceI = new Product(System.in) {
            @Override
            public void add(Product entity) {

            }

            @Override
            public void edit(Product entity) {

            }

            @Override
            public void remove(Product entity) {

            }

            @Override
            public Product findByID(String id) {
                return null;
            }

            @Override
            public List<Product> findAll() {
                return null;
            }
        };

        int option = displayMenu();
        while (option !=6){

            switch (option) {
                case 1 -> addProduct(ProductServiceI);
                case 2 -> editProduct(ProductServiceI);
                case 3 -> removeProduct(ProductServiceI);
                case 4 -> findByIDProduct(ProductServiceI);
                case 5 -> findAllproduct(ProductServiceI);
            }
            option = displayMenu();
        }
    }


    private static void  User() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the User: ");
        String name = scanner.nextLine();
        System.out.println("Enter the Password: ");
        String lastName = scanner.nextLine();
        User user = new User ();

    }
    private static void addProduct(Product product){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = scanner.nextLine();
        System.out.println("Enter category: ");
        String category = scanner.nextLine();

    }

    private static void editProduct(ProductSerciveI<Product> productSerciveI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = scanner.nextLine();
        System.out.println("Enter category: ");
    }
    private static void removeProduct(ProductSerciveI<Product> productSerciveI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = scanner.nextLine();
        System.out.println("Enter category: ");

    }
    private static void findByIDProduct(Product productServiceI){
Product product= new Product(System.in) {
    @Override
    public void add(Product entity) {

    }

    @Override
    public void edit(Product entity) {

    }

    @Override
    public void remove(Product entity) {

    }

    @Override
    public Product findByID(String id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
};
ProductSerciveI.addProduct(product);

    }
    private static void findAllproduct(Product productServiceI){
        System.out.println("Enter name: ");

    }

    private static int displayMenu() {
        System.out.println("---------BIENVENIDO A NUESTRO MENU.........");
        System.out.println("SELECCIONE LA OPCION CORRESPONDIENTE A SU SOLICITUD.");
        System.out.println("-------------------------------------------");
        System.out.println("---------! 1 : add Product.................");
        System.out.println("---------! 2 : edit Product................");
        System.out.println("---------! 3 : remove Product..............");
        System.out.println("---------! 4 : findByID Product............");
        System.out.println("---------! 5 : findAll Product.............");
        System.out.println("---------! 6 : finish operation............");
        System.out.println("!!!!No Olvides Finalizar tu compra y salir de tu Usuario!!!!");
        System.out.println("____________________________________________________________");
        System.out.println("* Seleccione una de las opciones anteriores: ");

        Scanner scanner = new Scanner(System.in);
        int option =6;
        try {
            option = scanner.nextInt();
            if (option < 1 || option > 6) {
                System.out.println("¡¡ Opcion invalida intente de nuevo¡¡");
                displayMenu();
            }
        } catch (Exception e) {
            System.out.println("¡¡ Opcion invalida intente de nuevo¡¡");
            displayMenu();
        }
        return option;
    }


}




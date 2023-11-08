package org.example;

import entity.Product;
import entity.User;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Product productServiceI = new Product(name, price, quantity);
        int option = displayMenu();
        while (option !=6){

            Product ProductArray;
            switch (option) {
                case 1 -> addProduct(productServiceI);
                case 2 -> editProduct(productServiceI);
                case 3 -> removeProduct(productServiceI);
                case 4 -> findByIDProduct(productServiceI);
                case 5 -> findAllproduct(productServiceI);
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
        Product product1 = new Product(name, price, quantity);

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
        Product product1 = new Product(name, price, quantity);
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
        Product product1 = new Product(name, price, quantity);
    }
    private static void findByIDProduct(Product productServiceI){
Product product= new Product(name, price, quantity);
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




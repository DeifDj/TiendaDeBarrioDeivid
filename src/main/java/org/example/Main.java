package org.example;

import entity.productService;

import java.util.*;


public class Main {

    public static void main(String[] args) {

       productService productService = new productService();
       CSVReader csvReader = new CSVReader();
            int option = displayMenu();
            while (option !=6){

                switch (option) {
                   case 1 -> productService.add();
                   case 2 -> productService.edit();
                   case 3 -> productService.remove();
                   case 4 -> productService.findByID();
                   case 5 -> productService.findAll();
                  // case 6 -> csvReader
                }
                option = displayMenu();
            }
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


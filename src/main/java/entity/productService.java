package entity;




import org.example.ProductSerciveI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class productService implements ProductSerciveI {

List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = scanner.nextLine();
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        //productList.add(new Product(id, name,price,category,));
        System.out.println(getProductList());
  }

    @Override
    public void edit() {
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

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = scanner.nextLine();
        System.out.println("Enter category: ");
    }

    @Override
    public void findByID() {

    }

    @Override
    public void findAll() {

    }
}

package entity;




import java.util.*;

public class productService implements ProductSercive {

List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public Product add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = scanner.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter category: ");
        String category = scanner.next();
        System.out.println("Enter url: ");
        String url = scanner.next();
        System.out.println("Enter Descrption: ");
        String description = scanner.next();
        System.out.println("Enter labels: ");
        String labels = scanner.next();
        productList.add(new Product(id, name, price, quantity, category, url, description, labels));
        System.out.println(getProductList());
        return null;
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
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
        }
        String product = new String();
        System.out.println("Product not found for ID: " + product);
    }

    @Override
    public void remove(String productId, int code, Random print) {

    }


    @Override
    public void findByID() {

    }


    @Override
    public void findByID(String productId) {
        for (Product product : productList) {
            if (product.getId().equals(productId)) {
                System.out.println("Product found: " + product);
                return;
            }
        }
        System.out.println("Product not found for ID: " + productId);
    }


    @Override
    public void findAll() {
        System.out.println("\n±----------------------------------------±" +
                "\nLista productos del inventario" +
                "\n±----------------------------------------±");
        for (Product product : productList) {
            System.out.println(product);
        }


    }

}

package entity;

import jdk.jfr.Category;
import org.example.ProductSerciveI;

public abstract class Product implements ProductSerciveI<Product> {

    private String id;

    private String name;
    private String price;
    private int quiantity;
    private Category category;

    public Product(String name, double price, int quantity) {
    }

    public Product(String id, String name, String price, int quiantity, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quiantity = quiantity;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuiantity() {
        return quiantity;
    }

    public void setQuiantity(int quiantity) {
        this.quiantity = quiantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}


package entity;

import jdk.jfr.Category;
import org.example.ProductSerciveI;

import java.io.InputStream;

public abstract class Product implements ProductSerciveI<Product> {

    private String id;

    private String name;
    private String price;
    private int quiantity;
    private Category category;

    public Product(InputStream in) {
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getQuiantity() {
        return quiantity;
    }

    public Category getCategory() {
        return category;
    }
}


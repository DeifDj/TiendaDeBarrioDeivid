package entity;

import jdk.jfr.Category;
import org.example.ProductSerciveI;

import java.util.List;

public class Product implements ProductSerciveI<Product> {

    private String id;

    private String name;
    private String price;
    private Category category;

    public Product() {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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
}

package entity;

<<<<<<< HEAD
public class Product {
=======
import org.example.ProductSerciveI;

import java.io.InputStream;

public abstract class Product implements ProductSerciveI<Product> {
>>>>>>> main

    private String id;

    private String name;
    private String price;
<<<<<<< HEAD
=======
    private int quiantity;
    private String category;
>>>>>>> main

    private String url;


    private String category;

    private String description;
    private String labels;

    public String getCategory() {
        return category;
    }

    public Product(String id, String name, String price, String url, String category, String description, String labels) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.category = category;
        this.description = description;
        this.labels = labels;
    }



    public Product() {
    }

    public Product(InputStream in) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

<<<<<<< HEAD
=======
    public String getCategory() {
        return category;
    }

>>>>>>> main
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", url='" + url + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", labels='" + labels + '\'' +
                '}';
    }
}


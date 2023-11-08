package ArraysList;

import entity.Product;
import org.example.ProductSerciveI;

import java.util.List;

public abstract class ProductArray implements ProductSerciveI<Product> {

    protected final List<Product> productList;

    public ProductArray(List<Product> productList) {
        this.productList = productList;
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

    public List<Product> getProductList() {
        return productList;
    }
}

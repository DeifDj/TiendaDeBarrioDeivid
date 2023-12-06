package entity;

import java.util.Random;

public interface ProductSercive<P> {

    Product add();

    void edit();

    void remove();

    void remove(String productId, int code, Random print);

    void findByID();

    void findByID(String productId);

    void findAll();
}
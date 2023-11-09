package org.example;

import entity.Product;

import java.util.List;

public interface ProductSerciveI {

    static void addProduct(Product product) {
    }

    void add();

   void edit();
   void remove();

    void findByID();

    void findAll();
}

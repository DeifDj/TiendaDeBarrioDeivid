package org.example;

import entity.Product;

import java.util.List;

public interface ProductSerciveI<T> {

    static void addProduct(Product product) {
    }

    void add(T entity);

   void edit(T entity);
   void remove(T entity);

    T findByID(String id);

   List<T> findAll();
}

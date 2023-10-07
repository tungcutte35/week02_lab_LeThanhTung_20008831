package com.example.week02_lab_lethanhtung_20008831.services;

import com.example.week02_lab_lethanhtung_20008831.models.Product;

import java.util.List;

public interface ProductService
extends ParentService<Product> {
    boolean deleteProduct(long id);
    List<Product> getProductsActive();
}

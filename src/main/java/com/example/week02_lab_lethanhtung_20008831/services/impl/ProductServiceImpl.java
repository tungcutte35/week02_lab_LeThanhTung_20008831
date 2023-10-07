package com.example.week02_lab_lethanhtung_20008831.services.impl;

import com.example.week02_lab_lethanhtung_20008831.models.Product;
import com.example.week02_lab_lethanhtung_20008831.repositories.ProductRepository;
import com.example.week02_lab_lethanhtung_20008831.services.ProductService;

import java.util.List;

public class ProductServiceImpl
extends ParentServiceImpl<Product>
implements ProductService {
    private final ProductRepository repository;
    public ProductServiceImpl(){
        super();
        repository = new ProductRepository();
    }
    @Override
    public boolean deleteProduct(long id) {
        return repository.deleteProduct(id);
    }

    @Override
    public List<Product> getProductsActive() {
        return repository.getProductsActive();
    }
}

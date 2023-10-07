package com.example.week02_lab_lethanhtung_20008831.repositories;

import com.example.week02_lab_lethanhtung_20008831.enums.ProductStatus;
import com.example.week02_lab_lethanhtung_20008831.models.Product;

import java.util.List;

public class ProductRepository
extends ParentRepository<Product>{
    public ProductRepository(){
        super();
    }

    public boolean deleteProduct(long id){
        try {
            transaction.begin();
            entityManager.createNamedQuery("Product.deleteProduct")
                    .setParameter("id", id)
                    .executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            logger.error(e.getMessage());
            return false;
        }
    }

    public List<Product> getProductsActive(){
        return (List<Product>) entityManager.createNamedQuery("Product.getProductsActive").setParameter("status", ProductStatus.ACTIVE).getResultList();
    }
}

package com.example.week02_lab_lethanhtung_20008831.repositories;

import com.example.week02_lab_lethanhtung_20008831.models.OrderDetail;

import java.util.List;

public class OrderDetailRepository extends ParentRepository<OrderDetail> {
    public OrderDetailRepository() {
        super();
    }

    public List<OrderDetail> getListOrderDetail(long id){
        return (List<OrderDetail>) entityManager.createNamedQuery("OrderDetail.getListOrderDetail").setParameter("id", id).getResultList();
    }

}

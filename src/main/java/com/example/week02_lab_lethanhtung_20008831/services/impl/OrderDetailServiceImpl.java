package com.example.week02_lab_lethanhtung_20008831.services.impl;

import com.example.week02_lab_lethanhtung_20008831.models.OrderDetail;
import com.example.week02_lab_lethanhtung_20008831.repositories.OrderDetailRepository;
import com.example.week02_lab_lethanhtung_20008831.services.OrderDetailService;

import java.util.List;

public class OrderDetailServiceImpl extends ParentServiceImpl<OrderDetail> implements OrderDetailService {
    private final OrderDetailRepository orderDetailRepository;
    public OrderDetailServiceImpl() {
        super();
        orderDetailRepository = new OrderDetailRepository();
    }
    @Override
    public List<OrderDetail> getListOrderDetailByOrder(long id) {
        return orderDetailRepository.getListOrderDetail(id);
    }
}

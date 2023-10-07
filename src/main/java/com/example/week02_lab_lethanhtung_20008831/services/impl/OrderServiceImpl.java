package com.example.week02_lab_lethanhtung_20008831.services.impl;

import com.example.week02_lab_lethanhtung_20008831.models.Order;
import com.example.week02_lab_lethanhtung_20008831.models.OrderDetail;
import com.example.week02_lab_lethanhtung_20008831.repositories.OrderRepository;
import com.example.week02_lab_lethanhtung_20008831.services.OrderDetailService;
import com.example.week02_lab_lethanhtung_20008831.services.OrderService;

import java.util.List;

public class OrderServiceImpl
extends ParentServiceImpl<Order>
implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderDetailService orderDetailService;
    public OrderServiceImpl() {
        orderRepository = new OrderRepository();
        orderDetailService = new OrderDetailServiceImpl();
    }

    @Override
    public List<OrderDetail> getListOrderDetail(long id) {
        return orderDetailService.getListOrderDetailByOrder(id);
    }
}

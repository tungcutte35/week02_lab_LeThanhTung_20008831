package com.example.week02_lab_lethanhtung_20008831.services;

import com.example.week02_lab_lethanhtung_20008831.models.Order;
import com.example.week02_lab_lethanhtung_20008831.models.OrderDetail;

import java.util.List;

public interface OrderService extends ParentService<Order> {
    List<OrderDetail> getListOrderDetail(long id);
}

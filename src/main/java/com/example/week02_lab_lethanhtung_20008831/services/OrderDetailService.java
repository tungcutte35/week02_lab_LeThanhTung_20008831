package com.example.week02_lab_lethanhtung_20008831.services;

import com.example.week02_lab_lethanhtung_20008831.models.OrderDetail;

import java.util.List;

public interface OrderDetailService extends ParentService<OrderDetail> {
    List<OrderDetail> getListOrderDetailByOrder(long id);
}

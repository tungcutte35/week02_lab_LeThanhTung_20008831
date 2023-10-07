package com.example.week02_lab_lethanhtung_20008831.services;

import com.example.week02_lab_lethanhtung_20008831.models.Customer;

import java.util.List;

public interface CustomerService extends ParentService<Customer> {
    void deleteCustomer(long id);
    List<Customer> getCustomersActive();
}

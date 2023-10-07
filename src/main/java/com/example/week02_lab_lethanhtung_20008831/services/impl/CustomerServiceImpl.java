package com.example.week02_lab_lethanhtung_20008831.services.impl;

import com.example.week02_lab_lethanhtung_20008831.models.Customer;
import com.example.week02_lab_lethanhtung_20008831.repositories.CustomerRepository;
import com.example.week02_lab_lethanhtung_20008831.services.CustomerService;

import java.util.List;

public class CustomerServiceImpl extends ParentServiceImpl<Customer> implements CustomerService {
    private final CustomerRepository repository;
    public CustomerServiceImpl() {
        super();
        repository = new CustomerRepository();
    }


    @Override
    public void deleteCustomer(long id) {
        repository.deleteCustomer(id);
    }

    @Override
    public List<Customer> getCustomersActive() {
        return repository.getCustomersActive();
    }
}

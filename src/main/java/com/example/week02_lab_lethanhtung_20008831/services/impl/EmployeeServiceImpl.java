package com.example.week02_lab_lethanhtung_20008831.services.impl;

import com.example.week02_lab_lethanhtung_20008831.models.Employee;
import com.example.week02_lab_lethanhtung_20008831.repositories.EmployeeRepository;
import com.example.week02_lab_lethanhtung_20008831.services.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl
extends ParentServiceImpl<Employee>
implements EmployeeService {
    private final EmployeeRepository repository;
    public EmployeeServiceImpl(){
        super();
        repository = new EmployeeRepository();
    }

    @Override
    public void deleteEmp(long id) {
        repository.deleteEmp(id);
    }

    @Override
    public List<Employee> getEmpActive() {
        return repository.getEmpActive();
    }
}

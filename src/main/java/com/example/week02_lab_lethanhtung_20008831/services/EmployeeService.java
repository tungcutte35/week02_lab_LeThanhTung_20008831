package com.example.week02_lab_lethanhtung_20008831.services;

import com.example.week02_lab_lethanhtung_20008831.models.Employee;

import java.util.List;

public interface EmployeeService extends ParentService<Employee> {
    void deleteEmp(long id);
    List<Employee> getEmpActive();
}

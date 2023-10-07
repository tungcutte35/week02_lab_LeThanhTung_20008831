package com.example.week02_lab_lethanhtung_20008831.repositories;

import com.example.week02_lab_lethanhtung_20008831.models.Employee;

import java.util.List;


public class EmployeeRepository extends ParentRepository<Employee> {

    public EmployeeRepository() {
        super();
    }

    public void deleteEmp(long id) {
        try {
            transaction.begin();
            entityManager.createNamedQuery("employee.deleteEmp")
                    .setParameter("id", id)
                    .executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error(e.getMessage());
        }
    }

    public List<Employee> getEmpActive(){
        return (List<Employee>) entityManager.createNamedQuery("Employee.getEmpActive").getResultList();
    }
}

package com.example.week02_lab_lethanhtung_20008831.connect;

import com.example.week02_lab_lethanhtung_20008831.enums.EmployeeStatus;
import com.example.week02_lab_lethanhtung_20008831.models.Employee;
import com.sun.tools.javac.Main;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.time.LocalDateTime;


public class ConnectDB {
    private static ConnectDB instance;
    private EntityManager em;
    private ConnectDB(){
        em = Persistence.createEntityManagerFactory("week2").createEntityManager();
    }

    public static ConnectDB getInstance(){
        if(instance == null){
            instance = new ConnectDB();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public static void main(String[] args) {
        ConnectDB.getInstance().getEntityManager();

    }
}

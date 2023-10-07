package com.example.week02_lab_lethanhtung_20008831.enums;


import lombok.Getter;

@Getter
public enum EmployeeStatus {
    TERMINATE(-1),
    ACTIVE(1),
    IN_ACTIVE(1);
    private final int value;
    EmployeeStatus(int value){
        this.value = value;
    }

}

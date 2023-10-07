package com.example.week02_lab_lethanhtung_20008831.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
    IN_ACTIVE(-1),
    ACTIVE(1),
    TERMINATE(0);
    private int value;
    ProductStatus(int value){
        this.value = value;
    }

}

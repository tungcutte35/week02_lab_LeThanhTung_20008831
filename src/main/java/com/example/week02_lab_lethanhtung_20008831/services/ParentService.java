package com.example.week02_lab_lethanhtung_20008831.services;

import java.util.List;
import java.util.Optional;

public interface ParentService<T> {
    List<T> getAll(Class<T> clazz);
    Optional<T> getById(Object id, Class<T> clazz);
    void insert(T obj);
    boolean update(T obj);

}

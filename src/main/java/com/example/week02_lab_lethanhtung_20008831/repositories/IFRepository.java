package com.example.week02_lab_lethanhtung_20008831.repositories;

import java.util.List;
import java.util.Optional;

public interface IFRepository<T> {
    boolean insert(T obj);
    boolean update(T obj);
    boolean delete(T obj);
    Optional<T> getbyId(Object id, Class<T> clazz);
    List<T> getAll(Class<T> clazz);
}

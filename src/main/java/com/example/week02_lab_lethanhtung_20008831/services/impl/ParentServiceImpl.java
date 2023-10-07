package com.example.week02_lab_lethanhtung_20008831.services.impl;

import com.example.week02_lab_lethanhtung_20008831.repositories.ParentRepository;
import com.example.week02_lab_lethanhtung_20008831.services.ParentService;

import java.util.List;
import java.util.Optional;

public class ParentServiceImpl<T> implements ParentService<T> {
    protected final ParentRepository<T> parentRepository;
    public ParentServiceImpl(){

        parentRepository = new ParentRepository<>();
    }
    @Override
    public List<T> getAll(Class<T> clazz) {
        return parentRepository.getAll(clazz);
    }

    @Override
    public Optional<T> getById(Object id, Class<T> clazz) {
        return parentRepository.getbyId(id, clazz);
    }

    @Override
    public void insert(T obj) {
        parentRepository.insert(obj);
    }

    @Override
    public boolean update(T obj) {
        return parentRepository.update(obj);
    }
}

package ua.crud.microservice.api.service;

import ua.simpleservletframework.core.annotation.annotation.component.Service;

import java.util.List;

@Service
public interface ManageService<T> {
    void insert();
    void update();
    void delete(String id);
    T read(String id);
    List<T> findAll();
}

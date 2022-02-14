package ua.crud.microservice.client.service;

import java.io.IOException;
import java.util.List;

public interface ApplicationService<T> {
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    void get(long id);
    String findAll();
}

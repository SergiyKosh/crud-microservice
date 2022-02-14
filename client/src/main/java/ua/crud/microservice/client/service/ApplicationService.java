package ua.crud.microservice.client.service;

public interface ApplicationService<T> {
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    String get(String idStr);
    String findAll();
}

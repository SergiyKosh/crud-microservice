package ua.crud.microservice.admin.service;

import java.util.List;

public interface ManageService<T> {
    String insert();
    String update(long id);
    String delete(long id);
    String get(String id);
    List<T> findAll();
}

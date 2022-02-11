package ua.crud.microservice.api.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    void create();
    void insert(T entity);
    void update(T entity);
    T read(long id) throws SQLException;
    void delete(long id);
    List<T> findAll();
}

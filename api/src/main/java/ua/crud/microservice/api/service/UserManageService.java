package ua.crud.microservice.api.service;

import ua.crud.microservice.api.entity.User;
import ua.simpleservletframework.core.annotation.annotation.component.Service;

import java.util.List;

@Service
public class UserManageService implements ManageService<User> {
    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public User read(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

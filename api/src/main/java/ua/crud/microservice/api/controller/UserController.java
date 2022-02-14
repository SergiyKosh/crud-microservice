package ua.crud.microservice.api.controller;

import ua.crud.microservice.api.entity.User;
import ua.crud.microservice.api.service.UserManageService;
import ua.simpleservletframework.core.annotation.annotation.component.Autowired;
import ua.simpleservletframework.mvc.annotation.annotation.controller.RestController;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.DeleteMapping;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.PutMapping;
import ua.simpleservletframework.mvc.annotation.annotation.url.PathVariable;

import java.util.List;

@RestController("/api/users")
public class UserController {
    @Autowired
    private UserManageService service;

    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return service.read(id);
    }

    @PutMapping
    public String createUser() {
        service.insert();
        return "redirect:/http://localhost:8080/admin";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        service.delete(id);
        return "redirect:/http://localhost:8080/admin";
    }
}

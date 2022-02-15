package ua.crud.microservice.admin.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import ua.crud.microservice.admin.model.User;
import ua.simpleservletframework.core.annotation.annotation.component.Autowired;
import ua.simpleservletframework.core.annotation.annotation.component.Service;
import ua.simpleservletframework.mvc.servlet.DispatcherServlet;
import ua.simpleservletframework.mvc.ui.Model;

import java.net.URL;
import java.util.List;

import static ua.crud.microservice.admin.util.CookieUtil.isCurrentUserExists;

@Service
public class UserManageService implements ManageService<User> {
    @Autowired
    private ObjectMapper om;
    @Autowired
    Model model;

    @Override
    public String insert() {
        return null;
    }

    @Override
    public String update(long id) {
        return null;
    }

    @Override
    public String delete(long id) {
        return null;
    }

    @SneakyThrows
    @Override
    public String get(String id) {
        if (isCurrentUserExists()) {
            User user = om.readValue(new URL("http://localhost:8080/api/users/" + id), User.class);
            model.addAttribute("currentUser", user);
            return "profile";
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

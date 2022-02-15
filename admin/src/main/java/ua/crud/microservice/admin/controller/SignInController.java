package ua.crud.microservice.admin.controller;

import ua.simpleservletframework.mvc.annotation.annotation.controller.Controller;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;

@Controller("/admin/signin")
public class SignInController {
    @GetMapping
    public String get() {
        return "signin";
    }
}

package ua.crud.microservice.client.controller;

import ua.simpleservletframework.mvc.annotation.annotation.controller.Controller;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String redirect() {
        return "redirect:/excursions";
    }
}

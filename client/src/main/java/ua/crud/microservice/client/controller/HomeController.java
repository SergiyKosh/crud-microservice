package ua.crud.microservice.client.controller;

import simpleservletframework.mvc.annotation.annotation.controller.Controller;
import simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String redirect() {
        return "redirect:/excursions";
    }
}

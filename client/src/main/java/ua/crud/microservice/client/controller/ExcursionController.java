package ua.crud.microservice.client.controller;

import simpleservletframework.mvc.annotation.annotation.controller.Controller;
import simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;

@Controller("/excursions")
public class ExcursionController {
    @GetMapping
    public String getExcursions() {
        return "home";
    }
}

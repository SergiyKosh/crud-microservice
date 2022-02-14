package ua.crud.microservice.client.controller;

import ua.crud.microservice.client.service.ExcursionService;
import ua.simpleservletframework.core.annotation.annotation.component.Autowired;
import ua.simpleservletframework.mvc.annotation.annotation.controller.Controller;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;

import java.io.IOException;

@Controller("/client/excursions")
public class ExcursionController {
    @Autowired
    private ExcursionService service;

    @GetMapping
    public String getExcursions() throws IOException {
        return service.findAll();
    }
}

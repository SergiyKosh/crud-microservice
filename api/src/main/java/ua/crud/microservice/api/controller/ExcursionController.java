package ua.crud.microservice.api.controller;

import simpleservletframework.core.annotation.annotation.component.Autowired;
import simpleservletframework.mvc.annotation.annotation.controller.RestController;
import simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;
import simpleservletframework.mvc.annotation.annotation.mapping.PutMapping;
import ua.crud.microservice.api.entity.Excursion;
import ua.crud.microservice.api.service.ExcursionService;

import java.util.List;

@RestController("/excursions")
public class ExcursionController {
    @Autowired
    private ExcursionService excursionService;

    @GetMapping
    public List<Excursion> getExcursions() {
        return excursionService.findAll();
    }

    @PutMapping
    public String createExcursion() {
        return "redirect:/excursions";
    }
}

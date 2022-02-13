package ua.crud.microservice.api.controller;
import ua.crud.microservice.api.entity.Excursion;
import ua.crud.microservice.api.service.ExcursionService;
import ua.simpleservletframework.core.annotation.annotation.component.Autowired;
import ua.simpleservletframework.mvc.annotation.annotation.controller.RestController;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.PutMapping;

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

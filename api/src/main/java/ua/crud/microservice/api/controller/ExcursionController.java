package ua.crud.microservice.api.controller;
import lombok.SneakyThrows;
import ua.crud.microservice.api.entity.Excursion;
import ua.crud.microservice.api.service.ExcursionService;
import ua.simpleservletframework.core.annotation.annotation.component.Autowired;
import ua.simpleservletframework.mvc.annotation.annotation.controller.RestController;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.GetMapping;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.PatchMapping;
import ua.simpleservletframework.mvc.annotation.annotation.mapping.PutMapping;
import ua.simpleservletframework.mvc.annotation.annotation.url.PathVariable;

import java.io.IOException;
import java.util.List;

@RestController("/api/excursions")
public class ExcursionController {
    @Autowired
    private ExcursionService excursionService;

    @GetMapping
    public List<Excursion> getExcursions() {
        return excursionService.findAll();
    }

    @GetMapping("/{id}")
    public Excursion getExcursion(@PathVariable String id) {
        return excursionService.read(id);
    }

    @PutMapping
    public String createExcursion() throws IOException {
        excursionService.insert();
        return "redirect:/http://localhost:8080/client/excursions";
    }

    @PatchMapping
    public String updateExcursion() throws IOException {
        excursionService.update();
        return "redirect:/http://localhost:8080/client/excursions";
    }
}

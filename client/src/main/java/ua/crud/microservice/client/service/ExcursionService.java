package ua.crud.microservice.client.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ua.crud.microservice.client.model.Excursion;
import ua.simpleservletframework.core.annotation.annotation.component.Service;
import ua.simpleservletframework.mvc.ui.Model;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExcursionService implements ApplicationService<Excursion> {
    @Override
    public void save(Excursion entity) {

    }

    @Override
    public void update(Excursion entity) {

    }

    @Override
    public void delete(Excursion entity) {

    }

    @Override
    public String get(String idStr) {
        Excursion excursion;
        ObjectMapper om = new ObjectMapper();

        try {
            excursion = om.readValue(new URL("http://127.0.0.1:8080/api/excursions/" + idStr), Excursion.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Model model = new Model();

        model.addAttribute("excursion", Optional.ofNullable(excursion).orElse(new Excursion()));

        return "excursion";
    }

    @Override
    public String findAll() {
        List<Excursion> excursions;
        ObjectMapper om = new ObjectMapper();

        try {
            excursions = om.readValue(new URL("http://127.0.0.1:8080/api/excursions"), new TypeReference<>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Model model = new Model();

        model.addAttribute("excursions", Optional.ofNullable(excursions).orElse(new ArrayList<>()));

        return "excursions";
    }
}

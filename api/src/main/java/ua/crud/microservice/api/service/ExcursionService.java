package ua.crud.microservice.api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import simpleservletframework.core.annotation.annotation.component.Autowired;
import simpleservletframework.core.annotation.annotation.component.Service;
import simpleservletframework.mvc.servlet.DispatcherServlet;
import ua.crud.microservice.api.dao.ExcursionDao;
import ua.crud.microservice.api.entity.Excursion;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class ExcursionService {
    @Autowired
    private ExcursionDao dao;

    public void insert() throws IOException {
        ObjectMapper om = new ObjectMapper();
        StringBuilder str = new StringBuilder();
        int counter;

        while ((counter = DispatcherServlet.request.getInputStream().read()) != -1) {
            str.append((char) counter);
        }

        String[] params = str.toString().split("&");
        Object[] paramsObj = Arrays.stream(params)
                .map(s -> s.replaceAll("name=", "")
                        .replaceAll("category=", "")
                        .replaceAll("city=", "")
                        .replaceAll("description=", "")
                        .replaceAll("%20", "")
                ).toArray();

        params = Arrays.copyOf(paramsObj, paramsObj.length, String[].class);

        Excursion excursion = Excursion.builder()
                .name(params[0])
                .category(params[1])
                .city(params[2])
                .description(params[3])
                .build();

        dao.insert(excursion);
    }

    public List<Excursion> findAll() {
        return dao.findAll();
    }
}

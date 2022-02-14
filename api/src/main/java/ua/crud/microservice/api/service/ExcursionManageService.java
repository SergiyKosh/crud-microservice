package ua.crud.microservice.api.service;

import lombok.SneakyThrows;
import ua.crud.microservice.api.dao.ExcursionDao;
import ua.crud.microservice.api.entity.Excursion;
import ua.simpleservletframework.core.annotation.annotation.component.Autowired;
import ua.simpleservletframework.core.annotation.annotation.component.Service;
import ua.simpleservletframework.mvc.servlet.DispatcherServlet;

import java.util.Arrays;
import java.util.List;

@Service
public class ExcursionManageService implements ManageService<Excursion> {
    @Autowired
    private ExcursionDao dao;

    @SneakyThrows
    public void insert() {
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
                        .replaceAll("%20", " ")
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

    @SneakyThrows
    public void update() {
        StringBuilder str = new StringBuilder();
        int counter;

        while ((counter = DispatcherServlet.request.getInputStream().read()) != -1) {
            str.append((char) counter);
        }

        String[] params = str.toString().split("&");
        Object[] paramsObj = Arrays.stream(params)
                .map(s -> s.replaceAll("excursionId=", "")
                        .replaceAll("name=", "")
                        .replaceAll("category=", "")
                        .replaceAll("city=", "")
                        .replaceAll("description=", "")
                        .replaceAll("%20", " ")
                ).toArray();

        params = Arrays.copyOf(paramsObj, paramsObj.length, String[].class);

        Excursion excursion = Excursion.builder()
                .excursionId(Long.parseLong(params[0]))
                .name(params[1])
                .category(params[2])
                .city(params[3])
                .description(params[4])
                .build();

        dao.update(excursion);
    }

    @Override
    public void delete(String idStr) {
        long id = Long.parseLong(idStr);
        dao.delete(id);
    }

    @SneakyThrows
    public Excursion read(String idStr) {
        long id = Long.parseLong(idStr);
        return dao.read(id);
    }

    public List<Excursion> findAll() {
        return dao.findAll();
    }
}

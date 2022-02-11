package ua.crud.microservice.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Excursion {
    private Long excursionId;
    private String name;
    private String category;
    private String city;
    private String description;
}

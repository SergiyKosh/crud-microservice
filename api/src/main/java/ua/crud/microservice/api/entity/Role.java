package ua.crud.microservice.api.entity;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Role {
    USER("user"), ADMIN("admin");

    @Setter
    private String role;
}

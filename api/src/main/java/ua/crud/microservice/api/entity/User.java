package ua.crud.microservice.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long userId;
    private String email;
    private String username;
    private String password;
    private Role role;
}

package com.NestedCatjam.AuthenticationServer.AuthenticationServer.Registration;

import jakarta.validation.constraints.Email;
import lombok.Data;


@Data
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    @Email
    private final String email;
    private final String password;
}

package com.NestedCatjam.AuthenticationServer.AuthenticationServer.Registration;

import com.NestedCatjam.AuthenticationServer.AuthenticationServer.Repository.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@Validated
@AllArgsConstructor
public class RegistrationController {

    private UserRepository userRepository;
    private final RegistrationService registrationService;

    @PostMapping
    public String registerNewUser(@RequestBody @Valid RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}

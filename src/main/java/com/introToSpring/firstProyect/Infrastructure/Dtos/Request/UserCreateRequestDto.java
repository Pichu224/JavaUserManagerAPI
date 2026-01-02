package com.introToSpring.firstProyect.Infrastructure.Dtos.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserCreateRequestDto {
    @NotBlank
    private String username;

    @Email
    private String email;

    @NotBlank
    private String password;
}

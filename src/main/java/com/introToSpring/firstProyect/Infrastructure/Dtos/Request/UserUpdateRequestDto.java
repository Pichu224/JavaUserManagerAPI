package com.introToSpring.firstProyect.Infrastructure.Dtos.Request;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UserUpdateRequestDto {
    private String username;

    @Email
    private String email;
}

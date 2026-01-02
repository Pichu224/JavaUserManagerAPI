package com.introToSpring.firstProyect.Infrastructure.Dtos.Response;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String username;
    private String email;
}

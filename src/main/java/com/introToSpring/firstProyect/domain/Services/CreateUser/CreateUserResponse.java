package com.introToSpring.firstProyect.domain.Services.CreateUser;

import com.introToSpring.firstProyect.Infrastructure.Dtos.Response.UserResponseDto;
import com.introToSpring.firstProyect.common.mediator.Response;
import lombok.Data;

@Data
public class CreateUserResponse implements Response<CreateUserResponse> {

    UserResponseDto UserResponseDto;

    public CreateUserResponse(UserResponseDto UserResponseDto) {
        this.UserResponseDto = UserResponseDto;
    }
}

package com.introToSpring.firstProyect.domain.Services.UpdateUser;

import com.introToSpring.firstProyect.Infrastructure.Dtos.Response.UserResponseDto;
import com.introToSpring.firstProyect.common.mediator.Response;
import lombok.Data;

@Data
public class UpdateUserResponse implements Response<UpdateUserResponse> {
    UserResponseDto UserResponseDto;

    public UpdateUserResponse(UserResponseDto UserResponseDto) {
        this.UserResponseDto = UserResponseDto;
    }
}

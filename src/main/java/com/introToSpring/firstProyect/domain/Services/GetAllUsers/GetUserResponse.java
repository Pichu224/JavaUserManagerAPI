package com.introToSpring.firstProyect.domain.Services.GetAllUsers;

import com.introToSpring.firstProyect.Infrastructure.Dtos.Response.UserResponseDto;
import com.introToSpring.firstProyect.common.mediator.Response;
import lombok.Data;

@Data
public class GetUserResponse implements Response<GetUserResponse> {

    UserResponseDto UserResponseDto;

    public GetUserResponse(UserResponseDto UserResponseDto) {
        this.UserResponseDto = UserResponseDto;
    }
}

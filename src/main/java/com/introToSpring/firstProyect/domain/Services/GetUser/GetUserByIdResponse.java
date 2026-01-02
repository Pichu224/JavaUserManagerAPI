package com.introToSpring.firstProyect.domain.Services.GetUser;

import com.introToSpring.firstProyect.Infrastructure.Dtos.Response.UserResponseDto;
import com.introToSpring.firstProyect.common.mediator.Response;
import lombok.Data;

@Data
public class GetUserByIdResponse implements Response<GetUserByIdResponse> {
    UserResponseDto UserResponseDto;

    public GetUserByIdResponse(UserResponseDto UserResponseDto) {
        this.UserResponseDto = UserResponseDto;
    }
}

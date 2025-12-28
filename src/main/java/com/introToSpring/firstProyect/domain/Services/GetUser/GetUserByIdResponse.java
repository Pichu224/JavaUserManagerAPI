package com.introToSpring.firstProyect.domain.Services.GetUser;

import com.introToSpring.firstProyect.common.mediator.Response;
import com.introToSpring.firstProyect.domain.Models.User;
import lombok.Data;

@Data
public class GetUserByIdResponse implements Response<GetUserByIdResponse> {
    User user;

    public GetUserByIdResponse(User user) {
        this.user = user;
    }
}

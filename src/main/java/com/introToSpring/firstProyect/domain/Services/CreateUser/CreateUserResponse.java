package com.introToSpring.firstProyect.domain.Services.CreateUser;

import com.introToSpring.firstProyect.common.mediator.Response;
import com.introToSpring.firstProyect.domain.Models.User;
import lombok.Data;
import lombok.Getter;

@Data
public class CreateUserResponse implements Response<CreateUserResponse> {

    User user;

    public CreateUserResponse(User user) {
        this.user = user;
    }
}

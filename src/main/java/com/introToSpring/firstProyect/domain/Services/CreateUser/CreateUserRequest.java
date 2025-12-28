package com.introToSpring.firstProyect.domain.Services.CreateUser;

import com.introToSpring.firstProyect.common.mediator.Request;
import com.introToSpring.firstProyect.domain.Models.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CreateUserRequest implements Request<CreateUserResponse> {

    String name;
    String email;
    String password;

    public CreateUserRequest(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}

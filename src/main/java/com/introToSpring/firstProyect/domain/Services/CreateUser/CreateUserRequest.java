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

    String username;
    String email;
    String password;

    public CreateUserRequest(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}

package com.introToSpring.firstProyect.domain.Services.UpdateUser;

import com.introToSpring.firstProyect.common.mediator.Request;
import com.introToSpring.firstProyect.domain.Models.User;
import lombok.Getter;

@Getter
public class UpdateUserRequest implements Request<UpdateUserResponse> {
    Long id;
    String name;
    String email;

    public UpdateUserRequest(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

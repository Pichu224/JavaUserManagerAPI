package com.introToSpring.firstProyect.domain.Services.DeleteUser;

import com.introToSpring.firstProyect.common.mediator.Request;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DeleteUserRequest implements Request<DeleteUserResponse> {

    Long id;

    public DeleteUserRequest(Long id) {
        this.id = id;
    }
}

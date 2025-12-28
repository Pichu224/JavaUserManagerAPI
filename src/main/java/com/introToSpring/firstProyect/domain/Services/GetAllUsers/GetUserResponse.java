package com.introToSpring.firstProyect.domain.Services.GetAllUsers;

import com.introToSpring.firstProyect.common.mediator.Response;
import com.introToSpring.firstProyect.domain.Models.User;
import lombok.Data;

import java.util.List;
@Data
public class GetUserResponse implements Response<GetUserResponse> {

    public User user;

    public GetUserResponse(User user) {
        this.user = user;
    }
}

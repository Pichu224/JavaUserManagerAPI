package com.introToSpring.firstProyect.domain.Services.UpdateUser;

import com.introToSpring.firstProyect.common.mediator.Response;
import lombok.Data;

@Data
public class UpdateUserResponse implements Response<UpdateUserResponse> {
   Long id;
   String name;
   String email;

    public UpdateUserResponse(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

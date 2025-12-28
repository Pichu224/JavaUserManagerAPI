package com.introToSpring.firstProyect.domain.Services.GetUser;

import com.introToSpring.firstProyect.common.mediator.Request;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class GetUserByIdRequest implements Request<GetUserByIdResponse> {

    Long id;

    public GetUserByIdRequest(Long id) {
        this.id = id;
    }
}

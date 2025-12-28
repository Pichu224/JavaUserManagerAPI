package com.introToSpring.firstProyect.domain.Services.GetAllUsers;

import com.introToSpring.firstProyect.common.mediator.RequestHandler;
import com.introToSpring.firstProyect.domain.Models.User;
import com.introToSpring.firstProyect.domain.Repositories.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
@RequiredArgsConstructor
public class GetAllUsersHandler implements RequestHandler<GetAllUsersRequest, List<GetUserResponse>> {

    private final UserRepository userRepository;

    @Override
    public List<GetUserResponse> handle(GetAllUsersRequest request) {
        return userRepository.findAll().stream().map(GetUserResponse::new).toList();
    }

    @Override
    public Class<GetAllUsersRequest> getRequestType() {
        return GetAllUsersRequest.class;
    }
}

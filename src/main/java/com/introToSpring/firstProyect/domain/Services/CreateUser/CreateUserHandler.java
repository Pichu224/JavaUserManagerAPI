package com.introToSpring.firstProyect.domain.Services.CreateUser;

import com.introToSpring.firstProyect.common.mediator.RequestHandler;
import com.introToSpring.firstProyect.domain.Models.User;
import com.introToSpring.firstProyect.domain.Repositories.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Getter
@Service
@RequiredArgsConstructor
public class CreateUserHandler implements RequestHandler<CreateUserRequest, CreateUserResponse> {

    private final UserRepository userRepository;

    @Override
    public CreateUserResponse handle(CreateUserRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User(request.name, request.email,  request.password);
        userRepository.save(user);
        return new CreateUserResponse(user);
    }

    @Override
    public Class<CreateUserRequest> getRequestType() {
        return CreateUserRequest.class;
    }
}

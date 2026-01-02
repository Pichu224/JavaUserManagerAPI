package com.introToSpring.firstProyect.domain.Services.CreateUser;

import com.introToSpring.firstProyect.Infrastructure.Mapper.UserMapper;
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
    private final UserMapper userMapper;

    @Override
    public CreateUserResponse handle(CreateUserRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword()); // look x2
        user.setRole("User"); // look this in the future

        userRepository.save(user);
        return new CreateUserResponse(userMapper.toResponse(user));
    }

    @Override
    public Class<CreateUserRequest> getRequestType() {
        return CreateUserRequest.class;
    }
}

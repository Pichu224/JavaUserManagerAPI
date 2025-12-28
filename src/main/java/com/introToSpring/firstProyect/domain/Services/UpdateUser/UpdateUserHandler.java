package com.introToSpring.firstProyect.domain.Services.UpdateUser;

import com.introToSpring.firstProyect.common.mediator.RequestHandler;
import com.introToSpring.firstProyect.domain.Models.User;
import com.introToSpring.firstProyect.domain.Repositories.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class UpdateUserHandler implements RequestHandler<UpdateUserRequest, UpdateUserResponse> {

    private final UserRepository userRepository;

    @Override
    public UpdateUserResponse handle(UpdateUserRequest request) {

        User user = userRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(request.getName());
        user.setEmail(request.getEmail());

        userRepository.save(user);

        return new UpdateUserResponse(user.getId(), user.getName(), user.getEmail());
    }

    @Override
    public Class<UpdateUserRequest> getRequestType() {
        return UpdateUserRequest.class;
    }
}

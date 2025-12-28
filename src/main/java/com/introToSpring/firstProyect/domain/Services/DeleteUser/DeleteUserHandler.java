package com.introToSpring.firstProyect.domain.Services.DeleteUser;

import com.introToSpring.firstProyect.common.mediator.RequestHandler;
import com.introToSpring.firstProyect.domain.Repositories.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class DeleteUserHandler implements RequestHandler<DeleteUserRequest, DeleteUserResponse> {

    private final UserRepository userRepository;

    @Override
    public DeleteUserResponse handle(DeleteUserRequest request) {
        userRepository.deleteById(request.id);
        return new DeleteUserResponse();
    }

    @Override
    public Class<DeleteUserRequest> getRequestType() {
        return DeleteUserRequest.class;
    }
}


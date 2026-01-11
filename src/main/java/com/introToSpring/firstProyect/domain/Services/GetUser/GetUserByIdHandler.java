package com.introToSpring.firstProyect.domain.Services.GetUser;

import com.introToSpring.firstProyect.Exceptions.BussinessExceptions.UserNotFoundException;
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
public class GetUserByIdHandler implements RequestHandler<GetUserByIdRequest, GetUserByIdResponse> {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public GetUserByIdResponse handle(GetUserByIdRequest request) {
        Long requestId = request.getId();
        User user = userRepository.findById(requestId)
                .orElseThrow(() -> new UserNotFoundException(requestId));

        return new GetUserByIdResponse(userMapper.toResponse(user));
    }

    @Override
    public Class<GetUserByIdRequest> getRequestType() {
        return GetUserByIdRequest.class;
    }
}

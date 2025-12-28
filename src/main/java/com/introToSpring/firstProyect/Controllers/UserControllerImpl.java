package com.introToSpring.firstProyect.Controllers;

import com.introToSpring.firstProyect.common.mediator.Mediator;
import com.introToSpring.firstProyect.domain.Services.DeleteUser.DeleteUserRequest;
import com.introToSpring.firstProyect.domain.Services.GetAllUsers.GetAllUsersRequest;
import com.introToSpring.firstProyect.domain.Services.GetAllUsers.GetUserResponse;
import com.introToSpring.firstProyect.domain.Services.GetUser.GetUserByIdRequest;
import com.introToSpring.firstProyect.domain.Services.GetUser.GetUserByIdResponse;
import com.introToSpring.firstProyect.domain.Services.CreateUser.CreateUserRequest;
import com.introToSpring.firstProyect.domain.Services.CreateUser.CreateUserResponse;
import com.introToSpring.firstProyect.domain.Services.UpdateUser.UpdateUserRequest;
import com.introToSpring.firstProyect.domain.Services.UpdateUser.UpdateUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserControllerImpl implements UserController{

    private final Mediator mediator;

    @Override
    public ResponseEntity<CreateUserResponse> create(CreateUserRequest request) {
        CreateUserResponse response = mediator.dispatch(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<GetUserByIdResponse> getById(Long id) {
        GetUserByIdResponse response = mediator.dispatch(new GetUserByIdRequest(id));
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<List<GetUserResponse>> getAll() {
        List<GetUserResponse> response = mediator.dispatch(new GetAllUsersRequest());
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<UpdateUserResponse> update(Long id, UpdateUserRequest request) {
        UpdateUserRequest req = new UpdateUserRequest(id, request.getName(), request.getEmail());
        UpdateUserResponse response = mediator.dispatch(req);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        mediator.dispatch(new DeleteUserRequest(id));
        return ResponseEntity.ok().build();
    }
}

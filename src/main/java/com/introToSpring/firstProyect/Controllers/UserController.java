package com.introToSpring.firstProyect.Controllers;

import com.introToSpring.firstProyect.domain.Services.GetAllUsers.GetUserResponse;
import com.introToSpring.firstProyect.domain.Services.GetUser.GetUserByIdResponse;
import com.introToSpring.firstProyect.domain.Services.CreateUser.CreateUserRequest;
import com.introToSpring.firstProyect.domain.Services.CreateUser.CreateUserResponse;
import com.introToSpring.firstProyect.domain.Services.UpdateUser.UpdateUserRequest;
import com.introToSpring.firstProyect.domain.Services.UpdateUser.UpdateUserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
public interface UserController {

    @PostMapping
    ResponseEntity<CreateUserResponse> create(@RequestBody CreateUserRequest request);

    @GetMapping("/{id}")
    ResponseEntity<GetUserByIdResponse> getById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<GetUserResponse>> getAll();

    @PutMapping("/{id}")
    ResponseEntity<UpdateUserResponse> update(@PathVariable Long id, @RequestBody UpdateUserRequest request);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);
}


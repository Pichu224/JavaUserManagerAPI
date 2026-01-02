package com.introToSpring.firstProyect.Controllers;

import com.introToSpring.firstProyect.Infrastructure.Dtos.Request.UserCreateRequestDto;
import com.introToSpring.firstProyect.Infrastructure.Dtos.Request.UserUpdateRequestDto;
import com.introToSpring.firstProyect.Infrastructure.Dtos.Response.UserResponseDto;
import com.introToSpring.firstProyect.domain.Services.GetAllUsers.GetUserResponse;
import com.introToSpring.firstProyect.domain.Services.GetUser.GetUserByIdResponse;
import com.introToSpring.firstProyect.domain.Services.CreateUser.CreateUserRequest;
import com.introToSpring.firstProyect.domain.Services.CreateUser.CreateUserResponse;
import com.introToSpring.firstProyect.domain.Services.UpdateUser.UpdateUserRequest;
import com.introToSpring.firstProyect.domain.Services.UpdateUser.UpdateUserResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
public interface UserController {

    @PostMapping
    ResponseEntity<UserResponseDto> create(@Valid @RequestBody UserCreateRequestDto userCreateRequestDto);

    @GetMapping("/{id}")
    ResponseEntity<UserResponseDto> getById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<UserResponseDto>> getAll();

    @PutMapping("/{id}")
    ResponseEntity<UserResponseDto> update(@PathVariable Long id,
                                           @RequestBody UserUpdateRequestDto  userUpdateRequestDto);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);
}


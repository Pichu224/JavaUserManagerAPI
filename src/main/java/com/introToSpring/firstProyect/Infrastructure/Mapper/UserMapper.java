package com.introToSpring.firstProyect.Infrastructure.Mapper;

import com.introToSpring.firstProyect.Infrastructure.Dtos.Request.UserCreateRequestDto;
import com.introToSpring.firstProyect.Infrastructure.Dtos.Request.UserUpdateRequestDto;
import com.introToSpring.firstProyect.Infrastructure.Dtos.Response.UserResponseDto;
import com.introToSpring.firstProyect.domain.Models.User;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface UserMapper {

    @Mapping(target = "email", source = "email")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", ignore = true)
    User toEntity(UserCreateRequestDto dto);

    @Mapping(target = "email", source = "email")
    @Mapping(target = "username", source = "username")
    UserResponseDto toResponse(User entity);

    @Mapping(target = "email", source = "email")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", ignore = true)
    void updateEntity(UserUpdateRequestDto dto, @MappingTarget User entity);
}

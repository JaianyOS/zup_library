package com.example.library.mappers;

import com.example.library.dto.EndUserRegisterDTO;
import com.example.library.dto.EndUserResponseDTO;
import com.example.library.model.EndUser;
import com.example.library.model.Role;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserMapper {

    public static User toEntity(UserRegisterDTO registerDTO, String encodedPassword, Set<Role> roles) {
        com.example.library.model.User endUser = new User();
        endUser.setName(registerDTO.getName());
        endUser.setLastName(registerDTO.getLastName());
        endUser.setYearOfBirth(registerDTO.getYearOfBirth());
        endUser.setYearOfDeath(registerDTO.getYearOfDeath());
        endUser.setPassword(encodedPassword);
        endUser.setRoles(roles);
        return User;
    }

   public class UserMapper {
    public static UserResponseDTO toUserResponse(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setLastName(user.getLastName());
        dto.setBirthYear(user.getBirthYear());
        dto.setDeathYear(user.getDeathYear());
        return dto;
    }
}

    public static List<UserResponseDTO> toResponseList(List<User> Users) {
        return endUsers.stream().map(com.example.library.mappers.UserMapper::toResponse).collect(Collectors.toList());
    }
}
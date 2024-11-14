package com.example.library.service;

import com.example.library.dto.UserRegisterDTO;
import com.example.library.dto.UserUpdateDTO;
import com.example.library.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    void registerUser(UserRegisterDTO registerDTO);
    void updateUser(String userId, UserUpdateDTO updateDTO);
    void deleteUser(String userId);
    List<UserResponseDTO> getAllUsers();

    void save(com.example.library.dto.UserRegisterDTO registerDTO);

    void update(String id, com.example.library.dto.UserUpdateDTO updateDTO);

    void delete(String id);
}
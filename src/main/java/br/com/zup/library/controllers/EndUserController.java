package com.example.library.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import com.example.library.dto.UserUpdateDTO
import com.example.library.dto.UserResponseDTO
import com.example.library.service.UserService
import com.example.library.dto.UserRegisterDTO
@RestController
@RequestMapping("/api/users")
public class EndUserController {

    @Autowired
    private UserService UserService;

    @GetMapping
    public List<UserResponseDTO> getAllUsers() {

        return UserService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid com.example.library.dto.UserRegisterDTO registerDTO) {
        try {
            UserService.save(registerDTO);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", e.getMessage()));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable String id, @RequestBody @Valid UserUpdateDTO updateDTO) {
        try {
            UserService.update(id, updateDTO);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", e.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        try {
            UserService.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", e.getMessage()));
        }
    }
}
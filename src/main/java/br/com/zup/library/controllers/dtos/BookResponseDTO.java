package com.example.library.dto;

import java.util.List;

public class BookResponseDTO {

    private String id;
    private String title;
    private String description;
    private List<com.example.library.dto.UserResponseDTO> users;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<com.example.library.dto.UserResponseDTO> getUsers() {
        return users;
    }

    public void setUsers(List<com.example.library.dto.UserResponseDTO> users) {
        this.users = users;
    }
}
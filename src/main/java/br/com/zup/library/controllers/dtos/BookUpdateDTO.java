package com.example.library.dto;

import com.example.library.model.User;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class BookUpdateDTO {

    @Size(min = 3, message = "Title must be at least 3 characters")
    private String title;

    @NotNull(message = "Description cannot be null")
    private String description;

    private Set<User> users;

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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
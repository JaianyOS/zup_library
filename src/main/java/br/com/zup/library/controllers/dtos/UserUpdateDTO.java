package com.example.library.dto;

import com.example.library.model.Role;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Set;

public class UserUpdateDTO {

    @Size(min = 3, message = "Username must be at least 3 characters")
    private String username;

    @Size(min = 3, message = "Last name must be at least 3 characters")
    private String lastName;

    @Min(value = 1950, message = "Birth year must be after 1950")
    private int birthYear;

    private int deathYear;
    private String password;
    private Set<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
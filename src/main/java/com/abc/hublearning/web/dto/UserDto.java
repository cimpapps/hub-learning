package com.abc.hublearning.web.dto;

import com.abc.hublearning.enums.UserType;

import java.util.Objects;

public class UserDto {

    private Long id;
    private String username;
    private String email;
    private String name;
    private Integer role;
    private UserType typeOfUser;

    public UserType getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(UserType typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return id.equals(userDto.id) &&
                username.equals(userDto.username) &&
                email.equals(userDto.email) &&
                name.equals(userDto.name) &&
                role.equals(userDto.role) &&
                typeOfUser == userDto.typeOfUser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, name, role, typeOfUser);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", typeOfUser=" + typeOfUser +
                '}';
    }
}

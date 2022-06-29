package com.arcadeserver.restApi.dto;

public class UserDTO {

    private String id;
    private String userName;
    private String password;
    private String email;

    public UserDTO() {
    }

    public UserDTO(String id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

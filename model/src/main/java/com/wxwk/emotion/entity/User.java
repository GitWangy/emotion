package com.wxwk.emotion.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Byte valid;

    public User(Integer id, String username, String password, Byte valid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.valid = valid;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getValid() {
        return valid;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }
}
package com.bruce.puerile.login.model;

/**
 * Created by bruce on 2016/8/1.
 */
public class LoginModel extends PageMessageModel {
    public String username;
    public String password;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

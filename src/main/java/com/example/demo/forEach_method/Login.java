package com.example.demo.forEach_method;

public class Login {

    public String UserName;
    public String Password;

    public Login(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    public Boolean StrongPassword() {

        return Password.length() > 4;
    }
}

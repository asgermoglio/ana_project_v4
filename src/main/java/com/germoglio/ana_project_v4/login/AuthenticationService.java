package com.germoglio.ana_project_v4.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean isValidUserName = username.equalsIgnoreCase("ana");
        boolean isValidPassword = password.equalsIgnoreCase("dudu");

        return isValidUserName && isValidPassword;
    }
}



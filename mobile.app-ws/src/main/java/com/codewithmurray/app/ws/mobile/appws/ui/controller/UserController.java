package com.codewithmurray.app.ws.mobile.appws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController // Will  receive are http request
@RequestMapping("users") // URL Mapping/Request Mapping for users //http://localhost:example/users/
public class UserController {

    // Creating simple methods for returning users
    @GetMapping // Will bind for fulfilling the requests
    public String getUser()
    {
        return "The request for all users was requested";
    }

    // Creating the POST request
    @PostMapping
    public String createUser()
    {
        return "new user has been created";
    }

    @PutMapping
    public String updateUser()
    {
        return "users has been updated";
    }

    // Deleting a user
    @DeleteMapping
    public String deleteUser()
    {
        return "user was deleted";
    }
}

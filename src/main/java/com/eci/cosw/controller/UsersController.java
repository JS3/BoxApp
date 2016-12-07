package com.eci.cosw.controller;

import org.springframework.web.bind.annotation.*;

import java.security.*;

@RestController
public class UsersController {

    @RequestMapping("/app/user")
    public Principal user(Principal user) {
        return user;
    }
}

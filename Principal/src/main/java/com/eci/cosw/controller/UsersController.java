package com.eci.cosw.controller;

import com.eci.cosw.model.*;
import com.eci.cosw.stub.*;
import org.springframework.web.bind.annotation.*;

import java.security.*;
import org.springframework.http.*;

@RestController
public class UsersController {

    public static UsersStub usersStub = new UsersStubImpl();

    @RequestMapping("/app/user")
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestBody Usuario user) {
        usersStub.addUser(user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}

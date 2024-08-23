package com.example.hexagon.adapters.inbound.controller;

import com.example.hexagon.application.core.domain.User;
import com.example.hexagon.adapters.inbound.request.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HexagonController {

    @PostMapping("/user")
    public User saveNewUser(UserRequest user){
        return null;
    }
}

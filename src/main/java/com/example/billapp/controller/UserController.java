package com.example.billapp.controller;

import com.example.billapp.model.UserModel;
import com.example.billapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signIn")
    public RedirectView postSelectAndAddUser(UserModel user) {
        Optional<UserModel> existingUser = userService.findUser(user.getId());

        if (existingUser.isEmpty()) {
            userService.addUser(user);

        }
        return new RedirectView("/users");

    }
}

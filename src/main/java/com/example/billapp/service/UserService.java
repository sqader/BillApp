package com.example.billapp.service;

import com.example.billapp.model.UserModel;
import com.example.billapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public void addUser(UserModel user) {
        userRepository.save(user);
    }

    public Optional<UserModel> findUser(Long id) {
        return userRepository.findById(id);
    }
}

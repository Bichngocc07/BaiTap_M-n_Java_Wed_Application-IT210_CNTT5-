package org.example.session05.service;

import org.example.session05.model.User;
import org.example.session05.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll()
    {
        return userRepository.users;
    }

}

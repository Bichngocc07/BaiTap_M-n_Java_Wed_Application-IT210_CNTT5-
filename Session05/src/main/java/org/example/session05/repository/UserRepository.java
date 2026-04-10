package org.example.session05.repository;

import org.example.session05.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> users;

    public UserRepository(List<User> users) {
        users = new ArrayList<>();
        users.add(new User(1,"Nguyen Van A" ,"ngye@gmail.com",18,"abc","123","abc"));

    }
}

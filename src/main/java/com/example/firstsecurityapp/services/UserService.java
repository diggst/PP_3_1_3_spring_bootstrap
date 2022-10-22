package com.example.firstsecurityapp.services;

import com.example.firstsecurityapp.model.Role;
import com.example.firstsecurityapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> index();

    void saveUser(User newUser);

    void deleteUser(long id);

    void updateUser(User updUser);

    User getUser(long id);

    Optional<User> findByUsername(String username);

    List<Role> listRoles();
}
